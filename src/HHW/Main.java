package HHW;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                int choice=scanner.nextInt();
                switch (choice) {
                    case 1:
                        Random random = new Random();
                        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\itsme\\IdeaProjects\\Project\\src\\HHW\\out.txt");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        for (int i = 0; i < 10; i++) {
                            objectOutputStream.writeObject(random.nextInt(128));
                        }
                        objectOutputStream.close();
                        fileOutputStream.close();
                        break;
                    case 2:
                        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\itsme\\IdeaProjects\\Project\\src\\HHW\\out.txt");
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                        for(int i=0; i<10; i++){
                            int temp = (int) objectInputStream.readObject();
                            System.out.println(temp);
                        }
                    case 3:
                        FileInputStream fileStream = new FileInputStream("C:\\Users\\itsme\\IdeaProjects\\Project\\src\\HHW\\Sum.txt");
                        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
                        FileOutputStream outs = new FileOutputStream("C:\\Users\\itsme\\IdeaProjects\\Project\\src\\HHW\\Sum.txt");
                        ObjectOutputStream out = new  ObjectOutputStream(outs);
                        int[] arr = new int[10];
                        int pos=0;
                        int neg=0;
                        int nol=0;
                        for(int i=0; i<10; i++){
                            int temp = (int) objectStream.readObject();
                            arr[i]=temp;
                            if(temp>0){
                                pos++;
                            } else if (temp<0) {
                                neg++;
                            }else{
                                nol++;
                            }
                        }
                        System.out.println("Positive =  "+ pos + " Negative = "+ neg + " Zero = "+nol );
                        int sum=0;
                        for(int i=0; i<10; i++){
                            out.writeObject(arr[i]);
                            sum+=arr[i];
                        }
                        out.writeObject(sum);

                }
            }
        }catch(Exception ex){
            System.out.println("error");
        }
    }
}
