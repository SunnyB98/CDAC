using System;
using System.Net;
using System.Net.Sockets;
using System.Text;

class UdpServer
{
    static void Main()
    {
        UdpClient server = new UdpClient(6000); // Server listens on port 6000
        IPEndPoint remoteEP = new IPEndPoint(IPAddress.Any, 0);

        Console.WriteLine("UDP Server started. Waiting for messages...");

        while (true)
        {
            byte[] receivedData = server.Receive(ref remoteEP);
            string receivedMessage = Encoding.UTF8.GetString(receivedData);
            Console.WriteLine("Client: " + receivedMessage);

            Console.Write("You: ");
            string reply = Console.ReadLine();
            byte[] sendData = Encoding.UTF8.GetBytes(reply);
            server.Send(sendData, sendData.Length, remoteEP);
        }
    }
}
