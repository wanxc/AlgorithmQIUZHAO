package Java.week_5;
//231. 2的幂
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
    long x = (long) n;
    return (x & (-x)) == x;
    }
}