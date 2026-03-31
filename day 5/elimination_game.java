
class Solution {
    public int lastRemaining(int n) {
        int head=1; // first element in the list
        int step=1; // gap between the elements in the list
        int remain=n; // remaining elements in the list
        boolean leftToRight = true;// direction of elimination
        while(remain>1){ // loop till there is nly one element left in the list
            if(remain%2!=0 || leftToRight) // if the remain is odd or ltor -> head will be removed
                                            // else if the remain is even and rtol -> head will not be removed
                head+=step;// nxt head -> head + step
            step*=2;// gap will be doubled after each elimination
            remain/=2;// half the number of the elements in the list after each elimination
            leftToRight = !leftToRight; // change the direction of elimination after each round
        }
        return head;// ans the remaining 1 element in the list
    }
}
