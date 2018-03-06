package code.hackerrank.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConnectingTowns {

	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = Integer.parseInt(br.readLine());
        
        while(numOfTestCases --> 0){
            int numOfTowns = Integer.parseInt(br.readLine());
            String[] ways = br.readLine().split(" ");
            
            int totalRoutes = 1;
            
            for(int i=0; i<ways.length;i++){
              totalRoutes = (totalRoutes * Integer.parseInt(ways[i]))%(1234567);   
            }
            
            System.out.println(totalRoutes);
        }
    }
}
