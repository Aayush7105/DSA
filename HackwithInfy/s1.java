package HackwithInfy;

import java.util.Scanner;

public class s1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    char[][] grid = new char[n][m];

    for (int i = 0; i < n; i++) {
      String row = sc.next();
      for (int j = 0; j < m; j++) {
        grid[i][j] = row.charAt(j);
      }
    }

    System.out.println(minTime(grid));
    sc.close();
  }

  public static int minTime(char[][] grid) {
    int n = grid.length, m = grid[0].length;
    int time = 0;

    while (true) {
      boolean changed = false;
      boolean hasEnemy = false;

      char[][] temp = new char[n][m];

      for (int i = 0; i < n; i++) {
        temp[i] = grid[i].clone();
      }

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {

          if (grid[i][j] == 'E') {
            hasEnemy = true;
            if ((i > 0 && grid[i - 1][j] == 'A') ||
                (i < n - 1 && grid[i + 1][j] == 'A') ||
                (j > 0 && grid[i][j - 1] == 'A') ||
                (j < m - 1 && grid[i][j + 1] == 'A')) {

              temp[i][j] = 'A';
              changed = true;
            }
          }
        }
      }
      if (!hasEnemy)
        return time;
      if (!changed)
        return -1;

      grid = temp;
      time++;
    }
  }
}
