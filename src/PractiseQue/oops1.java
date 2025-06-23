package PractiseQue;

class Book{

    static int totalNoOfBooks;
    String title,author,isbn;

    boolean isBorrowed;
    static {
        int totalNoOfBooks=0;
    }
    {
        totalNoOfBooks++;
    }

    Book(String title, String author, String isbn) {
        this.title=title;
        this.author=author;
        this.isbn=isbn;

    }
    static int getTotalNoOfBooks() {
        return totalNoOfBooks;

    }
    public void borrowBook(){
        if (isBorrowed==true){
            System.out.println("Book has been borrowed");
        }else {


       this.isBorrowed=true;
        }

    }
    public void returnBook(){

       if (isBorrowed==true){
           this.isBorrowed=false;
           System.out.println("Book has been returned");
       }
    }
}

public class oops1 {
    public static void main(String[] args) {
        Book book = new Book("design","krishna","1");
        book.borrowBook();
        book.returnBook();
    }
}
