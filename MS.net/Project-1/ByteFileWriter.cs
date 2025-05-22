using System.Collections.Generic;
using System.IO;
using System.Text;
using SqlDataByteExporter.Models;

namespace SqlDataByteExporter.FileHandlers
{
    public class ByteFileWriter
    {
        public void WriteToFile(List<Employee> employees, string filePath)
        {
            using var fs = new FileStream(filePath, FileMode.Create, FileAccess.Write);
            foreach (var emp in employees)
            {
                string line = $"ID:{emp.Id}, Name:{emp.Name}, Salary:{emp.Salary}\n";
                byte[] data = Encoding.UTF8.GetBytes(line);
                fs.Write(data, 0, data.Length);
            }
        }
    }
}
