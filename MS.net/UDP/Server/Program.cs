using System;
using System.Net;
using System.Net.Sockets;
using System.Text;

class UdpServer
{
    static void Main()
    {
        int listenPort = 11000;
        using (UdpClient udpServer = new UdpClient(listenPort))
        {
            Console.WriteLine($"Server is listening on port {listenPort}...");
            IPEndPoint remoteEndPoint = new IPEndPoint(IPAddress.Any, 0);
            while (true)
            {
                byte[] receivedBytes = udpServer.Receive(ref remoteEndPoint);
                string receivedData = Encoding.UTF8.GetString(receivedBytes);
                Console.WriteLine($"Received from {remoteEndPoint}: {receivedData}");
            }
        }
    }
}
