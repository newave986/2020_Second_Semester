// FileOutputStream 이용하여 byte[] 배열 속에 들어 있는 바이너리 값을 지정 파일에 저장.
// 바이너리 파일으로 저장되므로 메모장에서 볼 수 없음.
// Ex6에서 작성할 FileInputStream 이용하여 읽기/출력 가능.

import java.io.*;

public class Ex5_FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};
        try {
            FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
            for (int i = 0; i<b.length; i++) fout.write(b[i]);
            fout.close();
        } catch(IOException e) {
            System.out.println("지정된 경로에 저장할 수 없습니다. 경로명을 확인해 주세요.");
            return;
        }
        System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
    }
}
