package decorator.example2;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * packageName    : decorator.example2
 * fileName       : Client
 * author         : AngryPig123
 * date           : 24. 10. 26.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 26.        AngryPig123       최초 생성
 */
@Slf4j
public class Client {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(new ByteArrayInputStream("126839SDYA(*39821jdklay98321*)&#@*9f".getBytes()));
        while ((c = in.read()) >= 0) {
            System.out.printf(String.valueOf((char) c));
        }
    }
}
