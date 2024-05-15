package JavaCodingInterview;

public class ReverseEachWordinaString {

    public static void main(String[] args){

        String str="Welcome To Java";   //original string

       String [] words= str.split(" "); //spliting string into multiple words

        String reverseString="";

        for(String w:words){
            String reverseword="";
            for(int x=w.length()-1;x>=0;x--){
                reverseword=reverseword +w.charAt(x);

            }
            reverseString=reverseString+reverseword+ " "; //emocleW oT avaJ
        }
        System.out.println(reverseString);


        //approach 2 string builder

        String str2="Welcome to Java";
        String[] words2=str2.split(" ");

        String revword="";
        for(String w:words2){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            revword=revword+sb.toString()+ " ";
        }
        System.out.println(revword);
    }

}
