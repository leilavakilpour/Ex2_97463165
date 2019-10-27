package assignment2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        
        System.out.println("Please enter row and column:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("row is:");
        int m = scanner.nextInt();
        System.out.print("column is:");
        int n = scanner.nextInt();
        int Array [][] = new int[m][n];

        Random rnd = new Random();

        System.out.println("Initial pattern:");
        for(int i = 0; i<m ; i++){
            for(int j = 0; j<n ; j++){
                Array[i][j] = rnd.nextInt(99) + 1;
                System.out.format("%d\t",Array[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Please enter row and column:");
        String c = scanner.next();
        if(c.equals("r")) {
            System.out.print("Please enter the number of row: ");
        }else {
            System.out.print("Please enter the number of column: ");
        }
        int d = scanner.nextInt();

        if( c.equals("r")) {

            int temp;
            boolean flage = false;
            for(int r = 0; r<n ; r++){

                for(int i = 0; i<n-1 ;i++){
                    if(Array[d][i] > Array[d][i+1]){
                        flage = true;
                        for(int j = 0; j<m ; j++){
                        temp = Array[j][i+1];
                        Array[j][i+1] = Array[j][i];
                        Array[j][i] = temp;
                        
                        }
                    }
                }
                if(flage == false){break;}
            }

            System.out.println("Secondary Array:");
            for(int i = 0; i<m ; i++){
                for(int j = 0; j<n ; j++){
                    System.out.format("%d\t",Array[i][j]);
                }
                System.out.print("\n");
            }

        }else if(c.equals("c")){

           int temp;
           boolean flage = false;
        for(int r = 0; r<m ; r++) {

            for (int i = 0; i < m-1; i++) {

                if (Array[i][d] > Array[i + 1][d]) {
                    flage = true;
                    for (int j = 0; j < n; j++) {
                        temp = Array[i + 1][j];
                        Array[i + 1][j] = Array[i][j];
                        Array[i][j] = temp;
                    }
                }
            }
            if(flage == false) {break;}
            }//end of big for

            for(int i = 0; i<m ; i++){
                for(int j = 0; j<n ; j++){
                    System.out.format("%d\t",Array[i][j]);
                }
                System.out.print("\n");
            }

        }else{
            System.out.println("Your number should be smaller!!");
        }
        try{
            System.in.read();
        }catch(IOException  e){}

    }
    
}
