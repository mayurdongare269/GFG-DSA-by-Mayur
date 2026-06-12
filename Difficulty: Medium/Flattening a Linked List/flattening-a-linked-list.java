/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/

class Solution {

    // =========================================================
    // BRUTE FORCE APPROACH
    // =========================================================
    // Idea:
    // 1. Traverse all nodes using next and bottom pointers.
    // 2. Store all values in an ArrayList.
    // 3. Sort the ArrayList.
    // 4. Create a new bottom linked list from sorted values.
    //
    // TC: O(N*M) + O(N*M log(N*M)) + O(N*M)
    // SC: O(N*M)
    //
    // (Commented because Optimal Solution is required)
    // =========================================================

    /*
    private Node convertArrToLinkedList(ArrayList<Integer> arr) {

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        for(int val : arr) {
            temp.bottom = new Node(val);
            temp = temp.bottom;
        }

        return dummyNode.bottom;
    }

    public Node flatten(Node root) {

        ArrayList<Integer> arr = new ArrayList<>();

        Node head = root;

        // Collect all nodes
        while(head != null) {

            Node temp = head;

            while(temp != null) {
                arr.add(temp.data);
                temp = temp.bottom;
            }

            head = head.next;
        }

        // Sort all collected values
        Collections.sort(arr);

        // Rebuild sorted bottom linked list
        return convertArrToLinkedList(arr);
    }
    */


    // =========================================================
    // OPTIMAL APPROACH (Merge Sort on Linked List)
    // =========================================================
    //
    // Idea:
    // Flatten from right to left.
    //
    // Example:
    // 1 -> 4 -> 7 -> 9
    //
    // First flatten:
    // (7->9)
    //
    // Then merge:
    // (4-list) with (7->9)
    //
    // Then merge:
    // (1-list) with merged list
    //
    // Similar to Merge Sort.
    //
    // TC: O(N * M)
    // SC: O(N)   // recursion stack
    // =========================================================


    // Merge two sorted bottom linked lists
    private Node merge(Node list1, Node list2) {

        Node dummyNode = new Node(-1);
        Node res = dummyNode;

        while(list1 != null && list2 != null) {

            if(list1.data < list2.data) {
                res.bottom = list1;
                res = list1;
                list1 = list1.bottom;
            }
            else {
                res.bottom = list2;
                res = list2;
                list2 = list2.bottom;
            }

            // next pointers are not needed in final flattened list
            res.next = null;
        }

        // Attach remaining nodes
        if(list1 != null) {
            res.bottom = list1;
        }
        else {
            res.bottom = list2;
        }

        return dummyNode.bottom;
    }


    public Node flatten(Node root) {

        // Base Case
        if(root == null || root.next == null) {
            return root;
        }

        // Flatten the list on right side
        Node mergedHead = flatten(root.next);

        // Merge current list with already flattened list
        root = merge(root, mergedHead);

        return root;
    }
}