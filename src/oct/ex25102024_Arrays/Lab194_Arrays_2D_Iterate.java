package oct.ex25102024_Arrays;

public class Lab194_Arrays_2D_Iterate {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        //roes -3 & col - 3

        for(int i = 0;i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length;j++ )
            {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
