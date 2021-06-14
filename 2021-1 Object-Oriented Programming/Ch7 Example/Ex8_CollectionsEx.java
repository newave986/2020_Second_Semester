// ex 7-8. Collections 클래스의 활용
// Collections 클래스를 활용하여 문자열 정렬, 반대열 정렬, 이진 검색 등을 실행

import java.util.*;

public class Ex8_CollectionsEx {

    static void printList(LinkedList<String> l) {
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext()) separator = "->";
            else separator = "\n";
            System.out.print(e + separator);
        }
    }
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("Transformers");
        myList.add("StarWars");
        myList.add("Matrix");
        myList.add(0, "Terminator");
        myList.add(2, "Avartar");

        Collections.sort(myList);
        printList(myList);

        Collections.reverse(myList);
        printList(myList);

        int index = Collections.binarySearch(myList, "Avarter") + 1;
        System.out.println("아바타는 " + index + " 번째 요소입니다.");

    }
}
