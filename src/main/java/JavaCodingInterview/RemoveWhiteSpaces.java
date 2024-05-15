package JavaCodingInterview;

public class RemoveWhiteSpaces {



    public static void main(String[] args){
        String str="Java programming     selenium   automation";

        //regular expression

     str=   str.replaceAll("\\s","");
        System.out.println(str);
    }



}
