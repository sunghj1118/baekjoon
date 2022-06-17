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
		Deque<Integer> dq = new LinkedList<>();
		int back = -1;
        int front = -1;
		
		for(int i = 0; i < N; i++){
		    st = new StringTokenizer(br.readLine());
		    String type = st.nextToken();
		    switch(type){
                case "push_front":
		            front = Integer.parseInt(st.nextToken());
                    dq.offerFirst(front);
                    break;
		        case "push_back":
		            back = Integer.parseInt(st.nextToken());
		            dq.offerLast(back);
		            break;
	            case "pop_front":
	                if(dq.isEmpty()){
	                    sb.append("-1").append("\n");
	                    break;
	                }
	                sb.append(dq.pollFirst()).append("\n");
	                break;
                case "pop_back":
                    if(dq.isEmpty()){
	                    sb.append("-1").append("\n");
	                    break;
	                }
	                sb.append(dq.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
	                break;
                case "empty":
                    sb.append(dq.isEmpty()? 1 : 0).append("\n");
	                break;
                case "front":
                    sb.append(dq.isEmpty()? -1 : dq.peekFirst()).append("\n");
	                break;
                case "back":
                    sb.append(dq.isEmpty()? -1 : dq.peekLast()).append("\n");
	                break;
		    }
		}
		System.out.println(sb);
	}
}
