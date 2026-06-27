class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        res = []
        for i in range(2):
            for x in nums:
                res.append(x)
        return res