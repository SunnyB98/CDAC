using System;
using System.Net;
using System.Net.Sockets;
using System.Text;
using Serilog;

class Program
{
    static void Main()
    {
        // Configure Serilog
        Log.Logger = new LoggerConfiguration()
            .MinimumLevel.Debug()
            .WriteTo.Console()
            .WriteTo.File("logs/client_log.txt", rollingInterval: RollingInterval.Day)
            // Optional: Send logs over UDP
            //.WriteTo.Udp("127.0.0.1", 7071)
            .CreateLogger();

        string serverIp = "127.0.0.1"; // Replace with server's IP if on a different machine
        int serverPort = 11000;

        using (UdpClient udpClient = new UdpClient())
        {
            while (true)
            {
                Console.Write("Enter message to send: ");
                string message = Console.ReadLine();
                byte[] sendBytes = Encoding.UTF8.GetBytes(message);
                udpClient.Send(sendBytes, sendBytes.Length, serverIp, serverPort);
                Log.Information("Sent message to {ServerIp}:{ServerPort} - {Message}", serverIp, serverPort, message);
            }
        }

        // Ensure to flush and close the logger
        Log.CloseAndFlush();
    }
}
