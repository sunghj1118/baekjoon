// brute coding is quite hard

import java.io.*;
import java.util.*;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    
    static int search(int[] arr, int N, int M){
        int result = 0;
        //searching between three cards so cycle through N-2
        for(int i = 0; i < N-2; i++){
            //second card cycling N-2
            for(int j = i + 1; j < N - 1; j++){
                //third card cycling until N
                for(int k = j +1; k < N; k++){
                    //sum of three cards is temp
                    int temp = arr[i] + arr[j] + arr[k];
                    //if sum == M, return temp
                    if(M == temp){
                        return temp;
                    }
                    
                    //if the sum of the three cards is larger than the last one then update
                    if(result < temp && temp < M){
                        result = temp;
                    }
                }
            }
        }
        
        return result;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
		
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
		}
        
        int result = search(arr, N, M);
        System.out.println(result);
	}
}
