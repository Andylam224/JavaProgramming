package JavaCodingInterview;

import java.util.HashMap;
import java.util.Map;

public class AddValuesToMap {

    public static void main(String [] args){

        //create a HashMap
        Map<String, Integer> map=new HashMap<>();

        //add values to the map
        map.put("apple",10);
        map.put("banana", 20);
        map.put("orange",30);

        //print the map
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
