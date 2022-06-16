//왜 백준에 NoSuchElement가 뜨는지 모르겠다

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static void push(Queue<Integer> queue, int cards){
        for(int i = 1; i < cards + 1; i++){
            queue.add(i);
        }
    }
    
    static int pop_and_shuffle(Queue<Integer> queue){
        while(!queue.isEmpty()){
            //remove the top and move next top to bottom
            queue.remove();
            int removed_ele = queue.remove();
            queue.add(removed_ele);
            
            //if there is only one value, return it
            if(queue.size() == 1){
                int last = queue.remove();
                return last;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) throws IOException{
        //take number of cards
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numcards = Integer.parseInt(br.readLine());
        
        // make a queue(llist) and insert all numbers
        Queue<Integer> deck = new LinkedList<Integer>();
        push(deck, numcards);
        int last = pop_and_shuffle(deck);
        System.out.println(last);
    }
}
