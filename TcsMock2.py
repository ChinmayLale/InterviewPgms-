import sys
def bfs(webpages, start_page, end_page):
    queue = [start_page]
    visited = set()

    while queue:
        page = queue.pop(0)

        if page == end_page:
            return len(visited)

        for linked_page in webpages[page]:
            if linked_page not in visited:
                visited.add(linked_page)
                queue.append(linked_page)

    return -1


def solve(input_data):
    # Read the number of web pages.
    n = int(input_data[0])

    # Create a dictionary mapping page numbers to lists of linked page numbers.
    webpages = {}
    for i in range(1, n + 1):
        webpages[i] = list(map(int, input_data[i].split()))

    # Read the start and end page numbers.
    start_page = int(input_data[n + 1])
    end_page = int(input_data[n + 2])

    # Find the minimum number of clicks required to reach the end page from the start page using a breadth-first search algorithm.
    min_clicks = bfs(webpages, start_page, end_page)

    return min_clicks


if __name__ == '__main__':
    input_data = []
    for line in sys.stdin:
        input_data.append(line.strip())

    min_clicks = solve(input_data)

    print(min_clicks)
