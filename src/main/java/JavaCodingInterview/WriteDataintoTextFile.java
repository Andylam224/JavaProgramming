package JavaCodingInterview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoTextFile {

    public static void main(String[] args) throws IOException {
            //in the fileName parameter, you can add an existing file, or you can add a new file name and it will be created
        FileWriter fw=new FileWriter("C:\\Users\\Andyl\\Documents\\SeleniumPractice\\Test123.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("Selenium with C++");
        bw.write("Selenium with Python");

        System.out.println("Finished!!");

        bw.close();

    }
}
