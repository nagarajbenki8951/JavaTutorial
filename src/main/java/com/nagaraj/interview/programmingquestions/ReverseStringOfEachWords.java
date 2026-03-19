package com.nagaraj.interview.programmingquestions;

public class ReverseStringOfEachWords {
    public static void main(String args[]){
        String s= "Welcome to Powerplay !";
        String str[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length; i++){
            String reversed = reverseWord(str[i]);
            sb.append(reversed).append(" ").toString().trim();
        }
        System.out.println(sb);
    }

    public static String reverseWord(String r){
        char ch[] = r.toCharArray();
        int i =0;
        int j= ch.length-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}
