#just a classic stack program
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
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int top = -1;
		
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    String type = st.nextToken();
		    switch(type){
                case "push":
		            top = Integer.parseInt(st.nextToken());
                    stack.push(top);
                    break;
	            case "pop":
	                if(stack.isEmpty()){
	                    sb.append("-1").append("\n");
	                    break;
	                }
	                sb.append(stack.pop()).append("\n");
	                break;
                case "size":
                    sb.append(stack.size()).append("\n");
	                break;
                case "empty":
                    sb.append(stack.isEmpty()? 1 : 0).append("\n");
	                break;
                case "top":
                    sb.append(stack.isEmpty()? -1 : stack.peek()).append("\n");
	                break;
		    }
		}
		System.out.println(sb);
	}
}
