package JavaCodingInterview;

public class MaxAndMinElementsinArray {

    public static void main(String[] args){

        int [] a={50,30,40,20,60};

        //assume the first index is the max
        //then compare each number to the max, if its greater than max, make it the max
        int max=a[0]; //50

        for(int x=1;x<=a.length-1;x++){

            if(a[x]>max)  //30>50
            {
                max=a[x];
            }


        }
        System.out.println("Maximum element in array is: "+ max);

        //min

        int min=a[0];

        for(int j = 1;j<=a.length-1;j++){
            if(a[j]<min){
                min=a[j];
            }
        }
        System.out.println("Minimum element in array is: "+ min);
    }
}
