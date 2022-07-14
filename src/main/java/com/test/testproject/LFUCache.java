package com.test.testproject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LFUCache {

	private int capacity = 0;
	private int leastFreq = 0;
	Map<Integer, LinkedList<Node>> freqMap;
	Map<Integer, Node> nodeMap;
	
	public LFUCache(int capacity) {
		this.capacity = capacity;
		this.freqMap = new HashMap<Integer, LinkedList<Node>>();
		this.nodeMap = new HashMap<Integer, Node>();
	}
	
	public void put(Integer key, Integer value) {
		if(capacity > nodeMap.size() && !nodeMap.containsKey(key)) {
			nodeMap.put(key, new Node(key, value));
			
//			if(freqMap)
//			
//			LinkedList<Node> list = new LinkedList<Node>();
//			list.add(nodeMap.get(key));
//			freqMap.put(1, list);
		}
	}
	
	public Integer getValue(Integer key) {
		return -1;
	}
}

class Node {
	int key;
	int value;
	
	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}