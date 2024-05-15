package Day3;

public class DecrementOperator {

    public static void main(String[] args){

        //case 1
        int a=10;
       a--; //a=a-1;
        System.out.println(a); //9


        //case 1 post decrement
        int b=100;
        int rest =b--;
        System.out.println(rest); //100
        System.out.println(b); //99

        //case 2 pre decrement
        int c=100;
        int res =--c;
        System.out.println(res); //99
        System.out.println(c); //99



    }
}
