/**
 * Q-67: addBinary
 * Binary addition is based on the below given logic:
 * Carry = (digit-1 / digit-2) / 2;
 * Ans = (digit-1 / digit-2) % 2
 */

class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry = carry / 2;
        }
        return sb.reverse().toString();
    }
}
