public class Palindrome9 {
    public static void main(String[] args) {
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
        int x = 121;
        boolean state = isPalindrome(x);
        System.out.println(state);
    }
    public static boolean isPalindrome(int x) {
        String numString = String.valueOf(x);
        int left=0;
        int right=numString.length()-1;
        while(left<right){
            if(numString.charAt(left)!=numString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
