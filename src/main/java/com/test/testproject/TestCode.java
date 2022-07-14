package com.test.testproject;

import java.util.List;
import java.util.Stack;

/*
 * 2d matrix size M*N 
 * [5 6 1 8]
 * [0 2 9 1]
 * [3 2 8 9]
 * traversal rules:
 * 1 step horizontally right
 * diogonally upward towards right 1 step
 * diogonally downward towards right 1 step
 * */
public class TestCode {
	static String reverseStr = "";
//	public static void main(String[] args) {
//		
////		Map<Integer, String> map= new HashMap<>();
////		int a[] = {7, 6, 4, -1, 1, 2};
////		int n = a.length;
////		int target = 16;
////
////		for(int i=0;i<n;i++) {
////		    for(int j=i+1;j<n;j++) {
////		        int sum = a[i] + a[j];
////		        if(map.containsKey(target-sum)) {
////		            String values = map.get(target-sum);
////		            String arr[] = values.split("_");
////		            for(String str: arr) {
////		                if(!str.contains(a[i]+"") && !str.contains(a[j]+"")) {
////		                    String nums[] = str.split(",");
////		                    System.out.println(a[i] + "," + a[j] + "," + nums[0] + "," + nums[1]);
////		                }
////		            }
////		        } else {
////		        	if(map.containsKey(sum)) {
////			            map.put(sum, map.get(sum) + "_" + a[i] + "," + a[j]);
////			        } else {
////			            map.put(sum, a[i] + ","+a[j]);
////			        }
////		        }
////		    } 
////		}
//	}

//	public static void main(String[] args) {
//
//		int a[] = {2,0,2,1,1,0};
//		int beg = 0, last = a.length-1, i=0;
//		while(i<last) {
//			if(a[i] == 0) {
//				swap(i, beg, a);
//				beg++;i++;
//			} else if(a[i] == 2) {
//				swap(i, last, a);
//				last--;
//			} else {
//				i++;
//			}
//		}
//		
//		for(Integer val : a) {
//			System.out.print(val + " ");
//		}
//	}
	
	public static void main(String args[])  {  
		String pattern = "3[b2[ac]]";
		Stack<Character> stack = new Stack<>();
		String temp = "";
		int count = 0;
		for(int i=0;i<pattern.length();i++) {
			if(pattern.charAt(i) != ']') {
				stack.push(pattern.charAt(i));
			} else {
				while(stack.isEmpty() || stack.peek() != '[') {
					char c = stack.pop();
					temp = c + temp;
				}
				if(!stack.isEmpty() && stack.pop() == '[') {
					count = Integer.parseInt(stack.pop() + "");
					if(count > 0) {
						String t = temp;
						while(count-- > 1) {
							temp = temp + t;
						}
					}
				}
			}
		}
		
		while(!stack.isEmpty()) {
			temp = temp + stack.pop();
		}
		
		System.out.println(temp);
	}

	private static void swap(int i, int j, int a[]) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void reverseStr(String name, int i) {
		if (i == name.length()) {
			return;
		}

		reverseStr(name, i + 1);
		reverseStr += name.charAt(i);
	}

	public static void reverse(String name) {
		if (name.length() == 0)
			return;
		reverseStr += name.substring(name.length() - 1);
		reverse(name.substring(0, name.length() - 1));
	}
}

interface SortStrategy {
	
	List<Integer> sort(List<Integer> list);
}

class QuickSort implements SortStrategy {

	@Override
	public List<Integer> sort(List<Integer> list) {
		// TODO Auto-generated method stub
		return null;
	}
}

class MergeSort implements SortStrategy {

	@Override
	public List<Integer> sort(List<Integer> list) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
