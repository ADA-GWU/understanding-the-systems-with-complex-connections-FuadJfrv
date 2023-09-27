import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server implements Serializable
{
    static int port = 9000;

    public static void main(String[] args) throws IOException
    {
        /*System.out.println("Enter a 9001, 9002: ");
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        port = Integer.parseInt(inputReader.readLine()); */

        System.out.println(port);
        ServerSocket serverSocket = new ServerSocket(9001);

        System.out.println("Waiting for client ");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");


        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter socketWriter = new PrintWriter(socket.getOutputStream(), true);


        float num = Float.parseFloat(socketReader.readLine());
        System.out.println(num + " doubled is: " + num * 2);


        //Close IO
        serverSocket.close();
        socket.close();
        socketReader.close();
        socketWriter.close();
    }
}