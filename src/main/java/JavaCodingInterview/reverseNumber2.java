package JavaCodingInterview;

public class reverseNumber2 {

    public static void main(String[] args){

       //initializes variables, the number and the reverse number
        int num=1234;
        int rev=0;


        //while loop
        while(num!=0){
            rev=rev * 10 + num %10;
            num = num / 10;

        }
        System.out.println(rev);
    }
}
