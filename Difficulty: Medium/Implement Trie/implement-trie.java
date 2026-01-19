// User function Template for Java
class Trie {
    
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        
        Node() {
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root;
    
    public Trie() {
        // Implement Trie
        root = new Node();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        Node curr = root;
        
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            
            curr = curr.children[idx];
        }
        
        curr.eow = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        
        Node curr = root;
        
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            
            if(curr.children[idx] == null) {
                return false;
            }
            
            curr = curr.children[idx];
        }
        
        return curr.eow == true;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        Node curr = root;
        
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            
            if(curr.children[idx] == null) {
                return false;
            }
            
            curr = curr.children[idx];
        }
        
        return true;
    }
}