package org.misspuzzle.puzzle.archive.puzzles_1;

import org.misspuzzle.puzzle.Puzzle;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses implements Puzzle {

	@Override
	public void execute() {

		for (String s : generateParenthesis(3)) {
			System.out.println(s);
		}
	}
	
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        
        addParenthesis(result, new StringBuilder(), 0, 0, 0, n);
        
        return result;
    }
    
    private void addParenthesis(List<String> result, StringBuilder temp, int leftCount, int step, int used, int n) {
        if (step == n * 2) {
            result.add(temp.toString());
            
            return;
        }
        
        if (leftCount == 0) {
            temp.append('(');
            addParenthesis(result, temp, 1, step + 1, used + 1, n);
            temp.deleteCharAt(temp.length() - 1);
        } else if (leftCount == n) {
            temp.append(')');
            addParenthesis(result, temp, n - 1, step + 1, used, n);
            temp.deleteCharAt(temp.length() - 1);
        } else {
        	if (used < n) {
                temp.append('(');
                addParenthesis(result, temp, leftCount + 1, step + 1, used + 1, n);
                temp.deleteCharAt(temp.length() - 1);
        	}
            temp.append(')');
            addParenthesis(result, temp, leftCount - 1, step + 1, used, n);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

}