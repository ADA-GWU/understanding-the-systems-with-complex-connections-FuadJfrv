import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSocket = new ServerSocket(9001);

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter socketWriter = new PrintWriter(socket.getOutputStream(), true);


            float num = Float.parseFloat(socketReader.readLine());
            socketWriter.println("Server says: " + num * 2);


            serverSocket.close();
            socket.close();
            socketReader.close();
            socketWriter.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}