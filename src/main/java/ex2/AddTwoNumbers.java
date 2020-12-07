package ex2;

/*
*
* l1 : 2 -> 4 -> 3
* l2 : 5 -> 6 -> 4
*________________
*  sum : 7 -> 0 -> 8
*
* out : 8 -> 0 -> 7
*
* */

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode out = new ListNode(l1.val + l2.val);
        ListNode p = l1.next;
        ListNode q = l2.next;

        System.out.println(" p : " + p);
        System.out.println(" q : " + q);

        while(p != null || q != null ){
            out.next = addTwoNumbers(p,q);
            System.out.println(" out : " + out.getVal());
        }
        return out;
    }

}