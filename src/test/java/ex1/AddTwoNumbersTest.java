package ex1;

import ex2.AddTwoNumbers;
import ex2.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
        Example 2:

        Input: l1 = [0], l2 = [0]
        Output: [0]
        Example 3:

        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]

*/

class AddTwoNumbersTest {

    @Test
    void shouldReturnExpectedValues() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(0, listNode.getNext().getVal());
        assertEquals(7, listNode.getNext().getNext().getVal());
        assertEquals(8, listNode.getVal());

        System.out.println(listNode.getVal());
        System.out.println(listNode.getNext().getVal());
        System.out.println(listNode.getNext().getNext().getVal());


    }
}