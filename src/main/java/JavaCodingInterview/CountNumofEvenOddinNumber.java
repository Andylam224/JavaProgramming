package JavaCodingInterview;

public class CountNumofEvenOddinNumber {

    public static void main(String[] args){

        int num=73124;

        int even=0;
        int odd=0;

        while (num>0){
            int rem=num%10;
            if(rem %2 ==0){
                even++;
            }else{
                odd++;
            }
            num=num/10;
        }

        System.out.println("Even count is: "+ even+ " and odd count is: "+ odd);

    }
}
