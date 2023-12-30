import org.junit.*;
import com.example.*;

import java.io.*;
import java.lang.String;
import org.apache.commons.io.input.*;
import org.apache.commons.io.IOUtils;

public class TestMain {
    @Test
    public void testPassed() {
        // Replace System.in
        InputStream stubInputStream = IOUtils.toInputStream("0\n", "UTF-8");
        System.setIn(stubInputStream);
        // Replace System.out
        ByteArrayOutputStream stubOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stubOutputStream));

        String[] emptyStringArray = new String[]{};
        Main mainClass = new Main();
        mainClass.main(emptyStringArray);
        Assert.assertEquals("Enetr the score = The grade of 0 is F\n", stubOutputStream.toString());
    }

    @Test
    public void testNumberFormatException() {
        // Replace System.in
        InputStream stubInputStream = IOUtils.toInputStream("abc\n", "UTF-8");
        System.setIn(stubInputStream);
        // Replace System.out
        ByteArrayOutputStream stubOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stubOutputStream));

        String[] emptyStringArray = new String[]{};
        Main mainClass = new Main();
        mainClass.main(emptyStringArray);
        Assert.assertEquals("Enetr the score = Not an integer!\n", stubOutputStream.toString());
    }

    @Test
    public void testIOExceptionWhenInput() {
        // Replace System.in

        InputStream stubInputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("IOException");
            }
            @Override
            public int read(byte[] b) throws IOException {
                throw new IOException("IOException");
            }
            @Override
            public int read(byte[] b, int off, int len) throws IOException {
                throw new IOException("IOException");
            }
        };
        System.setIn(stubInputStream);
        String[] emptyStringArray = new String[]{};
        Main mainClass = new Main();
        mainClass.main(emptyStringArray);
    }
}
