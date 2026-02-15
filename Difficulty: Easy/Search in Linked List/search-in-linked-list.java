/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node temp = head;
        int i = 0;
        
        while(temp != null) {
            if(temp.data == key) {
                return true;
            }
            temp = temp.next;
            i++;
        }
        
        return false;
    }
}