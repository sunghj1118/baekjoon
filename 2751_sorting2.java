import java.io.*;
import java.util.*;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new LinkedList<>();
		
		for(int i = 0; i < N; i++){
		    int x = Integer.parseInt(br.readLine());
		    dq.offer(x);
		}
		
		for(int i = 0; i < N; i++){
		    sb.append(dq.pollLast()).append("\n");
		}
		System.out.println(sb);
	}
}
