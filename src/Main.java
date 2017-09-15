import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        File file = new File("C:\\folder");
        file.mkdir();

        File file2 = new File(file.getPath(),"test2.txt");
        try {
            file2.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("last modified: " + new Date(file2.lastModified()));
        System.out.println("size: "+file2.length());

//        try{
//            String line;
//            Process process = Runtime.getRuntime().exec(System.getenv("windir")+"\\system32\\"+"tasklist.exe");
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            while((line=bufferedReader.readLine())!=null){
//                System.out.println(line);
//            }
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }


    }
}
