package Java.week_5;
//191.位1的个数
public class HammingWeight {
    public int hammingWeight(int n) {
        int sum = 0;
    while (n != 0) {
        sum++;
        n &= (n - 1);
    }
    return sum;
    }
}