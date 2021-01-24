public class SumLists extends LinkedList {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node new_list = dummyHead;
        int carry = 0;
        //traverse the two lists concurrently
        while (l1 != null || l2 != null)
        {
            int l1_data = (l1 != null) ? l1.data : 0;
            int l2_data = (l2 != null) ? l2.data : 0;
            int current_sum = l1_data + l2_data + carry;
            
            carry = current_sum / 10;
            int last_digit = current_sum % 10;
            
            Node result = new Node(last_digit);
            new_list.next = result;
            new_list = new_list.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            
        }
        if (carry > 0)
        {
            Node extra = new Node(carry);
            new_list.next = extra;
            new_list = new_list.next;
        }
        return dummyHead.next;
        
    }
}
