public class BeaconfireInteview {

    private static String findPalindrome(String s, int l, int r){
        // odd "bab" / even  "abba"
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l --;
            r ++;
        }

        return s.substring(l+1, r);
    }


    public static String findLongestPalindrome(String s){
        String res = "";
        
        for(int i = 0; i < s.length(); i++){

            String s1 = findPalindrome(s, i, i); // odd
            String s2 = findPalindrome(s, i, i+1); // even

            //compare and find longest one
            res = s1.length() > res.length() ? s1 : res;
            res = s2.length() > res.length() ? s2 : res;
        }

        return res;
    }



    public static void main(String[] args) {
        System.out.println(findLongestPalindrome("babad"));
        System.out.println(findLongestPalindrome("cbbd"));
    }
}
