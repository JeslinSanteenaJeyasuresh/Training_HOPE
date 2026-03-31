class Solution {
    public boolean rotateString(String s, String goal) {
        int size = s.length(),flag=0;
        for(int i=0;i<size;i++){
            s = s.substring(1) + s.charAt(0); // shift the first character to the end of the string
            if(s.equals(goal)){// check
                return true;
            }
        }
        return false;
    }
}