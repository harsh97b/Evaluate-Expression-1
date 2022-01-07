import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;


public class StoreInArray{
    private int iterateLoopStart = 0;
    private int iterateLoopEnd = 0;
    StoreInArray(int iterateLoopStart, int iterateLoopEnd){
        this.iterateLoopStart = iterateLoopStart;
        this.iterateLoopEnd = iterateLoopEnd;
    }

    public static void doIt(int iterateLoopStart, int iterateLoopEnd) {
        long start = 0, end =0;

        //-------------------------------------------------------------------------------------------------

        if(ReadInputs.noOfLines != 0) {
            //------------------------------------------------------------------------------------------

            //starting time
            start = System.currentTimeMillis();

            //Task
            //************************************************************************************
            System.out.println("                     iterateLoopStart: "+iterateLoopStart+"        iterateLoopEnd: "+iterateLoopEnd+"    by thread: "+Thread.currentThread().getName());

            for (int i = iterateLoopStart; i <= iterateLoopEnd; i++) {
                String[] strArray = new String[6];
                int strArrayPointer = 0;
                String str = ReadInputs.stringList.get(i);
                if(str.equals(""))// if any line in input file is empty then don't do anything for it
                    continue;
                char[] c = str.toCharArray();
                for (int j = 0; j < c.length; j++) {
                    if( c[j] == ' '){
                        strArrayPointer++;
                        continue;
                    }
                    if(strArray[strArrayPointer] == null)
                        strArray[strArrayPointer] = ""+c[j];
                    else
                        strArray[strArrayPointer] += c[j];
                }
//                System.out.println("charaArray, i: "+i+"   "+ Arrays.toString(strArray));
                ReadInputs.arr1[i] = Float.parseFloat(strArray[0]);
                ReadInputs.arr2[i] = Float.parseFloat(strArray[1]);
                ReadInputs.arr3[i] = Float.parseFloat(strArray[2]);
                ReadInputs.arr4[i] = Float.parseFloat(strArray[3]);
                ReadInputs.region[i] = strArray[4];
                ReadInputs.country[i] = strArray[5];
                ReadInputs.result[i] = Evaluate.evalString(ReadInputs.expr,ReadInputs.arr1[i], ReadInputs.arr2[i],ReadInputs.arr3[i],ReadInputs.arr4[i]);
            }

            //ending time
            end = System.currentTimeMillis();
            System.out.println("         by thread: "+Thread.currentThread().getName()+ "       storing input through char array in 6 different arrays from list with "+ReadInputs.noOfLines+" size takes: " + (end - start) + "ms");
//            System.out.println("     "+start+"  "+end);
            //-------------------------------------------------------------------------------------------------
//            print();
        }
    }
    public static void print(){
        if(ReadInputs.noOfLines != 0) {
            System.out.println("i: " + "   " + Arrays.toString(ReadInputs.arr1));
            System.out.println("i: " + "   " + Arrays.toString(ReadInputs.arr2));
            System.out.println("i: " + "   " + Arrays.toString(ReadInputs.arr3));
            System.out.println("i: " + "   " + Arrays.toString(ReadInputs.arr4));
            System.out.println("i: " + "   " + Arrays.toString(ReadInputs.region));
            System.out.println("i: " + "   " + Arrays.toString(ReadInputs.country));
        }
    }
}