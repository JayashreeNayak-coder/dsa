class Solution {
    public void setZeroes(int[][] matrix) {

        ArrayList<int[]> list=new ArrayList<>();

        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    list.add(new int[]{i, j});
                   
                }
            }
        }
        for(int i=0;i<list.size();i++){

        
         for(int k=0;k<m;k++)
            matrix[list.get(i)[0]][k]=0;

         for(int l=0;l<n;l++)
            matrix[l][list.get(i)[1]]=0; 
       
        }  
    }
}