/*
04-10.
문제의 예제와 같이 작동하도록 Dictionary 클래스의 kor2Eng() 메소드와 DicApp 클래스를 작성.
*/

import java.util.Scanner;

class Dictionary {

    private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String[] eng = { "love", "baby", "money", "future", "hope" };

    private static String word;

    public Dictionary(String word) {
        this.word = word;
    }

    public static String kor2Eng() {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) { 
                return eng[i];
            } 
        }
        return "no";
    } // 사전에서 단어를 검색하고 출력하는 kor2Eng 메서드

    public static void show() {
        if (kor2Eng() != "no") System.out.println(word + "는 " + kor2Eng());
        else System.out.println(word + "는 저의 사전에 없습니다.");
    }
}

public class Q10_DicApp {

    private static String word;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("한영 단어 입력 프로그램입니다.");
        
        while(true) {
            System.out.print("한글 단어?");
            String word = s.next();

            if (word.equals("STOP")) break;
    
            Dictionary d = new Dictionary(word);

            d.show();
        } 

        s.close();
    }
}