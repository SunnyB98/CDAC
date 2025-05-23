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
            .WriteTo.File("logs/server_log.txt", rollingInterval: RollingInterval.Day)
            // Optional: Send logs over UDP
            //.WriteTo.Udp("127.0.0.1", 7071)
            .CreateLogger();

        int listenPort = 11000;
        using (UdpClient udpServer = new UdpClient(listenPort))
        {
            Log.Information("Server is listening on port {Port}", listenPort);
            IPEndPoint remoteEndPoint = new IPEndPoint(IPAddress.Any, 0);
            while (true)
            {
                byte[] receivedBytes = udpServer.Receive(ref remoteEndPoint);
                string receivedData = Encoding.UTF8.GetString(receivedBytes);
                Log.Information("Received from {RemoteEndPoint}: {Data}", remoteEndPoint, receivedData);
            }
        }

        // Ensure to flush and close the logger
        Log.CloseAndFlush();
    }
}
