# 2811. Check if it is Possible to Split Array
# https://leetcode.com/problems/check-if-it-is-possible-to-split-array/

class Solution(object):
    def canSplitArray(self, nums, m):
        """
        :type nums: List[int]
        :type m: int
        :rtype: bool
        """
        
        if len(nums) <= 2:
            return True
        
        
        for i in range(len(nums) - 1):
            if nums[i] + nums[i + 1] >= m:
                return True
        
        return False
        