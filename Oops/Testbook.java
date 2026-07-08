package Oops;

public class Testbook {

    public static void main(String[] args) {

        Author author = new Author("James Gosling", "james@gmail.com", 'M');

        Book book = new Book("Java Programming", author, 750.50, 20);

        System.out.println("Book Details");
        System.out.println("Book Name : " + book.getName());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity in Stock : " + book.getQtyInStock());

        System.out.println();

        System.out.println("Author Details");
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Author Email : " + book.getAuthor().getEmail());
        System.out.println("Author Gender : " + book.getAuthor().getGender());
    }
}