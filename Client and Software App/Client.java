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
        sockets.add(new Socket("localhost", 9001));
        sockets.add(new Socket("localhost", 9002));
        sockets.add(new Socket("localhost", 9003));

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.println("Enter a number: ");

            float num = Float.parseFloat(inputReader.readLine());

            Integer socketIndex = ThreadLocalRandom.current().nextInt(0, sockets.size());

            CallServer(socketIndex, num);
        }
    }

    private static void CallServer(Integer socketIndex, Float numberToDouble) throws IOException
    {
        PrintWriter socketWriter = new PrintWriter(sockets.get(socketIndex).getOutputStream(), true);

        socketWriter.println(numberToDouble);
    }

}