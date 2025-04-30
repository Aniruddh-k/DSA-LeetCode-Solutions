class Solution:
    def reverse(self, x: int) -> int:
        if(x>0):
            x=str(x)
            x=x[::-1]
            x=int(x)
        else:
            x=0-x
            x=str(x)
            x=x[::-1]
            x=int(x)
            x=0-x
        if(x>2147483647 or x<-2147483648):
            return 0
        else:
            return x