package DSA.StringConcepts;

public class Assignment1 {
    public static void main(String[] args) {
        Assignment1 obj = new Assignment1();
        String str1 = "Hello1233s" ;
//        System.out.println(  str1.length());
      //  obj.PrintCharactersOfString(str1);
       // obj.ReverseAString(str1);
        obj.VowelsAndConsonants(str1);

    }

    static void PrintCharactersOfString(String str1){
        System.out.println("Characters of String :");
        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }
    }

    static  void ReverseAString(String str1){


        char[] charArray = str1.toCharArray();

        int left = 0;
        int right = charArray.length-1;

        while (left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right]=temp;

            left++;
            right--;
        }


        System.out.println(new String(charArray));
//        String revStr="";
//        for(int i=str1.length()-1;i>=0;i--){
//                  revStr += str1.charAt(i);
//        }
//        System.out.println(revStr);
    }

    //count vowels and consonants in String
    static void VowelsAndConsonants(String str1){

        int countVowels=0;
        int countConsonant=0;

        str1 = str1.toLowerCase();
        for(int i=0;i<str1.length();i++){

           // char ch = str1.charAt(i); we can write this
            if(str1.charAt(i) >='a' && str1.charAt(i)<='z') {
                if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                    countVowels = countVowels + 1;
                } else {
                    countConsonant = countConsonant + 1;
                }
            }
        }
        System.out.println("vowels :"+countVowels +"|| consonants:"+countConsonant);
    }
}
