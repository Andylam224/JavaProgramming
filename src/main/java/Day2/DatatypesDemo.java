package Day2;

public class DatatypesDemo {

    public static void main(String[] args){

        //Numeric data types
        int a=100, b=200; //same data types
        System.out.println("the value of a is "+a);
        System.out.println("the value of b is "+b);
        System.out.println("the sum of a and b is "+a+b);//getting 100200 instead of 300, its bc of string concatenation
        System.out.println("the sum of a and b is "+(a+b)); //for it to be 300, add the parethesis

        byte by=125;
        System.out.println(by);

        short sh=3535;
        System.out.println(sh);

        long l=2342343244244l; ///need to add 'L' (uppercase or lowercase) literal after, this is mandatory
        System.out.println(l);


        //decimal numbers: float (7 decimals digits) and double (15 decimals digits)
        float item_price=15.5f;  //need to add 'F' (uppercase or lowercase) /literal after, this is mandatory
        System.out.println(item_price);

        double dbl=1234.434314443342;
        System.out.println(dbl);

        //char
        char c='A';
        System.out.println(c);

        String name="john";
        System.out.println(name);

        //char ch='ABC'; //invalid, can't hold multiple characters
        //String ch='ABC'; //invalid, its single quotes
        //String ch='A'; //invlaid, singel quotation
        String ch="S";   //valid, it is s string with a single character

        //boolean true or false
        boolean bo=true;
        System.out.println(bo);

        //boolean b1="true"; //invalid
        //boolean b1="false";   invalid

        //String bl=true;  invalid

        //constant variable
        final int x=100;


















    }

}
