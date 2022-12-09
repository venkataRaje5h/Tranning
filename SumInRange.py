
nums = [3, 0, -2, 6, -3, 2]
queries = [[0, 2], [2, 5], [0, 5]]
result = 0;

for x in range(0, len(queries)):
    for index in range(queries[x][0], queries[x][1]+1):
        result += nums[index]

print(result % 1000000007)


