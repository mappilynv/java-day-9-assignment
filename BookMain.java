import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        Book prideAndPrejudice = new Book("Pride and Prejudice");
        books.add(prideAndPrejudice);
        Book nineteenEightyFour = new Book(" Nineteen Eighty Four", 300);
        books.add(nineteenEightyFour);
        Book theLittlePrince = new Book("The Little Prince", 200, 1943);
        books.add(theLittlePrince);

        System.out.println("Please enter your book title, number of pages, and its publication year");
        System.out.println("Entering nothing will stop the loop");
        while (true) {
            System.out.println("Title of the book:");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            System.out.println("How many pages?");
            int pageNum = Integer.valueOf(scanner.nextLine());
            System.out.println("What is the publication year?");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookTitle, pageNum, publicationYear));
        }

        System.out.println("What information will be printed? everything or name or publication year");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book.getBookTitle() + ", " + book.getPageNum() + " pages, " + book.getPublicationYear());
            }
        } else if (userInput.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getBookTitle());
            }
        } else if (userInput.equalsIgnoreCase("publication year")) {
            for (Book book : books) {
                System.out.println(book.getPublicationYear());
            }
        }
    }
}
