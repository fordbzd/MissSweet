package org.misspuzzle.puzzle.archive.puzzles_2;

import org.junit.Test;
import org.misspuzzle.datastructure.ListNode;

import static org.junit.Assert.assertEquals;

public class ReverseKGroupTest {
	@Test
	public void testcase() {
		final ListNode root = new ListNode(new int[]{1, 2, 3, 4, 5, 6, 7});

		final ListNode result = new ReverseKGroup().reverseKGroup(root, 5);

		assertEquals("5 -> 4 -> 3 -> 2 -> 1 -> 6 -> 7", result.toString());
	}
}
