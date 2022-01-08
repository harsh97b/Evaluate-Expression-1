import java.util.concurrent.*;

public class App {
    public static void main(String[] args) {

        //starting time
        long startOfProgram = System.currentTimeMillis();

        long start=0, end=0;
        String expr = "a1+a2+a3+a4";

        System.out.println("---------------------------------Proceeding to the ReadInputs------------------------------------");


        //measuring time to read inputs
        //starting time
        start = System.currentTimeMillis();

        //Task
        ReadInputs ri = new ReadInputs(expr);
        ReadInputs.readInputs();

        //ending time
        end = System.currentTimeMillis();
        System.out.println("Running ReadInputs takes: " + (end - start) + "ms");

        System.out.println("-------------------------Proceeding to the StoreInArray and Evaluating---------------------------");


        int k = ReadInputs.noOfLines;
        StoreInArray.doIt(0,k-1);


        System.out.println("-----------------------------Proceeding to the StoreInMapToGroupBy-------------------------------");

        StoreInMapToGroupBy.storeInMap();

        System.out.println("-------------------------------Proceeding to the PrintResult------------------------------------");

        PrintResult.printResult();

        //ending time
        long endOfProgram = System.currentTimeMillis();
        System.out.println("-------------------------------< Whole program took: " + (endOfProgram - startOfProgram) + "ms >-----------------------------------");

    }
}
