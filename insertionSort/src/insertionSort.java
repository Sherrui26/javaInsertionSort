
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args){
        
        int i, j, key = 0;
        //int[] arr = {44,42,35,33,31,27,26,19,14,10};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number of Arrays: ");
        int num = sc.nextInt();
        
        int[] arr;
        arr = new int[num];
        for(int a = 0; a<num; a++){
            System.out.print("Enter first number: ");
            arr[a] = sc.nextInt();
        }
        
        System.out.println("\nInsertion Sort(Ascending): ");
            for (i = 1; i < arr.length; i++){
                j = i;
                for(int s = 0; s<arr.length; s++){
                System.out.print(arr[s]+" ");
                }
                System.out.print("\n");
                while (j > 0 && arr [j - 1] > arr [ j ])
             {
                 key = arr [j];
                 arr[j] = arr [j - 1];
                 arr [ j - 1] = key;
                 j--;
                }
            }
            for(int k = 0; k<arr.length; k++){
                System.out.print(arr[k]+" ");
        }
    }
}