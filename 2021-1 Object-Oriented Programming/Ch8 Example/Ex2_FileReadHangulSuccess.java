// InputStreamReader 이용하여 Ms949 문자 집합으로 한글 텍스트 파일을 읽고 출력.

import java.io.*;

public class Ex2_FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("c:\\Temp\\hangul.txt");
            in = new InputStreamReader(fin, "UTF-8");
            // 수업 예시에서는 MS949 이용하였으나 내 경우에는 작동하지 않아서 UTF-8로 인코딩함
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
