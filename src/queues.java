import java.util.*;
import java.io.*;

public class queues {
    public static void main(String args[])
    {
        System.out.print("What is the size of your array?: ");
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();

        int arr[] = new int[num];
        String filePath = "C:\\Users\\jcbre\\Code\\queues\\src\\in.txt";

        /*
        ***** addtional modularity******
        * **************************
        * System.out.print("What is the file path?: ");
        * String filePath = cin.nextString();
        */
        cin.close();

        que q = new que(num, filePath);

        //q.print();

        //**************test************


    }
}
