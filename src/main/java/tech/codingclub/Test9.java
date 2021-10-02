package tech.codingclub;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test9 {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Test 9 running at" + new Date().toString() + "sharp");
        Map<String, String> map = new HashMap<String, String>();
        map.put("India", "Delhi");
        map.put("China", "Beijing");
        map.put("Canada", "Ottawa");
        if (map.containsKey("India"))
            System.out.println("Capital of India is :" + map.get("India"));
        if (map.containsKey("Russia"))
            System.out.println("Capital of Russia is :" + map.get("Russia"));
        else
            System.out.println("Not in the database");
        //printing all keys
        System.out.println("Keys below:");
        for (String key : map.keySet())
            System.out.println(key);
        System.out.println("Values below");
        for (String x : map.values())
            System.out.println(x);
        System.out.println("#####################");
        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        map.remove("Canada");
        System.out.println("######################");
        for (Map.Entry<String, String> x : map.entrySet())
            System.out.println(x.getKey() + ":" + x.getValue());
    }
}
