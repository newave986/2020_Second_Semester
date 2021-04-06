import java.util.Scanner;

public class E7_BookArray {
    public static void main(String[] args) {
        Book[] book = new Book[2];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < book.length; i++) {
            System.out.print("Title>>");
            String title = s.nextLine();
            System.out.print("Author>>");
            String author = s.nextLine();

            book[i] = new Book(title, author);
        }

        for (int i = 0; i < book.length; i++) 
            System.out.print("("+ book[i].title + "," + book[i].author + ")");
        
        s.close();
    }
}
