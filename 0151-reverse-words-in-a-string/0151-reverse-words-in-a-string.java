class Solution {
    public String reverseWords(String s) {
        String str[]=s.split("\\s+");
        String ans="";
        for(int i=0;i<str.length;i++){
            ans=str[i]+" "+ans;
        }
        return ans.trim();
    }
}