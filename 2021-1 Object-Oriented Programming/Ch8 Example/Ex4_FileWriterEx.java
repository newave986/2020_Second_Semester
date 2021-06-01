// Scanner을 이용하여 키보드에서 입력받은 데이터를 c:\Temp\test.txt 파일에 저장하는 프로그램을 작성.

import java.util.Scanner;
import java.io.*;

public class Ex4_FileWriterEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        FileWriter fout = null;
        // int c;
        try {
            fout = new FileWriter("c:\\Temp\\test.txt");
            while(true) {
                String line = s.nextLine();
                if(line.length() == 0) break;
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0, 2);
            }
            fout.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
        s.close();
    }
}
