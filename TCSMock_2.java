import java.util.*;
import java.io.*;

public class TCSMock_2 {
    static class Page {
        List<Integer> links;

        public Page() {
            links = new ArrayList<>();
        }
    }
    public static int minClicksToReachEndPage(int N, List<Page> pages, int startPage, int endPage) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < N; i++) {
            graph.put(i + 1, pages.get(i).links);
        }
        if (startPage == endPage) {
            return 0;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startPage, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentPage = current[0];
            int clicks = current[1];
            if (currentPage == endPage) {
                return clicks;
            }
            if (!visited.contains(currentPage)) {
                visited.add(currentPage);
                for (int page : graph.get(currentPage)) {
                    if (!visited.contains(page)) {
                        queue.add(new int[]{page, clicks + 1});
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Page> pages = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Page page = new Page();
            String[] links = reader.readLine().split(" ");
            for (String link : links) {
                page.links.add(Integer.parseInt(link));
            }
            pages.add(page);
        }
        String[] startEnd = reader.readLine().split(" ");
        int startPage = Integer.parseInt(startEnd[0]);
        int endPage = Integer.parseInt(startEnd[1]);
        System.out.println(minClicksToReachEndPage(N, pages, startPage, endPage));
    }
}
