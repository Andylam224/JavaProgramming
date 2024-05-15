package Day5;

public class ReverseANumber {


    public static void main(String[]args){
        //reverse a number (% / = operators)
        //input 1234
        //output 4321

        int input=1234;
        int reverseNum=0;
        //get last digit # then remove the digit from input
        //to capture the last number, use %
        //to remove the last number, use /

        while(input !=0){
            //get last digit from input
            int digit=input %10;
            reverseNum=reverseNum*10 +digit;

            //remove the last digit from input
            input/=10;

        }

    }
}
