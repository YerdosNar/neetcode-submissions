/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if (guess(n) == 0) return n;
        long l = 1, r = n;
        int m = (int)((l + r) / 2);

        int g = guess(m);
        while (g != 0) {
            if (g == -1) {
                r = m;
            }
            else {
                l = m+1;
            }
            m = (int)((l + r) / 2);
            g = guess(m);
        }
        return m;
    }
}