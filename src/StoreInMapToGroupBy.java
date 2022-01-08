import java.util.HashMap;
import java.util.Map;

public class StoreInMapToGroupBy{
    public static Map<String,Double> map = new HashMap<>();

    public static void storeInMap(){

        //starting time
        long start = System.currentTimeMillis();

        //Task
        for (int i = 0; i < ReadInputs.noOfLines; i++) {
            if(ReadInputs.region[i]==null){
                System.out.println("------------------------------------>>>>>>>>>>>>>>>>>here one region value is null");
                break;
            }
            String str = ReadInputs.region[i]+" "+ReadInputs.country[i];
            double count = map.getOrDefault(str,0.0);
            map.put(str,count+ReadInputs.result[i]);
        }

        //ending time
        long end = System.currentTimeMillis();
        System.out.println("Running StoreInMapToGroupBy takes: " + (end - start) + "ms");



    }
}
