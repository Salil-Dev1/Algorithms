package org.Algos.Questions;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PathWithMinimumEffort {

        static int minimumEffortPath(int[][] heights) {
            int n = heights.length;
            int m = heights[0].length;

            PriorityQueue<Pairs> q = new PriorityQueue<>((x, y)-> x.diff - y.diff);
            int [][] dist = new int[n][m];

            for(int i =0;i<n;i++){
                for(int j = 0;j<m;j++){
                    dist[i][j] = (int) 1e9;
                }
            }

            dist[0][0] = 0;
            q.offer(new Pairs(0,0,0));
            int dRow []  = {-1,0,1,0};
            int dCol [] = {0,1,0,-1};
            int difference = 0;
            while(!q.isEmpty())
            {
                int row = q.peek().pRow;
                int col = q.peek().pCol;
                int dis = q.peek().diff;
                q.remove();

                if(row == n-1 && col == m-1) return dis;

                for(int i = 0;i<4;i++){
                    int nRow = row + dRow[i];
                    int nCol = col + dCol[i];

                    if(nRow >=0 && nRow < n && nCol >=0 && nCol < m){
                        difference = Math.max(Math.abs(heights[row][col] - heights[nRow][nCol]),dis);
                        if(difference < dist[nRow][nCol])
                        {
                            dist[nRow][nCol] = difference;
                            q.offer(new Pairs(nRow,nCol,difference));
                        }

                    }

                }
            }
            return 0;
        }

    public static void main(String[] args) {
        int [][] heights = new int[3][3];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = s1.nextInt();
        System.out.println("Enter number of columns");
        int col = s1.nextInt();
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.println("Enter value for "+i+" and "+j+ " ");
                int value = s1.nextInt();
                heights[i][j] = value;
            }
        }

        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(heights[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Minimum Path Effort is : " + minimumEffortPath(heights));
    }
    }

    class Pairs{
        int pRow,pCol,diff;
        public Pairs(int pRow, int pCol,int diff){
            this.pRow = pRow;
            this.pCol = pCol;
            this.diff = diff;
        }
    }

