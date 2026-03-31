class Solution {
    public int lastRemaining(int n) {
        int head=1,step=1,remain=n;
        boolean leftToRight = true;
        while(remain>1){
            if(remain%2!=0 || leftToRight)
                head+=step;
            step*=2;
            remain/=2;
            leftToRight = !leftToRight;
        }
        return head;
    }
}