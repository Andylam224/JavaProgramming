package JavaCodingInterview;

public class RemoveJunk {

    public static void main(String[] args){

        String s="?!@#$%^%&*( latin string 012434344";

        ///string replace method and regular expression
        //this regular expression remove everything other than a-z, A-Z, and 0-9 characters
        s=s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(s);

        String s1="@#%#$@#$@# tesing #$ Selenium";
        s1=s1.replaceAll("[^a-zA-X0-9]","");
        System.out.println(s1);

    }
}
