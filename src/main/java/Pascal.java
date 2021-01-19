/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int[][] bluh = new int[n][n];
        bluh[0][0]=1;
        for(int i = 0; i <bluh.length; i ++){
            bluh[i][0]=1;
            for(int j = 0;j < bluh[0].length; j++){
                bluh[i][j]=bluh[i-1][j-1]+bluh[i-1][j];
            }
        }
        return bluh;
    }
}
