class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        
        int n = start.length;
        int rooms = 0, maxRooms = 0;
        int sPtr = 0, ePtr = 0;
        
        while(sPtr < n && ePtr < n) {
            if(start[sPtr] < end[ePtr]) {
                rooms++; // meeting start room occupied
                sPtr++;
            } else {
                rooms--; // meeting ended hence room freed
                ePtr++;
            }
            
            maxRooms = Math.max(maxRooms, rooms);
        }
        
        return maxRooms;
    }
}
