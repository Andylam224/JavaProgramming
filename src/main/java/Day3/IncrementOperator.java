package Day3;

public class IncrementOperator {


    public static void main(String[] args){


        // ++ is called increment operator

        //case 1
        int a=10;
        System.out.println(a); //10

        a++;  //same as a=a+1;
        System.out.println(a); //11

        //case 2
        //explaining post increment operator
        int b=10;
        int rest= b++; // so whenever you store an incremented value into a variable
        System.out.println(rest); //got 10 instead of 11 , why?
        //so the b++(which is 10) will be stored to the rest variable, which will be 10
        //BUT b variable is now 11
        //after assignment (to rest), then implementation of the incrementation happens



        //case 3 pre increment operator
        int c=10;
        int res=++c; //incrementation happens then assignment happeens
        System.out.println(res); //11
        System.out.println(c); //11




    }

}
