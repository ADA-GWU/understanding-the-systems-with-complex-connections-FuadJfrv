import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client
{
    public static void main(String[]args) throws IOException
    {
        Socket socket = new Socket("localhost", 9001);
        Socket socket2 = new Socket("localhost", 9002);

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter socketWriter = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader socket2Reader = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
        PrintWriter socket2Writer = new PrintWriter(socket2.getOutputStream(), true);



        System.out.println("Enter a number: ");

        float num = Float.parseFloat(inputReader.readLine());
        socketWriter.println(num);

        System.out.println(socketReader.readLine());


        System.out.println("Enter a number: ");

        float num2 = Float.parseFloat(inputReader.readLine());
        socket2Writer.println(num2);

        System.out.println(socket2Reader.readLine());



        //Close IO
        socket.close();
        socket2.close();
        socketReader.close();
        socketWriter.close();
    }

}