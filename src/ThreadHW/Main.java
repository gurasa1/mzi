package ThreadHW;

public class Main {
    public static void main(String[] args) {
        RunThread thread1 = new RunThread();
//        thread1.run();
        CounterThread thread2 = new CounterThread();
//        thread2.run();
        for(int i=0; i<100; i++){
            new Generate().start();
        }
    }
}

class RunThread implements Runnable {
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello world");
            try {
                Thread.sleep(2000);
            }catch (Exception ex){
                System.out.println("Error");
            }
        }
    }
}

class CounterThread extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }catch (Exception ex){
                System.out.println("Error");
            }
        }
    }
}
class Generate extends Thread{
    public void run() {
        generateSecretCode(); // Calls the static method inside the run() method
    }
    public static void generateSecretCode(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println((new Object()).hashCode());
    }
}