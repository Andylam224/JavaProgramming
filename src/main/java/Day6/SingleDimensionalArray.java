package Day6;

public class SingleDimensionalArray {


    public static void main(String[] args){

        //declare an array two ways

        /*
        1. Declare an array
        2. add values into array
        3. find size of an array
        4. read single value from an array
        5. read multiple values from an array
         */

        //approach 1
        //declaration
        //this is fixed
        int[] a=new int[5];

        //assignment
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        //approach 2


        int b[]={100,200,300,400,500};
        System.out.println(b.length);

        //read single values from an array
        System.out.println(a[4]); //here 4 is index


        //read multiple values from an array via looping statement
        for(int x=0;x<=a.length-1;x++){
            System.out.println(a[x]);
        }

        //for each
        for (int c:a){
            System.out.println(c);
        }


        /*
        Two dimensional array
        
         */




    }


}
