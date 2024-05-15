package JavaCodingInterview;

public class CountNumberofDigits {

    public static void main(String [] args){

        int num=123456;
        int count=0;

        while(num>0){
            num=num/10;  //eliminate the last digit
            count++;  //then increase the count by 1
        }

        System.out.println("number of digits: "+ count);
    }
}
