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
        System.out.println("Enter a unique port number: ");
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        port = Integer.parseInt(inputReader.readLine());

        ServerSocket serverSocket = new ServerSocket(port);
        ServerSocket serverSocket2 = new ServerSocket(9002);

        System.out.println("Waiting for client ");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");

        System.out.println("Waiting for client 2");
        Socket socket2 = serverSocket2.accept();
        System.out.println("Client 2 connected");

        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter socketWriter = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader socket2Reader = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
        PrintWriter socket2Writer = new PrintWriter(socket2.getOutputStream(), true);


        float num = Float.parseFloat(socketReader.readLine());
        socketWriter.println("Server says: " + num * 2);

        float num2 = Float.parseFloat(socket2Reader.readLine());
        socket2Writer.println("Server says: " + num2 * 3);



        //Close IO
        serverSocket.close();
        socket.close();
        socketReader.close();
        socketWriter.close();
    }
}