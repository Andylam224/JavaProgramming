package Day4;

public class ForLoopDemo {


    public static void main(String[]args){

        //1....10 numbers

        for(int x=1;x<=10;x++){
            System.out.println(x);
        }


        //1..10 even numbers
        for(int x=2;x<=10;x+=2){
            System.out.println(x);

        }

        //1....10 numbers
        //1 odd, 2 even, etc
        for(int x=1;x<=10;x++){
            if(x%2==0){
                System.out.println(x+ " even");
            }else{
                System.out.println(x + " odd");
            }
        }
    }
}
