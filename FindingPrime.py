
def isPrime(value : int) -> bool:
    for i in range(2, value-1):
        if value % i == 0:
            return False
    return True
primeNum = []
for num in range(6, 600):
    if isPrime(num):
        if num % 2 == 0 or num % 3 == 0 or num % 5 == 0:
            continue;
        primeNum.append(num)


for i in range(0, len(primeNum), 10):
    for j in range(i,i+10) :
        if j == len(primeNum) : break
        print(primeNum[j], end = "  ")
    print()




