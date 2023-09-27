import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Client
{
    private static ArrayList<Socket> sockets = new ArrayList<>();

    public static void main(String[]args) throws IOException
    {
        Socket socket = new Socket("localhost", 9001);
        Socket socket2 = new Socket("localhost", 9002);
        
        sockets.add(socket);
        sockets.add(socket2);

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        float num = Float.parseFloat(inputReader.readLine());

        Integer socketInd = ThreadLocalRandom.current().nextInt(0, sockets.size());

        CallServer(socketInd, num);

        socket.close();
    }

    private static void CallServer(Integer socketIndex, Float numberToDouble) throws IOException
    {
        PrintWriter socketWriter = new PrintWriter(sockets.get(socketIndex).getOutputStream(), true);

        socketWriter.println(numberToDouble);

        socketWriter.close();
    }

}