class Solution {
    public String defangIPaddr(String address) {
        // return address.replaceAll("\\.", "[.]");
        return address.replace(".", "[.]");
    }
}