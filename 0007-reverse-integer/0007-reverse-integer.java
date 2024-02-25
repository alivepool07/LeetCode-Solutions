class Solution {
    public int reverse(int x) {
        long Finalnum = 0;
        while (x != 0) {

            int LastDigit = x % 10;

            x = x / 10;

            Finalnum = (Finalnum * 10) + LastDigit;
        }
        if ( Finalnum > Integer.MAX_VALUE || Finalnum < Integer.MIN_VALUE){

            return 0;
        }

        if (x < 0) {
            return (int) (-1 * Finalnum);
        }
        return (int) Finalnum;
    }
}