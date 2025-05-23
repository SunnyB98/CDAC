using System;
using System.IO;
using System.Net;
using System.Net.Sockets;
using System.Text;
using Serilog;

class TcpServer
{
    static void Main()
    {
        Log.Logger = new LoggerConfiguration()
            .WriteTo.Console()
            .WriteTo.File("Logs/server_log.txt", rollingInterval: RollingInterval.Day)
            .CreateLogger();

        Log.Information("Starting TCP Server...");

        TcpListener server = new TcpListener(IPAddress.Any, 5000);
        server.Start();
        Log.Information("Server started. Waiting for connection...");

        TcpClient client = server.AcceptTcpClient();
        Log.Information("Client connected.");

        NetworkStream stream = client.GetStream();
        StreamReader reader = new StreamReader(stream, Encoding.UTF8);
        StreamWriter writer = new StreamWriter(stream, Encoding.UTF8) { AutoFlush = true };

        while (true)
        {
            string clientMessage = reader.ReadLine();
            if (clientMessage == null) break;

            Log.Information("Client: {ClientMessage}", clientMessage);
            Console.Write("You: ");
            string reply = Console.ReadLine();
            writer.WriteLine(reply);
            Log.Information("Server: {Reply}", reply);
        }

        client.Close();
        server.Stop();
        Log.Information("Server stopped.");
    }
}
