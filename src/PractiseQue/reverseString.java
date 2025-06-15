package PractiseQue;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        //checkPalindromeString();
        //countVowelsConsonants();
        countOccurencesOfCharacter();
    }

    public static void revereString(){

        String str ="hello rambabu";


        String str1 = "";
        for (int i = str.length()-1;i>=0;i--){
            str1 = str1+str.charAt(i);
        }
        System.out.println(str1);


    }
    public static void reverseStringUsingStringBuilder(){
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original String :"+sb);
        for(int i =0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println("Reverse of String is :"+sb);

    }

    public static void checkPalindromeString(){

        String str ="naman";
        String revStr="";
        for(int i = str.length()-1;i>=0;i--){
            revStr+=str.charAt(i);

        }
        if(revStr.equals(str)){
            System.out.println("Palindrome String ");
        }else{
            System.out.println("Not a Palindrome String");
        }
    }

    public static void countVowelsConsonants(){
        int countVowels =0;
        int countConsonants =0;

      Scanner input = new Scanner(System.in);
      System.out.println("Enter a String:");
      String str = input.nextLine();
        for(int i =str.length()-1;i>=0;i--){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                countVowels++;
            }else{
                countConsonants++;
            }

        }

        System.out.println("Vowels in String:"+countVowels);
        System.out.println("Consonants in String:"+countConsonants);

    }

    public static  void countOccurencesOfCharacter(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = input.nextLine();

        int count=0;
        int[] freq = new int[256];

        for(int i = 0;i<str.length();i++){
            char ch =  str.charAt(i);
            if(ch != ' '){
                freq[ch]++;
            }
        }

        for(int i = 0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println((char)i+":"+freq[i]);
            }
        }
    }

    public static void removeDuplicateCharacters(){

    }
}
