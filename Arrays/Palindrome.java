package Arrays;

public class Palindrome {
    class Solution {
    public boolean isPalindrome(int x) {
        int num=x,n=x,c=0,digit,rev_num=0;
        
        while(num!=0){
            digit=num%10;
            rev_num=(rev_num*10)+digit;
            num/=10;

        }
        if(rev_num==n && rev_num>=0)
        return true;
    else
    return false;
    }
}
public static void main(String[] args) {
    Solution s=new Palindrome().new Solution();
    System.out.println(s.isPalindrome(121));
    System.out.println(s.isPalindrome(-121));
    System.out.println(s.isPalindrome(10));
    System.out.println(s.isPalindrome(-101));
}
}
