package CWSerial;

import CWSerial.Student;

import java.io.*;

public class Mainn{
    public static void main(String[] args) {
        Student student = new Student("8324","nika",74.2);
        Student student2 = new Student("8325","mari",82.6);
        Student student3 = new Student("8326","luka",68);
        Student student4 = new Student("8327","demetre",84.3);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\itsme\\IdeaProjects\\Project\\src\\CWSerial\\out.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.writeObject(student2);
            objectOutputStream.writeObject(student3);
            objectOutputStream.writeObject(student4);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception exception){
            System.out.println("error");
        }

        try{
            FileInputStream fileinput = new FileInputStream("C:\\Users\\itsme\\IdeaProjects\\Project\\src\\CWSerial\\out.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileinput);
            double max =0;
            for(int i=0; i<4; i++){
                Student students = (Student) inputStream.readObject();
                System.out.println(students.id);
                System.out.println(students.name);
                System.out.println(students.grade);
                if(students.grade>max){
                    max=students.grade;
                }
            }
            System.out.println("best grade : " +max);
        }catch(Exception e){
            System.out.println("error");
        }
    }

}

