import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client
{
    private static ArrayList<Socket> sockets = new ArrayList<>();
    //private static Socket sockets[];
    public static void main(String[]args) throws IOException
    {
        Socket socket = new Socket("localhost", 9001);
        Socket socket2 = new Socket("localhost", 9002);
        
        sockets.add(socket);
        sockets.add(socket2);

        /*BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter socketWriter = new PrintWriter(socket.getOutputStream(), true);


        System.out.println("Enter a number: ");

        float num = Float.parseFloat(inputReader.readLine());
        socketWriter.println(num);

        System.out.println(socketReader.readLine()); */


        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        float num = Float.parseFloat(inputReader.readLine());

        System.out.println("Enter a server index: ");
        Integer socketInd = Integer.parseInt(inputReader.readLine());

        CallServer(socketInd, num);

        //Close IO
        socket.close();
        //socketReader.close();
        //socketWriter.close();
    }

    private static void CallServer(Integer socketIndex, Float numberToDouble) throws IOException
    {
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(sockets.get(socketIndex).getInputStream()));
        PrintWriter socketWriter = new PrintWriter(sockets.get(socketIndex).getOutputStream(), true);

        socketWriter.println(numberToDouble);

        System.out.println(socketReader.readLine());

        socketReader.close();
        socketWriter.close();
    }

}