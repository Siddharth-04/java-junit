package bridgelabz.basicJunitTest;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor {
    public static void writeToFile(String fileName,String content){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            bw.write(content);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static String readFromFile(String fileName){
        String s = "";
        try(FileInputStream fis = new FileInputStream(fileName)){
            int data;

            while((data = fis.read()) != -1){
                s += (char)data;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        return s;
    }
}
