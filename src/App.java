import java.util.concurrent.*;

public class App {
    public static void main(String[] args) {

        long start=0, end=0;
        String expr = "a1+a2+a3+a4";

        //measuring time to read inputs
        //starting time
        start = System.currentTimeMillis();

        //Task
        ReadInputs ri = new ReadInputs(expr);
        ReadInputs.readInputs();

        //ending time
        end = System.currentTimeMillis();
        System.out.println("Running ReadInputs takes: " + (end - start) + "ms");

        int k = ReadInputs.noOfLines;
        StoreInArray.doIt(0,k-1);

        //starting time
        start = System.currentTimeMillis();

        //Task
        StoreInMapToGroupBy.storeInMap();

        //ending time
        end = System.currentTimeMillis();
        System.out.println("Running StoreInMapToGroupBy takes: " + (end - start) + "ms");

    }
}
