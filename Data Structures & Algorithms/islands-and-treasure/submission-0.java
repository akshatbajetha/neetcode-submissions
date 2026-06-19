class Solution {
    int INF = 2147483647;

    
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        // int[][] visited = new int[n][m];
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0){
                    q.offer(new int[] {i, j});
                }
            }
        }

        if(q.size() == 0) return;

        while(!q.isEmpty()){
            int[] coords = q.poll();
            int x = coords[0];
            int y = coords[1];

            for(int i = 0; i < 4; i++){
                int newX = x + directions[i][0];
                int newY = y + directions[i][1];

                if(newX < 0 || newX >= n || newY < 0 || newY >= m || grid[newX][newY] != INF) continue;

                q.offer(new int[] {newX, newY});
                grid[newX][newY] = grid[x][y] + 1;
            }
        }

    }
}
