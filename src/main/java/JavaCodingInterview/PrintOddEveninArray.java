package JavaCodingInterview;

public class PrintOddEveninArray {


    public static void main(String[] args){

        int[] a= {1,2,3,4,5,6};
        //extract the even numbers

        System.out.println("Even numbers in array.......");
        for(int x=0;x<=a.length-1;x++)
        {
            if(a[x] % 2==0) //logic to find even
            {
                    System.out.println(a[x]);
            }
        }
        //extract the odd numbers
        System.out.println("Odd numbers in array.......");
        for(int x=0;x<=a.length-1;x++)
        {
            if(a[x] % 2 !=0) //logic to find odd
            {
                System.out.println(a[x]);
            }
        }

        //using enhanced for loop

        System.out.println("Even numbers in array using enhanced for loop...");
        for(int b:a)
        {
            if(b % 2 == 0){
                System.out.println(b);
            }
        }

        System.out.println("Odd numbers in array using enhanced for loop...");
        for(int b:a)
        {
            if(b % 2 != 0){
                System.out.println(b);
            }
        }


    }
}
