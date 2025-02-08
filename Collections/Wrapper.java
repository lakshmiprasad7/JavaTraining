package Collections;

import java.util.*;

public class Wrapper {


public static void main(String[] args) {
//	Queue<Integer> q1=new LinkedList<>();
	PriorityQueue<Integer> q1=new PriorityQueue<>(Collections.reverseOrder());
	q1.offer(40);
	q1.offer(35);
	q1.offer(20);
	q1.offer(30);
	System.out.println(q1);
	System.out.println(q1.peek());
	System.out.println(q1.poll());
	System.out.println(q1);
	
	
}
}
