using System;
using System.IO;
using System.Text;

namespace SqlDataByteExporter.FileHandlers
{
    public class ByteFileReader
    {
        public void ReadPartial(string filePath, int count, int offset = 0)
        {
            using var fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
            fs.Seek(offset, SeekOrigin.Begin);
            byte[] buffer = new byte[count];
            int bytesRead = fs.Read(buffer, 0, count);

            string output = Encoding.UTF8.GetString(buffer, 0, bytesRead);
            Console.WriteLine("Partial data from file:");
            Console.WriteLine(output);
        }
    }
}
