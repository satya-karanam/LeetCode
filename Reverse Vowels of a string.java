class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i = 0,
         j = c.length - 1;
        String v = "aeiouAEIOU";

        while (i < j) {
            while (i < j && v.indexOf(c[i]) == -1) i++;
             while (i < j && v.indexOf(c[j]) == -1) j--;
        
            char t = c[i];
            c[i] = c[j];
            c[j] = t;

            i++;
            j--;
        }
        return new String(c);
    }
}
