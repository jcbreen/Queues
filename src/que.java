import java.io.File;
import java.util.Scanner;

public class que {
    private int num;
    private int index;
    private int front;
    private int rear;
    private String fileName;
    private int arr[];

    public que(int num,String fileName) {
        arr = new int[num];
        fill(arr, fileName);
        front = 0;
        rear = arr.length-1;
    }
    private static void fill(int[] arr, String str) {
        try {
            File file = new File(str);
            Scanner inFile = new Scanner(file);
            int count = 0;
            while (inFile.hasNextInt()) {
                arr[count] = inFile.nextInt();
                count++;
            }
            inFile.close();
        } catch (Exception FileNotFoundException) {
            System.out.println("File not Found!");
        }
    }
    public void print() {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void printNum(int index){
        System.out.print(arr[index]);
    }
    public int getNum(int index) {
        return arr[index];
    }

    //dontWaste(time);
    
}
