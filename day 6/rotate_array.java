class Solution {
    public void rotate(int[] nums, int k) {
        /*
        brute force method
        int n=nums.length;
        k=k%n;
        for(int i = 0;i<k;i++){
            int last = nums[n-1];
            for(int j = n-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0] = last;
        }*/

        /* optimised code */
        int n = nums.length;
        k=k%n;
        Reverse(nums,0,n-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k,n-1);
    }
    void Reverse(int[] nums,int s,int e){
        while(e>s){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}