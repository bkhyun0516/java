package ex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

class Solution {
    public Vector<Integer> sort(int n,Vector<Integer> v){
    	for(int i=0; i<n; i++) {
    		for(int j=i; j<n; j++) {
    			int a = v.elementAt(i);
    			if(v.elementAt(i)<v.elementAt(j)) {
    				Integer tmp= v.elementAt(i);
    				v.setElementAt(v.elementAt(j), i);
    				v.setElementAt(tmp, j);
    			}	
    		}
    	}
    	return v;
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Vector<Integer> v = new Vector<Integer>();
     	Queue<Integer> q = new LinkedList<Integer>();
        int answer = 0;
        int numberOfTruck = truck_weights.length;
        for(int i=0;i < numberOfTruck; i++){
            v.add(truck_weights[i]);
        }
        sort(numberOfTruck,v);
        for (int i = 0; i < truck_weights.length; i++) {
        	System.out.print(v.elementAt(i));
		}
        while(!v.isEmpty()) {
        	break;
        }
        return answer;
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] a = {123,24,223,2,1};
    	int t = s.solution(10, 10, a);
    	System.out.println(t);
	}
	
}