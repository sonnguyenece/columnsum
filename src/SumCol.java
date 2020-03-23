import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input row : ");
        int row = scn.nextInt();
        System.out.print("Input col : ");
        int col = scn.nextInt();
        float[][] arr = new float[row][col];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input row "+i+" element: ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=scn.nextFloat();
            }
        }
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Select the column that you want to sum : ");
        int selectCol=scn.nextInt()-1;
        if(selectCol<0||selectCol>col-1){
            System.out.print("Your chosen column is exist in another universe ");
        }else {
            float sum=0;
            for(int i=0;i<row;i++){
                sum+=arr[i][selectCol];
            }
            System.out.printf("Total of %d column is : %.2f",selectCol,sum);
        }
    }
}
