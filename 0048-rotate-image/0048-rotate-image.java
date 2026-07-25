class Solution {
    public void rotate(int[][] matrix) {

        int n=matrix.length;
        int i=0,k=0;
        int loop=1;
        int temp=0;

    while(n>1){

        for(int j=k;j<k+n-1;j++){

            loop=1;
            int row=i;
            int col=j;
            int curr=matrix[i][j];

            while(loop<=4){
            int[] pos = findNew(row - i, col - k, n);
            temp = matrix[pos[0] + i][pos[1] + k];
            matrix[pos[0] + i][pos[1] + k] = curr;
            row = pos[0] + i;
            col = pos[1] + k;
            curr=temp;
            loop++;
            }
            
        }
        n=n-2;
        i=i+1;
        k=k+1;
    }

    }
    public int[] findNew(int row, int col, int n) {

    n = n - 1;

    int newRow = col;
    int newCol = n - row;

    return new int[]{newRow, newCol};
}
}