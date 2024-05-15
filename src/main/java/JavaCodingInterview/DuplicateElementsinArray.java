package JavaCodingInterview;

import java.util.HashSet;

public class DuplicateElementsinArray {

    public static void main(String[] args) {

        String[] arr = {"java", "C", "C++", "Python", "Java"};

        /*
        write logic:
        Take first element and compare it with each and every element in the list
        and if you found that it is equal, found a duplicate
        if not go to the next element and then check it with the rest of the elements

         */

        //Approach 1
        //for loop
        boolean flag = false;
        for (int x = 0; x <= arr.length - 1; x++) {
            for (int j = 1 + x; j <= arr.length - 1; j++) {

                //create inner loop
                if (arr[x] == arr[j]) {
                    System.out.println("Found duplicate:" + arr[x]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Duplicate element not found");
        }

        //approach 2 using hashset
        HashSet<String> langs = new HashSet<>();
        //not allowed duplicate values
        //only unique values
        //unordered and can't access elements by their index
//       System.out.println(langs.add("Java")); //returns true
//      System.out.println(langs.add("Python")); //true
//       System.out.println(langs.add("Java")); //false bc this value is already there

        String[] arr2 = {"java", "C", "C++", "Python", "java"};
        //enhanced for loop with set
        //add the arr2 values into the hashset
        boolean flag2 = false;
        for (String l : arr2) {
            if (langs.add(l) == false) {
                System.out.println("Found duplicate element: " + l);
                flag2 = true;
            }
            //if it prints false, that means its a duplicate element
            //System.out.println(langs.add(l));
        }
        if (flag2 == false) {
            System.out.println("no duplicate elements found");
        }
    }
}
