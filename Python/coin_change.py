# coin change dynamic Algorithms solution

def makeChange(n, L):
    T=[0]
    I=[]
    for i in range(1,n+1):
        T.append(float("inf"))
        I.append(-1)
    for i in range(len(L)):
        for j in range(1,len(T)):
            if L[i]<= j:
                T[j]=min(T[j],1+T[j-L[i]])
                #print(T[j])

    return T[n]
print(str(makeChange(13,[1,5,10])))
