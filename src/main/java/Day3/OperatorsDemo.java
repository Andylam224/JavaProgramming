package Day3;

public class OperatorsDemo {

    public static void main(String [] args){

        //1. Arithmetic +,-,*,/,% works only on numeric type of data

        int a=20;
        int b=10;

        System.out.println("the sum of a and b is "+ (a + b));
        System.out.println("the diff of a and b is "+ (a - b));
        System.out.println("the product of a and b is "+ (a * b));
        System.out.println("the division/quotient of a and b is "+ (a/b));
        System.out.println("the modulo division/remainder of a and b is "+ (a % b));

        //2. Relations operators <,>,<=,>=,!=,==  used to compare the values
        //always return boolean values
        System.out.println(a>b); //true
        System.out.println(a<b); //false
        System.out.println(a>=b); //true
        System.out.println(a<=b); //false
        b=20;
        System.out.println(a>=b); //true
        System.out.println(a<=b); //true

        System.out.println(a!=b); //false
        System.out.println(a==b); //true

        boolean res=a>b;
        System.out.println(res);


        //3. Logical operators  && || !
        //return boolean values - true/false
        //*** what's the difference between relational and logical operators?
        /*
        relational operators can only be use between two variables
        and the two variable can be any data types

        BUT logical operators can use ONLY boolean data types
        works between 2 boolean values
        x && y  (y and x can be either true or false)
       AND x && y returns true if both x and y are true, besides that, it is false
       OR  x|| y return false if both x and y are false, either x and y is true, then true
       NOT !x  ,returns false ,if x is true.  return true if x is false
       NOT !y , same as one above

         */

        boolean x=true;
        boolean y=false;

        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x); //false
        System.out.println(!y); //true


        boolean b1=10>20; //false
        System.out.println(b1);

        boolean b2 =20>10; //true
        System.out.println(b2);

        System.out.println(b1 && b2); //false
        System.out.println(b1 ||b2); //true

        System.out.println((10<20) && (20>10)); //true combining relational and logical operators


        //4. Increment and decrement operators













    }
}
