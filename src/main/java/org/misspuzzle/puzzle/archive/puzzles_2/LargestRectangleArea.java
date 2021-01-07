package org.misspuzzle.puzzle.archive.puzzles_2;

import java.util.Stack;


public class LargestRectangleArea {
	
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<Integer>();
        
        int max = 0;
        
        for (int i = 0; i <= heights.length; i++) {
        	int current = i == heights.length ? 0 : heights[i];
        	
        	while (!s.isEmpty() && heights[s.peek()] >= current) {
        		int h = heights[s.pop()];
        		
        		int left = s.isEmpty() ? -1 : s.peek();
        		
        		max = Math.max(max, h * (i - left - 1));
        	}
        	
        	s.push(i);
        }
    	
    	return max;
    }

}
