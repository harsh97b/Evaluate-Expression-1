public class PrintResult{

    public static void printResult(){
        //starting time
        long start = System.currentTimeMillis();

        //Task
        //printing the map
        StoreInMapToGroupBy.map.forEach((key, value) -> System.out.println(key + " " + value));

        //ending time
        long end = System.currentTimeMillis();
        System.out.println("Running PrintResult takes: " + (end - start) + "ms");

    }
}