public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava basicJava = new BasicJava();
    
        // print 1-255    
        basicJava.printNum();    
    
    
    //print odd 1-255        
        basicJava.printOdd();
        
    //print sum
        basicJava.printSum();




    //iterating through an array
        int[] myArray1 = new int[] {1,3,5,7,9,13};
        basicJava.iterateArray(myArray1);
            
            
            
            
    //find max
        int[] maxArray = new int[] {0, -4, 7, -9};
        basicJava.findMax(maxArray);
        
        
    //get average
        int[] avgArray = new int[] {2, 3, 10, 15};
        basicJava.getAverage(avgArray);


    //array with odd numbers
        basicJava.arrayOddNum();


    //greater than y
        int[] countArray = new int[] {1, 3, 5, 7};
        int y = 2;
        basicJava.arrayY(countArray, y);


    //square the values
        int[] arraySq = new int[] {1,5,10,-2};
        basicJava.squareValues(arraySq);


    //eliminate negative numbers
        int [] arrayNoNeg = new int[] {1,-3,5,10,-2};
        basicJava.elimNegs(arrayNoNeg);


    //max, min, average
        int[] arrayMMA = new int[] {1,5,10,-2};
        basicJava.minMaxAvg(arrayMMA);


    //shifting the values in the array
        int[] arrayShiftValues = new int[] {1,5,10,7,-2};
        basicJava.arrayShiftV(arrayShiftValues);


    }
}
