class Solution {
    
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        return addTwoNumbersUtil(l1, l2, 0);
    }
        
    public ListNode addTwoNumbersUtil(ListNode l1, ListNode l2, int carry){

        ListNode node = null;
        if(l1 == null && l2 == null){
            if(carry == 0){
                return null;
            }else{
                return new ListNode(carry);
            }
        }
        else if(l1 != null && l2 != null) {
            int data = l1.val + l2.val + carry;
            int val= data%10;
            node = new ListNode(val);
            node.next = addTwoNumbersUtil(l1.next, l2.next, data/10);
        }
        else if(l1 != null) {
            int data = l1.val + carry;
            int val = data%10;
            node = new ListNode(val);
            node.next = addTwoNumbersUtil(l1.next, l2, data/10);
        }
        else if(l2 != null) {
            int data = l2.val + carry;
            int val = data%10;
            node = new ListNode(val);
            node.next = addTwoNumbersUtil(l1, l2.next, data/10);
        }
        return node;
	}

}