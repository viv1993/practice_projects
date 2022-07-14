package com.test.testproject;

import java.util.HashMap;
import java.util.Map;

public class MostFrequest {

	private int maxCount = 0;
	private int maxCounElem = -1;
	private int i=0;
	private Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
	private Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
	
	public void addNumber(Integer num) {
		int c = 0;
		if(frequencyMap.containsKey(num)) {
			c = frequencyMap.get(num) + 1;
			frequencyMap.put(num, frequencyMap.get(num) + 1);
		} else {
			indexMap.put(num, i);
			frequencyMap.put(num, 1);
			c = 1;
		}
		if(c >= maxCount) {
			if(c > maxCount) {
				maxCount = c;
				maxCounElem = num;
			} else {
				if(maxCounElem != -1) {
					if(indexMap.get(maxCounElem) > indexMap.get(num)) {
						maxCount = c;
						maxCounElem = num;
					}
				}
			}
		}
		i++;
	}
	
	public Integer getMostFrequentNumber() {
		return maxCounElem;
	}
	
	public static void main(String[] args) {
//		int a[] = {10, 20, 30, 20, 10, 30 , 30};
//		MostFrequest obj = new MostFrequest();
//		for(Integer val : a) {
//			System.out.println("adding : " + val);
//			obj.addNumber(val);
//			System.out.println("most frequent element is : " + obj.getMostFrequentNumber());
//		}
		
		boolean flag = false;
		int ar[] = {1,2};
		int b = flag ? (ar[2]!= -1 ? ar[2] : 3 ) : -1;
		
		System.out.println(b);
	}
}
