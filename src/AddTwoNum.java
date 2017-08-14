


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


}

public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode first = prev;

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {

            int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
            carry = sum / 10;

            sum = sum % 10;

            prev.next = new ListNode(sum);
            prev = prev.next;
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return first.next;
    }


    public void test(){
        ListNode a = new ListNode(2);
        a.next = new ListNode(4);
        a.next.next = new ListNode(3);


        ListNode b = new ListNode(5);
        b.next = new ListNode(6);
        b.next.next = new ListNode(4);


        AddTwoNum m = new AddTwoNum();
        ListNode c = m.addTwoNumbers(a, b);

        for (ListNode i = c; i != null; i = i.next) {
            System.out.println(i.val);
        }
    }


}
