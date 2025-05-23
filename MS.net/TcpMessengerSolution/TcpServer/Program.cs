using System;
using System.IO;
using System.Net;
using System.Net.Sockets;
using System.Text;

class TcpServer
{
    static void Main()
    {
        TcpListener server = new TcpListener(IPAddress.Any, 5000);
        server.Start();
        Console.WriteLine("TCP Server started. Waiting for client...");

        TcpClient client = server.AcceptTcpClient();
        Console.WriteLine("Client connected!");

        NetworkStream stream = client.GetStream();
        StreamReader reader = new StreamReader(stream, Encoding.UTF8);
        StreamWriter writer = new StreamWriter(stream, Encoding.UTF8) { AutoFlush = true };

        using (StreamWriter log = new StreamWriter("server_chatlog.txt", true))
        {
            while (true)
            {
                string clientMessage = reader.ReadLine();
                if (clientMessage == null) break;

                Console.WriteLine("Client: " + clientMessage);
                log.WriteLine($"Client: {clientMessage}");

                Console.Write("You: ");
                string reply = Console.ReadLine();
                writer.WriteLine(reply);
                log.WriteLine($"Server: {reply}");
            }
        }

        client.Close();
        server.Stop();
    }
}
