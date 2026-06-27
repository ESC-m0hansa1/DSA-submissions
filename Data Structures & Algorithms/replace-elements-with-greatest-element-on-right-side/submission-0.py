class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        
        for i in range(len(arr)-1):
            temp = []
            for x in range(i+1,len(arr)):
                temp.append(arr[x])
                temp.sort()
            arr[i] = temp.pop()
        arr[len(arr)-1] = -1
        return arr
        