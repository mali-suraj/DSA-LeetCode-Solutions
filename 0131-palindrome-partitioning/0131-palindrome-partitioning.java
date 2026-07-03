class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        palindrome(s, new ArrayList<>(), result);
        return result;
    }

    public static void palindrome(String s,
                                  List<String> ans,
                                  List<List<String>> result) {

        if (s.length() == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String part = s.substring(0, i + 1);

            if (isPal(part)) {
                ans.add(part);
                palindrome(s.substring(i + 1), ans, result);
                ans.remove(ans.size() - 1); // backtracking
            }
        }
    }

    public static boolean isPal(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}