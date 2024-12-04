package StringHW;

import java.util.Scanner;

public class StringHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which task");
        int choice=scanner.nextInt();
        switch(choice) {
            case 1:
                int count = 0;
                System.out.println("input a string");
                String s = scanner.nextLine();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) > '0' && s.charAt(i) < '9') {
                        count++;
                    }
                }
                System.out.println("digit count = " + count);
                break;
            case 3:
                System.out.println("Input string");
                String pal = scanner.nextLine();
                pal = scanner.nextLine();
                boolean fal = true;
                for (int i = 0; i < pal.length() / 2; i++) {
                    if (pal.charAt(i) != pal.charAt(pal.length() - i - 1)) {
                        System.out.println("Not a palyndrome");
                        fal = false;
                        break;
                    }
                }
                if (fal) {
                    System.out.println("Palyndrome");
                }
                break;
            case 4:
                System.out.println("Input 2 strings");
                String s1 = scanner.nextLine();
                s1 = scanner.nextLine();
                String s2 = scanner.nextLine();
                if (s2.contains(s1)) {
                    System.out.println("Contains");
                } else {
                    System.out.println("Doesnt contain");
                }
                break;
            case 5:
                System.out.println("Input string");
                String str = scanner.nextLine();
                str = scanner.nextLine();
                String aeiou = "aeiouAEIOU";
                String last = String.valueOf(str.charAt(str.length() - 1));
                if (aeiou.contains(last)) {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Not a vowel");
                }
            case 6:
                System.out.println("input a string");
                String first = scanner.nextLine();
                first = scanner.nextLine();
                StringBuilder sb = new StringBuilder(first);
                for (int i = 0; i < sb.length() - 1; i++) {
                    if (sb.charAt(i) == sb.charAt(i + 1)) {
                        sb.deleteCharAt(i);
                        i--;
                    }
                }
                System.out.println("fixed string: " + sb);
                break;
            case 7:
                String large=scanner.nextLine();
                large=scanner.nextLine();

                if(large.length()>10){
                    String ans= String.valueOf(large.charAt(0));
                    ans+=String.valueOf(large.length()-2);
                    ans+=String.valueOf(large.charAt(large.length()-1));
                    System.out.println(ans);
                }else{
                    System.out.println("small");
                }
        }
    }

}