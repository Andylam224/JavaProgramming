package Day5;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            if (x == 5 || x == 3 || x == 9) {
                continue;
                //continue skips the current loop and goes to the next one
                //5 is skipped and won't be skipped
                //skip 3,5,9
            }
            System.out.println(x);
        }
    }
}
