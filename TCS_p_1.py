def find_max_length(L, K):
    if K == 0:
        return 0

    max_zeros = [0] * L
    ones = sorted(list(range(1, K + 1)))

    for i in range(len(ones)):
        max_zeros[ones[i] - 1] = ones[i]

    if K < L:
        max_zeros[K] = L + 1

    max_length = 0
    count = 0

    for i in range(L):
        if max_zeros[i] == 0:
            count += 1
        else:
            count = 0
        max_length = max(max_length, count)

    return max_length


# Input
L, K = map(int, input().split())

# Output
print(find_max_length(L, K))