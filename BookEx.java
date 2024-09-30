import java.util.*;
class Book{
        String bookname, isbn,author,publisher;
        Book(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bookname , ISBN number, Author,Publisher: ");
        String name =sc.next(); 
        String ISBN_num=sc.next();
        String author=sc.next();
        String publisher=sc.next();
    }
     String getbookName(){
        return bookname;
    }

    void setisbn(String isbn){
        this.isbn = isbn;
    }
    String getisbn(){
        return isbn;
    }

    void setAuthor(String author){
        this.author = author;
    }
     String getAuthor(){
        return author;
    }
    void setPublisher(String publisher){
        this.publisher = publisher;
    }
    String getPublisher(){
        return publisher;
    }

 }
class BookEx{
    public static void main(String s[]){
      
        Book b = new Book();
        System.out.println(b.getbookName());
        System.out.println(b.getisbn());
        System.out.println(b.getAuthor());
        System.out.println(b.getPublisher());
}
