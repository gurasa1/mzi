package CWSerial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainnn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number");
        int input = scanner.nextInt();
        String input2=String.valueOf(input);
        boolean pal=true;
        for(int i=0; i<input2.length()/2; i++){
            if (input2.charAt(i)!=input2.charAt(input2.length()-1-i)){
                System.out.println("not a palyndrome");
                pal=false;
            }
        }
        if(pal){
            System.out.println("Palyndrome");
        }
        List<Integer> lst = new ArrayList<>();
        for (int i=0; i<7; i++){
            int inputt= scanner.nextInt();
            lst.add(inputt);
        }
        for(int i=0; i<lst.size(); i++){
            for(int j=i+1; j<lst.size()-1; j++){
                if (lst.get(i)== lst.get(j)){
                    lst.remove(j);
                }
            }
        }
        for (int i=0; i<lst.size(); i++){
            System.out.println(lst.get(i));
        }
    }
}
