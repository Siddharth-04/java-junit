package bridgelabz.basicProblemstest;

import bridgelabz.basicJunitTest.FileProcessor;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.io.File;

public class FileProcessorTest {
    FileProcessor fp = new FileProcessor();

    @Test
    public void checkFileWriter(){
        File file = new File("D:\\8th sem\\bridgelabz.workspace\\junit-testing\\File.txt");
        fp.writeToFile("File.txt","This is a test");
        assertTrue(file.exists());
    }

    @Test
    public void readFileTest(){
        String s = fp.readFromFile("File.txt");
        assertEquals(s,"This is a test");
    }
}
