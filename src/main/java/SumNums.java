/**
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 思路分析：不能使用公式 因为公式中有乘除法
 * 不能使用普通递归  因为递归中有if判断
 *  使用&&短路运算法  &&前的作为条件 后面的写递归 就可以轻松递归
 */
public class SumNums {

    public static int solution(int n){

        //这里判断递归是否大于0 是为了满足整个表达式返回的是boolean 满足语法 无实际意义
         boolean  b=n>0 &&  (n+=solution(n-1))>0;
         return  n;
    }

    public static void main(String[] args) {
        int solution = solution(5);
        System.out.println(solution);
    }

}
