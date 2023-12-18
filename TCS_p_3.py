# from collections import defaultdict

# def find_max_skill_value_team(n, c, conflicts, skill):
#     # Create an adjacency list graph from the list of conflicts
#     graph = defaultdict(list)
#     for u, v in conflicts:
#         graph[u].append(v)
#         graph[v].append(u)

#     # Initialize the dp array
#     dp = skill[:]

#     # Bottom-up dynamic programming approach
#     for i in range(n-1, -1, -1):
#         for j in graph[i]:
#             # Fix the index error by checking if j is a valid index
#             if j < len(skill) and skill[i] > skill[j]:
#                 dp[i] = max(dp[i], dp[j] + skill[i])

#     # Find the maximum skill value team
#     max_skill_value_team = max(dp)

#     return max_skill_value_team

# # Function to parse the input
# def parse_input():
#     n, c = map(int, input().split())
#     conflicts = []
#     for _ in range(c):
#         u, v = map(int, input().split())
#         conflicts.append((u, v))
#     skill = list(map(int, input().split()))
#     return n, c, conflicts, skill

# # Function to print the output
# def print_output(max_skill_value_team):
#     print(max_skill_value_team)

# # Main function
# def main():
#     n, c, conflicts, skill = parse_input()
#     max_skill_value_team = find_max_skill_value_team(n, c, conflicts, skill)
#     print_output(max_skill_value_team)

# if __name__ == "__main__":
#     main()

def max_team_expertise(n, c, conflicts, expertise):
    # Create an adjacency list graph from the list of conflicts
    graph = {i: [] for i in range(1, n+1)}
    for conflict in conflicts:
        u, v = conflict
        graph[u].append(v)
        graph[v].append(u)

    # Initialize the dp array
    dp = [-1] * (n+1)

    # Stack to perform iterative DFS
    stack = []

    # Initialize max_expertise to 0
    max_expertise = 0

    # Iterate over all employees
    for i in range(1, n+1):
        if dp[i] == -1:
            stack.append(i)

            while stack:
                current_employee = stack.pop()

                if dp[current_employee] == -1:
                    dp[current_employee] = expertise[current_employee-1]

                    for neighbor in graph[current_employee]:
                        stack.append(neighbor)

                    max_expertise = max(max_expertise, dp[current_employee])

    return max_expertise

# Input parsing
n, c = map(int, input().split())
conflicts = [tuple(map(int, input().split())) for _ in range(c)]
expertise = list(map(int, input().split()))

# Output the result
result = max_team_expertise(n, c, conflicts, expertise)
print(result)
