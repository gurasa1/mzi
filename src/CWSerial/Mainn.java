package CWSerial;

import CWSerial.Library;

import java.awt.print.Book;
import java.io.*;
import java.util.Scanner;

public class Mainn{
    public static void main(String[] args) {
        Library book1 = new Library("001","The House of Mirth", "Edith Wharton", true);
        Library book2 = new Library("002","East of Eden", "John Steinbeck", true);
        Library book3 = new Library("003","The Sun Also Rises", "Ernest Hemingway", true);
        Library book4 = new Library("003","Vile Bodies", "Evelyn Waugh", true);
        try{
            System.out.println("input a choice\n1.Save current library information\n2.Display current library information");
            Scanner scanner = new Scanner(System.in);
            int choice2= scanner.nextInt();
            if(choice2==1) {
                FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\itsme\\IdeaProjects\\Project\\src\\Projectt\\out.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(book1);
                objectOutputStream.writeObject(book2);
                objectOutputStream.writeObject(book3);
                objectOutputStream.writeObject(book4);
                objectOutputStream.close();
                fileOutputStream.close();
            }else{
                if(choice2==2){
                    FileInputStream fileinput = new FileInputStream("C:\\Users\\itsme\\IdeaProjects\\Project\\src\\Projectt\\out.txt");
                    ObjectInputStream inputStream = new ObjectInputStream(fileinput);
                    for(int i=0; i<4; i++){
                        Library book = (Library) inputStream.readObject();
                        System.out.println(book.id);
                        System.out.println(book.author);
                        System.out.println(book.title);
                        book.Takebook();
                    }
                }
            }
        }catch (Exception exception) {
            System.out.println("error");
        }
    }
}

