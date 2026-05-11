class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        hash={}
        for i in nums:
            if i in hash:
                hash[i]+=1
            else:
                hash[i]=1
        for i in range(len(nums)+1):
            if i not in hash:
                return i
        return -1
            

