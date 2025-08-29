class Solution {
    private boolean[] visited;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        visited = new boolean[n];
        return dfs(graph, source, destination);
    }

    private boolean dfs(List<List<Integer>> graph, int node, int end) {
        if(node == end) return true;
        visited[node] = true;

        for(int neighbor : graph.get(node)) {
            if(!visited[neighbor] && dfs(graph, neighbor, end)) {
                return true;
            }
        }
        return false;
    }


}