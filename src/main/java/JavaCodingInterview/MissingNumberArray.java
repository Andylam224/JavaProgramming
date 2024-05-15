package JavaCodingInterview;

public class MissingNumberArray {

    public static void main(String[] args){

        //Array should not have duplicates
        //Array No need to be sorted order
        //values should be in range

        //logic find the missing element
        //first find the sum of the element
        //1 + 2 + 4 + 5 = 12 sum 1

        //second find the sum of the element plus the missing element
        // 1 + 2 + 3 + 4 + 5 = 15 sum 2
        //Sum2-sum1=15-12= 3, which is the missing number
        int [] a={1,2,4,5};
        int sum1=0;
        for(int x=0;x<a.length;x++){
            sum1 = sum1 + a[x];
        }
        System.out.println("Sum of elements in array: " + sum1);

        int sum2=0;


        //range 1-5
        for(int i =1;i<=5;i++){
            sum2=sum2 + i;
        }
        System.out.println("Sum of range of elements in array: "+ sum2);
        System.out.println("Missing number is :"+ (sum2 - sum1));


    }



}
