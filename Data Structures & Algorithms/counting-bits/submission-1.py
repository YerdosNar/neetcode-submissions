class Solution:
    def bits(self, n: int) -> int:
        sum = 0;
        while n != 0:
            n = n & (n-1)
            sum += 1
        return sum


    def countBits(self, n: int) -> List[int]:
        res = []
        for i in range(0, n+1):
            res.append(self.bits(i))
        return res