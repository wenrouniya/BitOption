/**
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量)
 *
 * 思路：
 * 检查二进制数的每一位是否为1 统计出来1的个数
 * 构造一个掩码 0001 每次让1左移一位  与原数字相与 若为0则说明当前位置为0 否则即为1
 */
public class hammingWeight {

    public static  int solution(int x){
        int mask=1;
        int result=0;
        //java 的int是32位
        for(int i=0;i<32;i++){
            if((mask&x) !=0){
                result++;
            }
            mask=mask<<1;
        }
        return result;
    }

    public static void main(String[] args) {
        int solution = solution(7);
        System.out.println(solution);
    }
}
