package Day6;

public class TwoDimensionalArray {

    public static void main(String[] args){

        //declaring array

        //approach 1
        int [][] a =new int[3][2];  //3 rows and 2 columns

        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;

        //approach 2
        int [][] b= {   {100,200},
                        {300,400},
                        {500,600}
                     };

        //How to find size of an array
        System.out.println("length of rows "+ a.length); //finds # of rows
        System.out.println("length of columns "+ a[0].length); //find # of columns


        //how to read single value of an array
        System.out.println(a[2][1]); //600


        //how to read all the rows and columns
        //using for loop
        //one loop increments the rows
        for(int r=0;r<a.length;r++) // 0 1 2  outer for loop or r<=a.length -1
        {
            for(int c=0;c<a[r].length;c++)  //0 1 inner for loop
            {
                System.out.println(a[r][c]+ "  ");
            }
            System.out.println();
        }

        //enhanced for loop
        for(int arr[]: a)
        {
        for(int x: arr)
        {
            System.out.println(x);
        }
        }

    }
}
