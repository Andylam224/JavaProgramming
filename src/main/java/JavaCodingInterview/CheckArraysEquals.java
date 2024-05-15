package JavaCodingInterview;

import java.util.Arrays;

public class CheckArraysEquals {

    public static void main(String[] args){

        int [] a1={1,2,3,4,5,10};
        int [] a2={1,2,3,4,5};

        //approach 1
        //Using Arrays method
        boolean status= Arrays.equals(a1,a2);

        if(status==true){
            System.out.println("Arrays are Equal");

        }else{
            System.out.println("Arrays are not Equal");
        }

        //approach 2
        //first check if length of both arrays are the same
        boolean status2=true;
        if(a1.length == a2.length){
            //compare rest of elements

            for(int j=0;j<a1.length;j++){
                if(a1[j]!=a2[j]){
                    status2=false;
                }
            }

        }else
        {

            status2=false;
        }
        if(status==true){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are NOT equal");
        }
    }

}
