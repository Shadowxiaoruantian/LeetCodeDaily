package March;

class Solution3 {

    /**
     * 从Java上来说，并不够优秀
     * 运行时间3ms 打败19.79%
     * 运行内存42.5MB 打败67.30%
     * 毕竟打了一个表在这里
     * 但是运行时间很低就不知道为什么了
     * 思路来源链接：
     * https://blog.csdn.net/stupidmistake/article/details/44134263
     * 官方题解还是牛逼的。
     */
    char[] tab = {
            0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,
            1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,
            1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,
            2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7,
            1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,
            2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7,
            2,3,3,4,3,4,4,5,3,4,4,5,4,5,5,6,3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7,
            3,4,4,5,4,5,5,6,4,5,5,6,5,6,6,7,4,5,5,6,5,6,6,7,5,6,6,7,6,7,7,8,
    };


    public int[] countBits(int num) {
        int x[] = new int[num+1];
        for(int i = 0; i<= num; i++){
            x[i] = tab[i >> 0 &0xff] + tab[i >> 8 & 0xff] + tab[i >> 16 & 0xff] + tab[i >> 24 & 0xff];
        }
        return x;
    }
}
