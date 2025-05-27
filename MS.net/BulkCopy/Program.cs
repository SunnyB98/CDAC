using Microsoft.VisualBasic.FileIO;
using System;
using System.Data;
using System.Data.SqlClient;

namespace ImportCSVToSQL
{
    internal class Program
    {
        static void Main()
        {
            string csv_file_path = @"D:\Files\Emails.csv";
            DataTable csvData = GetDataTabletFromCSVFile(csv_file_path);
            InsertDataIntoSQLServerUsingSQLBulkCopy(csvData);
        }

        private static DataTable GetDataTabletFromCSVFile(string csv_file_path)
        {
            DataTable csvData = new DataTable();
            try
            {
                using (TextFieldParser csvReader = new TextFieldParser(csv_file_path))
                {
                    csvReader.SetDelimiters(new string[] { "," });
                    csvReader.HasFieldsEnclosedInQuotes = true;
                    string[] colFields = csvReader.ReadFields();
                    foreach (string column in colFields)
                    {
                        DataColumn datecolumn = new DataColumn(column);
                        datecolumn.AllowDBNull = true;
                        csvData.Columns.Add(datecolumn);
                    }
                    while (!csvReader.EndOfData)
                    {
                        string[] fieldData = csvReader.ReadFields();
                        for (int i = 0; i < fieldData.Length; i++)
                        {
                            if (string.IsNullOrWhiteSpace(fieldData[i]))
                                fieldData[i] = null;
                        }
                        csvData.Rows.Add(fieldData);
                    }
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error reading CSV: " + ex.Message);
            }
            return csvData;
        }

        public static void InsertDataIntoSQLServerUsingSQLBulkCopy(DataTable csvFileData)
        {
            using (SqlConnection dbConnection = new SqlConnection(@"Data Source=DESKTOP-EKJ1P64\SQL2019; Initial Catalog=Work; Integrated Security=SSPI;"))
            {
                dbConnection.Open();
                using (SqlBulkCopy s = new SqlBulkCopy(dbConnection))
                {
                    s.DestinationTableName = "Email";
                    foreach (DataColumn column in csvFileData.Columns)
                        s.ColumnMappings.Add(column.ColumnName, column.ColumnName);
                    s.WriteToServer(csvFileData);
                    Console.WriteLine("Data imported successfully.");
                }
            }
        }
    }
}
