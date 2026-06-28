class Solution
{
    public boolean isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }

        int temp = x;
        int reversed = 0;

        while (temp > 0)
        {
            int rem = temp % 10;
            reversed = reversed * 10 + rem;
            temp = temp / 10;
        }

        return reversed == x;
    }
}