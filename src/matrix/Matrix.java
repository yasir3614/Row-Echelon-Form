package matrix;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;


public class Matrix{
public static double [][] final_matrix = {{0,0,0},{0,0,0},{0,0,0}};
public static String steps = " ";
public static void printMatrix(double matrix[][],int rows,int cols)
{
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            //String temp  = String.valueOf(matrix[j][i]);   
            System.out.print((matrix[i][j]) + "  ");
            steps =  steps +(matrix[i][j]+" ");
            //System.out.println(final_matrix[i][j]+" ");
        }System.out.println(""); 
        steps=steps+"\n";
    }
}


public static String sendSteps(){
    return steps;
}

public static void REF(double matrix[][], int eCount,int mCount){
    
  
      System.out.println("Orignal Matrix:");
     // printMatrix(matrix,eCount,mCount);
      System.out.println("");
              

      
int lead = 0;
int rowCount = eCount;
int columnCount = mCount;
for (int r = 0; r < rowCount; ++r) {
	if (columnCount <= lead) {
     		break;
    	}
	int i = r;
	while (matrix[i][lead] == 0) {
    		++i;
   		if (i == rowCount) {
  			i = r;
  			++lead;
 			if (columnCount == lead) {
				--lead;
				break;
  			}
    		}
	}
      
	for (int j = 0; j < columnCount; ++j) {
   		double temp  = matrix[r][j];
    		matrix[r][j] = matrix[i][j];
   		matrix[i][j] = temp;
                
	}
        
        steps = steps + ("STEP"+(r+1))+"\n";
        System.out.print("\nSTEP "+(r+1)+"\n");
        printMatrix(matrix,3,3);
        System.out.println("");
        steps = steps + "\n";
	double div = matrix[r][lead];
        
	if (div != 0) {
    		for (int j = 0; j < columnCount; ++j) {
  			matrix[r][j] /= div;
    		}
	}
	for (int j = 0; j < rowCount; ++j) {
    		if (j != r) {
  			double sub = matrix[j][lead];
  			for (int k = 0; k < columnCount; ++k) {
				matrix[j][k] -= (sub * matrix[r][k]);
  			}
    		}
	}
	++lead;
}
    System.out.println("\n\n->The Transformed Matrix Is: ");
    
    
    printMatrix(matrix,eCount,mCount);

    final_matrix = matrix;
    System.out.println("");
   // System.out.println(steps);
    
}

    
    public static void main(String args[]){
        
       Row_Ech obj = new Row_Ech();
       obj.setVisible(true); 
       
    }
    }


