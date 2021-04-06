/* 
04-04.

제목과 저자를 나타내는 title, author 필드를 가진 Book 클래스 작성.
생성자를 작성하여 필드 초기화하기.
*/

public class E4_Book {
    String title;
    String author;

    public E4_Book() {
        title = "Java Programming";
        author = "IDK! LOL";
    }

    public E4_Book(String t) {
        title = t; author = "unknown";
    }
    
    public E4_Book(String t, String a) {
        title = t; author = a;
    }

    public static void main(String[] args) {
        E4_Book littlePrince = new E4_Book("Little Prince", "Saint Exupery");
        E4_Book loveStory = new E4_Book("Chunhyangjeon");
        E4_Book book = new E4_Book();
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
        System.out.println(book.title + " " + book.author);
    }
}

