using System;
using System.Net;
using System.Net.Sockets;
using System.Text;

class MulticastSender
{
    static void Main()
    {
        const int multicastPort = 5000;
        const string multicastIP = "239.0.0.222";

        using (UdpClient sender = new UdpClient())
        {
            IPEndPoint endPoint = new IPEndPoint(IPAddress.Parse(multicastIP), multicastPort);
            Console.WriteLine("Multicast Sender started. Type a message to send:");

            while (true)
            {
                string message = Console.ReadLine();
                byte[] buffer = Encoding.UTF8.GetBytes(message);
                sender.Send(buffer, buffer.Length, endPoint);
                Console.WriteLine("Sent: " + message);
            }
        }
    }
}
