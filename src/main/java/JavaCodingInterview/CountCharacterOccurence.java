package JavaCodingInterview;

public class CountCharacterOccurence {

    public static void main(String[] args){

        String s="Java Programming Java oops";

        //logic count the length of the string
      int totalCount = s.length();  //total len

        int totalCount_afterRemovea=s.replace("a","").length(); //total len after removing a's

        int count=totalCount - totalCount_afterRemovea;

        System.out.println("Number occurances of a is: "+ count);
    }
}
