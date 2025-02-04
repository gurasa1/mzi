package ARRAYHW;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        ArrayList<Basket> players = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Basket p1 = new Basket("nika","gurasashvili",20,15,10,12);
        Basket p2 = new Basket("luka","kapanadze",23,12,9,10);
        Basket p3 = new Basket("vaja","tepnadze",15,19,4,22);
        Student s1= new Student("nika","gurasashvili","24 january", 80);
        Student s2= new Student("luka","kapanadze","16 november", 74);
        Student s3= new Student("vaja","tepnadze","21 october", 83);
        players.add(p1);
        players.add(p2);
        players.add(p3);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        players.sort(new Comparator<Basket>() {
            @Override
            public int compare(Basket o1, Basket o2) {
                return Double.compare(o1.total,o2.total);
            }
        });
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("Tesla","Model S",2021,28000,"Electric",0);
        Car car2 = new Car("Mercedes","E53",2022,32000,"Petrol",6);
        Car car3 = new Car("BMW","M4",2018,82700,"Petrol",6);
        for (Car car : cars){
            car.toString();
        }
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Double.compare(o1.year,o2.year);
            }
        });
        for (Car car : cars){
            car.toString();
        }
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return  Double.compare(o1.engine.cylinders,o2.engine.cylinders);
            }
        });
        for (Car car : cars){
            car.toString();
        }
        for(Basket p : players){
            System.out.println(p.name+ " " +p.lname+"s total points: "+ p.total);
        }
        players.sort(new Comparator<Basket>() {
            @Override
            public int compare(Basket o1, Basket o2) {
                return Double.compare(o2.total,o1.total);
            }
        });
        for(Basket p : players){
            System.out.println(p.name+ " " +p.lname+"s total points: "+ p.total);
        }
        for(Student s: students){
            s.Displayinfo();
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for(Student s: students){
            s.Displayinfo();
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.avrg,o2.avrg);
            }
        });
        for(Student s: students){
            s.Displayinfo();
        }
    }
}
class Basket{
    String name;
    String lname;
    int scored;
    int pass;
    int block;
    int lost;
    double total;
    Basket(String name, String lname, int score, int pass, int block, int lost){
        this.name=name;
        this.lname=lname;
        this.scored=score;
        this.pass=pass;
        this.block=block;
        this.lost=lost;
        total=scored*1+pass*1.5+block*2-lost*2;
    }
}
class Student{
    String name;
    String lname;
    String birthdate;
    double avrg;

    public Student( String name, String lname, String birthdate, double avrg) {
        this.birthdate = birthdate;
        this.name = name;
        this.lname = lname;
        this.avrg= avrg;
    }
    void Displayinfo(){
        System.out.println("Name: "+ name +"\nLastname: "+ lname + "\nBirthdate: "+birthdate+"\nAverage point: ");
    }
}

class Car{
    String brand;
    String model;
    int year;
    int mileage;
    String fuel;
    int cylinder;
    public Car(String brand, String model, int year, int mileage,String fuel, int cylinder) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.fuel=fuel;
        this.cylinder=cylinder;
    }
    Engine engine = new Engine(fuel,cylinder);
    class Engine{
        String fuel;
        int cylinders;

         Engine(String fuel, int cylinders) {
            this.fuel = fuel;
            this.cylinders = cylinders;
        }
        @Override
        public String toString() {
            return "Engine{" +
                    "fuel='" + fuel + '\'' +
                    ", cylinders=" + cylinders +
                    '}';
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}' + engine.toString();
    }
}