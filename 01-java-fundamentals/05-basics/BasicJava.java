import java.util.ArrayList;

public class BasicJava {

    // print 1-255

    public void printNum(){
        for (int i = 1; i <=255; i++){
            System.out.println(i);
        }
    }


    //print odd 1-255

    public void printOdd(){
    for (int i=0; i <=255; i++){
        if (i%2 != 0){
            System.out.println(i);
        }
    }
    }


    //print sum

    public void printSum(){
    int sum = 0;
    for(int i=0; i<=255; i++){
        sum = sum + i;
        System.out.println("New Number: " + i + " Sum: "+ sum);

    }
}


    //iterating through an array

    public void iterateArray(int[] arr){
    for(int i=0; i < arr.length; i++){
        System.out.println(arr[i]);

    }
}


    //find max

    public void findMax(int[] arr2){
    int max1 = arr2[0];
    for(int i = 0; i < arr2.length; i++){
        if(arr2[i] > max1){
            max1 = arr2[i];
        }
    
    }
    System.out.println("Max value is: " + max1);
    }

    //get average

    public void getAverage(int[] arr3){ 
    int avgSum = 0;
    for(int i = 0; i < arr3.length; i++){
        avgSum = avgSum + arr3[i];
    }
    
    System.out.println(avgSum/arr3.length);
}
    

    //array with odd numbers

    public void arrayOddNum(){
        ArrayList<Integer> arrayOddNum = new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++ ){
            if(i %2 != 0){
                arrayOddNum.add(i);

            }
        }
        System.out.println(arrayOddNum);
}


    //greater than y
    
    public void arrayY(int[] arr4, int y){
    int count = 0;
    for(int i = 0; i < arr4.length; i++){
        if(arr4[i] > y){
            count = count + 1;
        }
    }System.out.println(count);
}



    //square the values

    public void squareValues(int[] arr5){
    ArrayList<Integer> newArray = new ArrayList<Integer>();
    int value = 0;
        for(int i = 0; i < arr5.length; i++){
        value = arr5[i] * arr5[i];
        newArray.add(value);
    }
    System.out.println(newArray);
}


    //eliminate negative numbers

    public void elimNegs(int[] arrayEliminate){
    ArrayList<Integer> arrayPositive = new ArrayList<Integer>();
    for(int i = 0; i < arrayEliminate.length; i++){
        if(arrayEliminate[i] < 0){
            arrayPositive.add(0);
        }
        else{
        arrayPositive.add(arrayEliminate[i]);
        }
    }
    System.out.println(arrayPositive);
}



    //max, min, average

    public void minMaxAvg(int[] arrayMinMaxAvg){
        ArrayList<Object> arrayValues = new ArrayList<Object>();
        int max2 = arrayMinMaxAvg[0];
        int min2 = arrayMinMaxAvg[0];
        double sum2 = 0;
        for(int i = 0; i < arrayMinMaxAvg.length; i++){
            sum2 += arrayMinMaxAvg[i];
            if(arrayMinMaxAvg[i] > max2) {
                max2 = arrayMinMaxAvg[i];
            }
            else if(arrayMinMaxAvg[i] < min2){
                min2 = arrayMinMaxAvg[i];
            }
            
        }
        sum2 = sum2 / arrayMinMaxAvg.length;
        arrayValues.add(min2);
        arrayValues.add(max2);
        arrayValues.add(sum2);
        System.out.println(arrayValues);
    }


    //shifting the values in the array

    public void arrayShiftV(int[] arrayShift){
    ArrayList<Integer> arrayEnd = new ArrayList<Integer>();
        for(int i = 0; i < arrayShift.length; i++){
        if(i == arrayShift.length-1){
            arrayEnd.add(0);
        }else{
            arrayEnd.add(arrayShift[i + 1]);
        }

    }
    System.out.println(arrayEnd);

}




}
