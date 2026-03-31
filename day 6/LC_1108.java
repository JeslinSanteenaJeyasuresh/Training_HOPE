class Solution {
    public String defangIPaddr(String address) {
        address = address.replace(".","[.]"); // name.replace("this","with")
        return address;
        
    }
}