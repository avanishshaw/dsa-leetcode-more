public class leetcode_2108 {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};

        System.out.println(palindrome(words));

    }

    public static String palindrome(String[] words){
        for(String word: words){
            if(isPalindrome(word)){
                return word;
            }
        }

        return "Not palindrome";
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
