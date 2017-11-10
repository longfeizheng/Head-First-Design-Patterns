package cn.merryyou.chapter03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created on 2017/11/7.
 *
 * @author zlf
 * @since 1.0
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (Exception e) {

        }
    }
}
