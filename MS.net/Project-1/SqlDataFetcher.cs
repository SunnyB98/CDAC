using System.Collections.Generic;
using System.Data.SqlClient;
using SqlDataByteExporter.Models;

namespace SqlDataByteExporter.DataAccess
{
    public class SqlDataFetcher
    {
        private readonly string connectionString;

        public SqlDataFetcher(string connStr)
        {
            this.connectionString = connStr;
        }

        public List<Employee> GetEmployees()
        {
            var employees = new List<Employee>();
            using (var conn = new SqlConnection(connectionString))
            {
                conn.Open();
                var cmd = new SqlCommand("SELECT Id, Name, Salary FROM employee2", conn);
                var reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    employees.Add(new Employee
                    {
                        Id = reader.GetInt32(0),
                        Name = reader.GetString(1),
                        Salary = reader.GetDecimal(2)
                    });
                }
            }
            return employees;
        }
    }
}
