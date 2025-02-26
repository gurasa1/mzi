package gameorebatest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n=scanner.nextInt();
        while(n>0){
            arr.add(scanner.nextInt());
            n--;
        }
        int k=scanner.nextInt();
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                }else{
                    if (o2>o1){
                        return 1;
                    }else{
                        return 0;
                    }
                }
            }
        });
        System.out.println(arr.get(k-1));

        for(int i=0; i<k; i++){
            System.out.println("bleng");
            int f=arr.size();
            for(int j=0; j<f-1; j++){
                arr.add(j+arr.get(j+1));

            }
            for(int j=0; j<arr.size(); j++){
                System.out.println(arr.get(j));
            }
        }


    }
}
