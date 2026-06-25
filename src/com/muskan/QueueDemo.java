package com.muskan;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		System.out.println(queue);
		System.out.println(queue.peek());
	}
}
