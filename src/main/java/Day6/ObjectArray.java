package Day6;

public class ObjectArray {

    public static void main(String[] args){

        //how to store different type of data in an array

        Object [] a={100, 10.5,'A',"WELCOME",true};

        int b=10;
        double d=10.5;
        char c='A';
        String s="Welcome";
        boolean x=true;


        //how to iterate the object array via for each
        for(Object t:a){
            System.out.println(t);
        }

        //how to iterate the object array via for loop
        for(int h=0;h<=a.length-1;h++){
            System.out.println(a[h]);
        }

        //assignment

        //find sum of elements in array
        //a={1,2,3,4,5}
        //sum=15

        //print even and odd numbers from array
        //a={1,2,3,4,5,6}
        //even=3
        //odd=3

        //prime number

    }

}
