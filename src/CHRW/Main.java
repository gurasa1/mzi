package CHRW;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<>();
//        Map<ArrayList<String>, Integer> map = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();
        Random random = new Random();
        int r=0;
        while(true){
            r=random.nextInt(50);
            arr.add(r);
            if (r==40){
                break;
            }
        }
        System.out.println("size: "+ arr.size());
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println("evens:");
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)%2==0){
                System.out.println(arr.get(i));
            }
        }
        int[] arr2 = new int[5];
        for(int i=0; i<5; i++){
            arr2[i]=random.nextInt(50);
        }
        int max=-9;
        int ind=0;
        for(int i=0; i<5; i++){
            if(arr2[i]>max){
                max=arr2[i];
                ind=i;
            }
        }
        System.out.println("max is + "+ max+" index is: "+ ind);
        arr.clear();
        for(int i=0; i<5; i++){
            arr.add(arr2[i]);
        }
        System.out.println(arr.indexOf(max));
        ArrayList<Student> stud= new ArrayList<>();
        Student student = new Student("nika","gurasashvili",80.5);
        Student student2 = new Student("luka","nugzari",79);
        Student student3 = new Student("mari","mshvildadze",67);
        Student student4 = new Student("tornike","giorgobiani",83);
        Student student5 = new Student("soso","kordzadze",61);
        stud.add(student);
        stud.add(student2);
        stud.add(student3);
        stud.add(student4);
        stud.add(student5);
        arr.clear();
        for (Student s : stud){
            arr.add((int) s.avrg);
        }
        Collections.sort(arr);
        for (int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
        int[] ar1= new int[10];
        int[] ar2= new int[10];
        int[] ar3= new int[10];
        arr.clear();
        for(int i=0; i<10; i++){
            ar1[i]=random.nextInt(50);
            ar2[i]=random.nextInt(50);
            ar3[i]=random.nextInt(50);
        }
        for(int i=0; i<10; i++){
            for(int j=i; j<10; j++){
                if (ar1[i]==ar2[j]){
                    arr.add(ar1[i]);
                }
            }
        }
        for(int i=0; i<arr.size(); i++){
            for(int j=i; j<10; j++){
                if (arr.get(i)==ar3[j]){
                    System.out.println(ar3[j]);
                }
            }
        }
        str.add("gamarjoba");
        str.add("hello");
        str.add("g123");
        str.add("hello");
        str.add("g123");
        str.add("gamarjoba");
        str.add("gamarjoba");
        map.put("gamarjoba",0);
        map.put("hello",0);
        map.put("g123",0);
        map.put("hello",0);
        map.put("g123",0);
        map.put("gamarjoba",0);
        map.put("gamarjoba",0);
        for (int i=0; i<str.size(); i++){
            map.put(str.get(i),map.get(str.get(i))+ 1);
        }
        System.out.println(map);
    }
}
class Student{
    String name;
    String lastname;
    double avrg;

    Student(String Sname,String Slastname,double Savrg){
        this.name=Sname;
        this.lastname=Slastname;
        this.avrg=Savrg;
    }

    public double avrgg(){
        return avrg;
    }
}
