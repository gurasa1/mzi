package DATACW;

import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
//        ArrayList<Integer> lst= new ArrayList<>();
//        for(int i=0; i<10; i++){
//            int t= scanner.nextInt();
//            lst.add(t);
//        }
//        int p=0;
//        while(p<lst.size()){
//            int temp=lst.get(p);
//            lst.set(p,-9999);
//            if (lst.contains(temp)){
//                lst.remove(p);
//                if(p!=0){
//                    p--;
//                }
//            }else{
//                lst.set(p, temp);
//                p++;
//            }
//        }
//        for(int i=0; i< lst.size(); i++){
//            System.out.println(lst.get(i));
//        }

        //2
//        String st1r=scanner.nextLine();
//        String str=scanner.nextLine();
//        Boolean fir=false;
//        Dictionary<Character, Boolean> st = new Hashtable<>();
//        for(int i=0; i<str.length(); i++){
//            fir=false;
//            if (st.get(str.charAt(i))==null){
//                fir=true;
//            }
//            for(int k=i+1; k<str.length()-1; k++){
//                if (str.charAt(i)==str.charAt(k)){
//                    fir=false;
//                    st.put(str.charAt(i),false);
//                    break;
//                }
//
//            }
//            if(fir){
//                System.out.println(str.charAt(i));
//                break;
//            }
//        }

        //4
//        Map<String, Integer> cnt = new Hashtable<>();
//        String sc;
//        for(int i=0; i<6; i++){
//            sc=scanner.nextLine();
//            if(cnt.get(sc)==null){
//                cnt.put(sc,1);
//            }else{
//                cnt.put(sc,cnt.get(sc)+1);
//            }
//        }
//        int max=0;
//        for(String keys : cnt.keySet()){
//            if (cnt.get(keys)>max){
//                max=cnt.get(keys);
//            }
//        }
//        for(String keys: cnt.keySet()){
//            if(cnt.get(keys)==max){
//                System.out.println(keys);
//            }
//        }

        //7
        String strr =scanner.nextLine();
        String arr[] =strr.split(" ");
        for(int i=arr.length-1; i>0; i--){
            if(arr[i].contains(" ")){
                continue;
            }else{
                System.out.println(arr[i]);
                break;
            }
        }
        //5
        String s=scanner.nextLine();
        Map<Character, Integer> count = new Hashtable<>();
        for(int i=0; i<s.length(); i++){
            if(count.get(s.charAt(i))==null){
                count.put(s.charAt(i),1);
            }else{
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
        }
        System.out.println(count);
    }
}
