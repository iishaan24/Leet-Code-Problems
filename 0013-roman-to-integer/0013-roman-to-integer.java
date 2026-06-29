import java.util.HashMap;

public class Solution
{
    public static void main(String[] args)
    {
        String s = "VI";
        int result = romanToInt(s);
        if (result == -1) {
            System.out.println("Invalid Roman numeral input.");
        } else {
            System.out.println(result);
        }
    }

    public static int romanToInt(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            Integer curr = hm.get(s.charAt(i));
            if (curr == null) {
                return -1;
            }
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
}