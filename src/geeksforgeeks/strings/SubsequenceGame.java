package geeksforgeeks.strings;

import java.util.*;
import java.lang.*;
import java.io.*;

class SubsequenceGame {
    private static Set<String> set=new TreeSet<>();
    public static void main (String[] args) {
        Scanner p=new Scanner(System.in);

        int n=p.nextInt();
        while(n>0){
            set=new TreeSet<>();
            String s=p.next();
            subsequences(s);
            if(!set.isEmpty()){
                Iterator<String> it=set.iterator();
                while(it.hasNext()){
                    System.out.print(it.next()+" ");
                }
            }else {
                System.out.print("-1");
            }
            System.out.println();
            n--;
        }
    }

    public static void subsequences(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(checkVowel(ch)){
                for(int j=n-1;j>=i;j--){
                    if(!checkVowel(s.charAt(j))){
                        String str=s.substring(i,j+1);
                        set.add(str);


                        for(int k=1;k<str.length()-1;k++){
                            StringBuilder sbr=new StringBuilder(str);
                            sbr.deleteCharAt(k);
                            subsequences(sbr.toString());
                        }
                    }
                }
            }
        }
    }

    public static boolean checkVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;

        return false;
    }
}