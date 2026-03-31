class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();// string to char array
        int left=0;// left pointer
        int right = arr.length-1;// right pointer
        while(left<right){
            while(left<right && !isVowel(arr[left])){// move left pointer until it points to a vowel
                left++;
            }
            while(left<right && !isVowel(arr[right])){// move right pointer until it points to a vowel
                right--;
            }
            char temp = arr[left];// swap
            arr[left] = arr[right];
            arr[right] = temp;

            right--;
            left++;
        }
        return new String(arr);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!= -1;// check if the character is a vowel
    }
}