import java.util.Arrays;

public class Solution455 {
    /**
     * 455. 分发饼干
     * 为了满足更多的小孩，就不要造成饼干尺寸的浪费。
     * 大尺寸的饼干既可以满足胃口大的孩子也可以满足胃口小的孩子，那么就应该优先满足胃口大的。
     * 这里的局部最优就是大饼干喂给胃口大的，充分利用饼干尺寸喂饱一个，全局最优就是喂饱尽可能多的小孩。
     * 可以尝试使用贪心策略，先将饼干数组和小孩数组排序。
     * 然后从后向前遍历小孩数组，用大饼干优先满足胃口大的，并统计满足小孩数量。
     * @param g 小孩胃口
     * @param s 饼干尺寸
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        // int start = 0;
        // Arrays.sort(g);
        // Arrays.sort(s);
        // for(int i = 0; i < s.length && start < g.length; i++){
        //     if(s[i] >= g[start]){
        //         start++;
        //     }
        // }
        // return start;
        Arrays.sort(g);
        Arrays.sort(s);
        int start = s.length - 1;
        int count = 0;
        for(int i = g.length - 1; i >= 0; i--){
            if(start >= 0 && g[i] <= s[start]){
                start--;
                count++;
            }
        }
        return count;
    }
}
