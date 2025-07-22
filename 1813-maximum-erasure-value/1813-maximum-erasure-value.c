#include <stdio.h>
#include <stdlib.h>

int maximumUniqueSubarray(int* nums, int numsSize) {
    int map[10001] = {0}; // values range up to 10^4
    int start = 0, sum = 0, maxSum = 0;

    for (int end = 0; end < numsSize; end++) {
        while (map[nums[end]]) {
            map[nums[start]] = 0;
            sum -= nums[start];
            start++;
        }
        map[nums[end]] = 1;
        sum += nums[end];
        if (sum > maxSum)
            maxSum = sum;
    }

    return maxSum;
}
