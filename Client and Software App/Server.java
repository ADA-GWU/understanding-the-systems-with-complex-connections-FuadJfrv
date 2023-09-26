import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    static int port = 9000;
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a 9001, 9002: ");
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        port = Integer.parseInt(inputReader.readLine());

        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("Waiting for client ");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");


        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter socketWriter = new PrintWriter(socket.getOutputStream(), true);


        float num = Float.parseFloat(socketReader.readLine());
        socketWriter.println("Server says: " + num * 2);


        //Close IO
        serverSocket.close();
        socket.close();
        socketReader.close();
        socketWriter.close();
    }
}