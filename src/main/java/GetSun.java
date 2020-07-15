/**
 * 不使用  + - 计算出任意两数之和
 *
 * 思路分析：
 * ^  异或运算相当于不进位的两数字相加  3+4 0011^0100=0111  10+9 1010^1001 =0011
 * & 与运算（都为1才1） 左移一位用来获取进位 （10&9）<<
 *  将两个原始数据相加  然后和进位相加（^） 一直往复  直到进位为0
 */
public class GetSun {
    public  static  int solution(int a,int b){
        while(b!=0){
            int temp=a^b;//原始数据相加       //上一次的相加和和进位相加
             b=(a&b)<<1;//b等于进位             //再取到第二次相加后的进位
            a=temp;      //a设置为原始数据不进位相加和   //a再次等于他们的相加和
        }
        return a;
    }


    public static void main(String[] args) {

        int solution = solution(5, 6);
        System.out.println(solution);
    }
}
