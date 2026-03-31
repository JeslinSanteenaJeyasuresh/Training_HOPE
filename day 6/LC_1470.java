class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] res = new int[2*n]; // result array 2*n size means 2 times of n size i.e. 2 times of the first half of the array
        for(int i=0;i<n;i++){
            res[2*i] = nums[i];// even index will be filled with the first half of the array
            res[2*i+1] = nums[i+n];// odd index will be filled with the second half of the array
        }
        return res;
    }
}