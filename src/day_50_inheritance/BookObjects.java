package day_50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);
        
    }
}
