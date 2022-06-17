# I dont really understand how the Array sort overriding works here

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.Arrays;
 
public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Person[] p = new Person[N];
		
		for (int i = 0;i < N; i++){
		    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		    int age = Integer.parseInt(st.nextToken());
		    String name = st.nextToken();
		    p[i] = new Person(age, name);
		}
		
		Arrays.sort(p, new Comparator<Person>(){
		    //sort by age
		    @Override
		    public int compare(Person s1, Person s2){
		        return s1.age - s2.age;
		    }
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++){
		    sb.append(p[i]);
		}
		
		System.out.println(sb);
	}
	
	public static class Person {
	    int age;
	    String name;
	    
	    public Person(int age, String name){
	        this.age = age;
	        this.name = name;
	    }
	    
	    @Override
	    public String toString(){
	        return age + " " + name + "\n";
	    }
	}
}
