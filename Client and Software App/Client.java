import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client
{
    public static void main(String[]args)
    {
        try
        {
            Socket socket = new Socket("localhost", 9001);

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter socketWriter = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Enter a number: ");

            float num = Float.parseFloat(inputReader.readLine());
            socketWriter.println(num);

            System.out.println(socketReader.readLine());

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