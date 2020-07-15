/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方
 *
 * 思路分析：对于2的幂 数字的最高位均为1  且其余位置上没有1
 * 那么n&(n-1) ==0! 即可证明  是否最高位为1 其余位置均为0  若其余位置不为0 则表示这个数的其他位置还含有1
 *  不是2的幂
 */
public class isPowerOfTwo {

    public  static boolean solution(int n){

        int res=n&(n-1);
        return  res ==0 ? true:false;
    }

    public static void main(String[] args) {
        boolean solution = solution(8);
        System.out.println(solution);
    }

}
