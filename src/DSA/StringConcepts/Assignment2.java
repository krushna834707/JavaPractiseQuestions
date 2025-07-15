package DSA.StringConcepts;

public class Assignment2 {
    public static void main(String[] args) {

        Assignment2 obj = new Assignment2();
        String str = "hello bro , what are you doing ";
        System.out.println("Last word count is:"+ obj.countLastWordLength(str));
    }

    //count the last word length of String
    static int countLastWordLength(String str){

        int count=0;
        for (int i =str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else if(count>0){
                break;
            }
        }
        return  count;
    }
}
