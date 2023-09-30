import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server implements Serializable
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));

        System.out.println("Waiting for client ");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected");


        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while (true) {
            float num = Float.parseFloat(socketReader.readLine());
            System.out.println(num + " doubled is: " + num * 2);
        }

        //Close IO
        //serverSocket.close();
        //socket.close();
        //socketReader.close();
    }
}