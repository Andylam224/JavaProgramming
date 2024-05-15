package JavaCodingInterview;

public class SumOfArray {

    public static void main(String[] args){

        int[] a={5,2,7,9,6};

        int sum=0;

        int sum2=0;

        //for loop
        for(int x=0;x<a.length;x++){  //a.length = 5
            sum+=a[x];

        }

        System.out.println("Sum of Array elements using for loop: "+ sum);

        // enhanced for loop
        for(int j:a){
            sum2+=j;

        }
        System.out.println("Sum of Array elements using enhanced loop: "+ sum2);
    }
}
