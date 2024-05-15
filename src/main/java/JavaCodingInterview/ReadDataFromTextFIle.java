package JavaCodingInterview;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFIle {


    public static void main(String[] args) throws IOException {
        //Approach1: using Filereader  Bufferreader

        //creaate filereader object
        FileReader fr=new FileReader("C:\\Users\\Andyl\\Documents\\SeleniumPractice\\Test.txt");
//        System.out.println(new File(".").getAbsolutePath());
//        System.out.println(System.getProperty("user.dir"));
        File file = new File(".");
        for(String fileNames : file.list()) System.out.println(fileNames);
        //next step, create BufferReader object, need to pass file to BufferReader
        BufferedReader br=new BufferedReader(fr);

        String str;

        //write loop statement, while loop preferred if you dont know the size
        //br.readLine() reads the first line
        while((str=br.readLine())!= null)
        {
            System.out.println(str);
        }
        //close BufferReader
        br.close();

        //approach 2: using scanner & file

        File file2=new File("C:\\Users\\Andyl\\Documents\\SeleniumPractice\\Test.txt");
        Scanner sc=new Scanner(file2);
        //loop statement

        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

        //approach 3
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());


    }
}



