class Solution {
    public int countMonobit(int n) {

        int count = 1;  
        int k = 1;

        while (true) {
            int num = (1 << k) - 1;
            if (num > n) break;
            count++;
            k++;
        }

        return count;
    }
}
