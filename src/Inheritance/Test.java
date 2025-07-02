package Inheritance;

class LibraryItem{
    int itemId;
    String title;
    String author;

    public void checkOut(){
        System.out.println("Checking out");
    }
    public void returnItem(){
        System.out.println("Returning");
    }
}
class Book extends LibraryItem{
    int isbn;
}
class Magazine extends LibraryItem{
    String issueNumber;

}
class DVD extends LibraryItem{
    String duration;

}

public class Test {
    public static void main(String[] args) {

    }
}
