using System;
using System.IO;
using System.Net.Sockets;
using System.Text;

class TcpClientApp
{
    static void Main()
    {
        TcpClient client = new TcpClient("127.0.0.1", 5000); // Connect to localhost
        Console.WriteLine("Connected to TCP Server.");

        NetworkStream stream = client.GetStream();
        StreamReader reader = new StreamReader(stream, Encoding.UTF8);
        StreamWriter writer = new StreamWriter(stream, Encoding.UTF8) { AutoFlush = true };

        while (true)
        {
            Console.Write("You: ");
            string message = Console.ReadLine();
            writer.WriteLine(message);

            string serverMessage = reader.ReadLine();
            Console.WriteLine("Server: " + serverMessage);
        }
    }
}
