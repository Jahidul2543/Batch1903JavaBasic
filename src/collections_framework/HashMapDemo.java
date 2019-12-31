package collections_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        storeStudnetNameWithIdInMap();
    }



    public static Map<Integer, String> storeStudnetNameWithIdInMap(){

        /**
         * In  HashMap key value can be null
         * Does not maintain order
         * */

        // 190301 --> Rupam
        // 190302 --> Ahad
        // 190303 --> Farhan

        Map<Integer, String> studnetInfoHashMap = new HashMap<>();

        studnetInfoHashMap.put(190301, "Rupam");
        studnetInfoHashMap.put(190302, "Ahad");
        studnetInfoHashMap.put(190303, "Farhan");
        studnetInfoHashMap.put(190304, null);
        studnetInfoHashMap.put(null, "Saman");

       System.out.println(studnetInfoHashMap.get(190302));

       return studnetInfoHashMap;

    }
    public static void retriveDataFromHashMapUsingForEach(){

        Map<Integer, String> mapToRead = storeStudnetNameWithIdInMap();

        for(Map.Entry<Integer, String> entry: mapToRead.entrySet()){
            //entry.getKey();
            //entry.getValue();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());

            // Get value form this range only 190301-190304
            if(entry.getKey()>190301 && entry.getKey()<190304){

                System.out.println("Key: " + entry.getKey());
                System.out.println("Value: " + entry.getValue());

            }

        }
    }
    public static void retriveDataFromRangeOfKeyFromHashMapUsingForEach(){

        Map<Integer, String> mapToRead = storeStudnetNameWithIdInMap();

        for(Map.Entry<Integer, String> entry: mapToRead.entrySet()){

            // Get value form this range only 190301-190304
            if(entry.getKey()>190301 && entry.getKey()<190304){

                System.out.println("Key: " + entry.getKey());
                System.out.println("Value: " + entry.getValue());

            }

        }
    }

}
