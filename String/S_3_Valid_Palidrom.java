public class S_3_Valid_Palidrom {
    
    private static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            char one = s.charAt(left);
            char two = s.charAt(right);

            // skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(one)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(two)) {
                right--;
                continue;
            }

            // compare ignoring case
            if (Character.toLowerCase(one) != Character.toLowerCase(two)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


    
    public static void main(String[] args) {
        
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}
