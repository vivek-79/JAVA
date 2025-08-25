package Graph;

public class G_3_No_Of_Provience {
    private void bfs(int[][] isConnected, int[] vis, int i) {

        vis[i] = 1;

        for (int j = 0; j < isConnected.length; j++) {

            if (isConnected[i][j] == 1 && vis[j] != 1) {
                bfs(isConnected, vis, j);
            }
        }

    }

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        int[] vis = new int[n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {

            if (vis[i] != 1) {
                cnt++;
                bfs(isConnected, vis, i);
            }
        }
        ;

        return cnt;
    }
}
