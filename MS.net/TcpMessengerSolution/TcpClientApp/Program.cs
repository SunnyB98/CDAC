using System;
using System.IO;
using System.Net.Sockets;
using System.Text;
using Serilog;

class TcpClientApp
{
    static void Main()
    {
        Log.Logger = new LoggerConfiguration()
            .WriteTo.Console()
            .WriteTo.File("Logs/client_log.txt", rollingInterval: RollingInterval.Day)
            .CreateLogger();

        Log.Information("Connecting to server...");

        TcpClient client = new TcpClient("127.0.0.1", 5000);
        Log.Information("Connected to server.");

        NetworkStream stream = client.GetStream();
        StreamReader reader = new StreamReader(stream, Encoding.UTF8);
        StreamWriter writer = new StreamWriter(stream, Encoding.UTF8) { AutoFlush = true };

        while (true)
        {
            Console.Write("You: ");
            string message = Console.ReadLine();
            writer.WriteLine(message);
            Log.Information("Client: {Message}", message);

            string serverMessage = reader.ReadLine();
            Log.Information("Server: {ServerMessage}", serverMessage);
            Console.WriteLine("Server: " + serverMessage);
        }

        client.Close();
    }
}
