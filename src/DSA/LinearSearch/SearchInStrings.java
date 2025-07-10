package DSA.LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Krushna";
        char target = 'a';

        SearchInStrings obj = new SearchInStrings();
        System.out.println( obj.FindCharacterInString(name,target));

    }

    static boolean FindCharacterInString2(String name , char c){
        for(char ch : name.toCharArray()){
            if(ch==c){
                return  true;
            }
        }
        return false;
    }

    static boolean FindCharacterInString(String name , char c){
        for(int i=0;i<name.length();i++){
            if(c==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
