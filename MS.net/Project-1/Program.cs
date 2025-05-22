using System;
using SqlDataByteExporter.DataAccess;
using SqlDataByteExporter.FileHandlers;

namespace SqlDataByteExporter
{
    class Program
    {
        static void Main()
        {
            string connectionString = "Server=localhost;Database=Sample1;Trusted_Connection=True;";
            string filePath = "data.bin";

            var fetcher = new SqlDataFetcher(connectionString);
            var writer = new ByteFileWriter();
            var reader = new ByteFileReader();

            var employees = fetcher.GetEmployees();
            writer.WriteToFile(employees, filePath);

            Console.WriteLine("Enter how many bytes to read:");
            int bytesToRead = int.Parse(Console.ReadLine());

            reader.ReadPartial(filePath, bytesToRead);
        }
    }
}
