package lesson4;

public class matrixMultiplication {
    public static void main(String[] args) {
        int [][] mat1={{0,1,2},{3,4,5},{6,7,8}};
        int [][] mat2={{9,10,11},{12,13,14},{15,16,17}};
        int r1=3,r2=3,c1=3,c2=3;
        int[][] pro=multiplyMatrix(mat1,mat2,r1,c1,c2);
        display(pro);

    }
    public static int [][] multiplyMatrix(int [][]mat1,int [][]mat2,int r1,int c1,int c2){
        int [][] pro=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    pro[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        return pro;

    }
    static void display(int [][] matrix){
        for (int[] row:matrix){
            for (int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
