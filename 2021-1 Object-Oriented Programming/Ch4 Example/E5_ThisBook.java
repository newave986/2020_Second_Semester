/*
Ex 04-05.

Book 클래스의 생성자를 this()를 이용하여 수정하기.
*/

public class E5_ThisBook {
    
    String title;
    String author;
    void show() { System.out.println(title + " " + author); }
    // 책의 제목과 저자를 print하는 method를 생성함
    // print할 때 하나하나 작성하는 것보다 훨씬 깔끔!!

    public E5_ThisBook() {
        this("",""); 
        // this() 구문은 항상! 생성자 내에 첫 번째 줄에 존재해야 함

        // 매개변수가 두 개 있는 생성자 호출
        // 생성자 내에서 다른 생성자를 호출하는 코드
        
        // Null 값이 아닌 빈칸 두 개를 이용하여
        // "빈값"을 넣어 줌!!!
        System.out.println("Constructor Called");
    }

    public E5_ThisBook(String title) {
        this(title, "Unknown");
        // 직접 안 치고 this 생성자 이용하여 넣어 줌!!
        // 매개 변수가 2개인 친구를 호출하고 있음
        // 생성자 내에서 다른 생성자를 호출하는 코드 ㅎㅎ
    }
    
    public E5_ThisBook(String title, String author) {
        this.title = title; this.author = author;
    }

    public static void main(String[] args) {
        E5_ThisBook littlePrince = new E5_ThisBook("Little Prince", "Saint Exupery");
        E5_ThisBook loveStory = new E5_ThisBook("Chunhyangjeon");
        E5_ThisBook emptyBook = new E5_ThisBook();
        loveStory.show();
        emptyBook.show();
    }
}
