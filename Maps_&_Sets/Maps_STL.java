import java.util.HashMap;

public class Maps_STL {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 25); map.put("Abhinav", 35);
        map.put("Alankrita", 20); map.put("Shra", 20);
        // for(String key : map.keySet()){
        //     System.out.println(key+ " "+map.get(key));
        // }

        System.out.println(map+" "+map.size());
        System.out.println(map.containsKey("Raghav"));
        System.out.println(map.remove("Raghav"));
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Abhinav"));
        map.put("Deepika", 20);
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Shra"));

    }
}
