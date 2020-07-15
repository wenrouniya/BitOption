/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 思路分析：
 * a^a =0;
 * 0^ a=a;
 * a^b^a =a^a^b=0^b=b;
 */
public class singleNumber {
    public static int solution(int [] nums){
        int  ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,4,3,2,1};
        int solution = solution(nums);
        System.out.println(solution);


    }
}
