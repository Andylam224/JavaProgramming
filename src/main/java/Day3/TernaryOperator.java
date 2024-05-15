package Day3;

public class TernaryOperator {


    public static void main(String[] args){

        //var expression ? res1 (true):res2 (false)

        //example 1
        int a=200;
        int b=100;

        //true
        int  x=(a>b)? a:b;
        System.out.println(x);

        //false
        int  t=(a<b)? a:b;
        System.out.println(t);


        //example 2
        int g=(1==1)? 100: 200;
        System.out.println(g);

        int y=(1==2)? 200:100;
        System.out.println(y);


        //example 3
        int person_age=15;
        String eligibility=(person_age>=18)? "eligible":"not eligible";
        System.out.println(eligibility);


    }
}
