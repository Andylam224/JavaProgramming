package JavaCodingInterview;

public class PrimeNumber {

    public static void main(String[] args){

        /*
        Natural number > 1
        which has only 2 factors 1 and itself


         */
            int num=3;
            int count=0;

            //check if number is greater than 1
            if(num>1)
            {
             //loop statement
                // counting from 1 to the actual num, check if num is divisible to the number range
             for(int j=1;j<=num;j++)
             {
                 //if the number is divisible by j, increase the count
                 if(num % j ==0)
                 {
                     count++;
                 }
             }
             //after, the loop finishes, check if the count only has 2 factorials or not
             if (count==2){
                 System.out.println("This is prime number");
             }else{
                 System.out.println("Not prime number");
             }

            }else{
                System.out.println("Not prime number");
            }

    }
}
