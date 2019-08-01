import java.util.Scanner;

public class CakeCase {
    //两个格子坐标为（x1,y1）(x2,y2)
    //距离为（x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)的算术平方根
    //计算两个坐标的算术平方根
    public boolean isRight(int x1,int y1,int x2,int y2){
        if(x1<0||x2<0||y1<0||y2<0){
            return  false;
        }
        double number=(double)((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        if  (Math.sqrt(number)!=2){
            return true;
        }else{
            return false;
        }
    }
    public int putCake(int row,int column){
        int count=0;
       int[][] row1=new int[row][column];
        int[][] column1=new  int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;i<column;i++){

            }
            }

        for(int i=1;i<row;i++){
            for(int j=1;j<column;j++){
                if(isRight(i-1,j-1,i,j)){

                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] str=a.split(" ");
        int row=Integer.parseInt(str[0]);  //行数
        int column=Integer.parseInt(str[1]);  //列数
        CakeCase C=new CakeCase();
        System.out.println(C.putCake(row,column));*/
        Scanner s = new Scanner(System.in);
        while (s.hasNext())
        {
            int m = s.nextInt();
            int n = s.nextInt();
            int count = 0;
            int[][] arr = new int[n][m];//数组值默认为0
            for (int i=0; i<n; ++i)
            {
                for (int j=0; j<m; ++j)
                {
                    if (arr[i][j] == 0)
                    {
                        //count表示可以放的蛋糕数
                        count ++;
                        //将下面两行的数组值设为0
                        if (i+2 < n)
                        {
                            arr[i+2][j] = -1;
                        }
                        //将右边两个元素的值设为0
                        if (j+2 < m)
                        {
                            arr[i][j+2] = -1;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }

}
