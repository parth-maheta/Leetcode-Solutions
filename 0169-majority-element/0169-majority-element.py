class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hash={}
        for i in nums:
            if i in hash:
                hash[i]+=1
            else:
                hash[i]=1
        for i in hash:
            if hash[i]>len(nums)/2:
                return i
        return -1
