
import java.util.Scanner;


public class insertionSortV2 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number of Arrays: ");
        int num = sc.nextInt();
        
        int[] data;
        data = new int[num];
        for(int a = 0; a<num; a++){
            System.out.print("Enter number: ");
            data[a] = sc.nextInt();
        }
    
        int i, j, key;
		for (i=1;i<data.length;i++){
			j = i;
                        //change "data[j-1]>data[j]" to 'data[j-1]<data[j]" for descending order
			while (j>0 && data[j-1]>data[j]){
				key = data[j];
				data[j] = data [j-1];
				data[j-1] = key;
				j--;
			}
                        //print all
			for (int k=0;k<data.length;k++){
        		System.out.print(data[k]+" ");
        	}
        	System.out.println();
		}
    }   
}
