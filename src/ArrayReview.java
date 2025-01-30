package src;

public class ArrayReview {
    public static void main(String[] args){
        //element type arrRefVariable[]; <- declaring a reference to an array
        double doubleArray[];
        //new keyword, your allocating memory
        doubleArray = new double[10];
        //display value of index 0 in the doubleArray
        System.out.println("The value of double[0] is: " + doubleArray[0]);
        System.out.println("Before: ");
        printArray(doubleArray);

        for (int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = i;
        }

        System.out.println("After: ");
        printArray(doubleArray);

    }

    public static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The value of the Array[" + i + "] is: " + arr[i]);
        }
    }
    public static double sumArray(double[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
