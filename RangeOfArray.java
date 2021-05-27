import java.util.*;

public class RangeOfArray {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int arraySize=scanner.nextInt();
        
        int inputArray[] = new int[arraySize];
        for(int i=0;i<arraySize;i++)
            inputArray[i]=scanner.nextInt();
        
        Arrays.sort(inputArray);
        
        int range = inputArray[arraySize-1]-inputArray[0];
        
        System.out.println("The range of the array is "+ range);
        
    }
}
