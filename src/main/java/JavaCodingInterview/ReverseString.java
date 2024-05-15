package JavaCodingInterview;

public class ReverseString {

    public static void main(String[] args){


        String s="Selenium";
        //1. Using for loop
        //create a length integer of the string
        int len=s.length(); //8

        //start for loop
        //start i from the last index which is 7 which is len-1
        //i>=0, have to include the zero index
        //use decrement
        //create string rev variable, to store the reverse string
        String rev="";
       for (int i=len-1;i>=0;i--){
            rev=rev+ s.charAt(i);

        }
       System.out.println(rev);
    }
}
