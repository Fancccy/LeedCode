import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.math.RoundingMode.*;

public class CountGrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] stu1 = new int[num];
            int[] stu2 = new int[num];
            for (int i = 0; i < num; i++) {
                stu1[i] = scanner.nextInt();
            }
            for (int i = 0; i < num; i++) {
                stu2[i] = scanner.nextInt();
            }
            System.out.printf("%.2f",countAll(stu1, stu2));
        }
    }
    public static double countAll(int[] stu1,int[] stu2){
       double[] num=new double[stu2.length];
       for(int i=0;i<stu2.length;i++){
          if(stu2[i]>=90&&stu2[i]<=100){
              num[i]=4.0;
          }
          else if(stu2[i]<=89&&stu2[i]>=85){
              num[i]=3.7;
          }
          else if(stu2[i]<=84&&stu2[i]>=82){
              num[i]=3.3;
          }
          else if(stu2[i]<=81&&stu2[i]>=78){
              num[i]=3.0;
          }
          else if(stu2[i]<=77&&stu2[i]>=75){
              num[i]=2.7;
          }
           else if(stu2[i]<74&&stu2[i]>=72){
              num[i]=2.3;
          }
          else if(stu2[i]<=71&&stu2[i]>=68){
              num[i]=2.0;
          }
          else if(stu2[i]<=67&&stu2[i]>=64){
              num[i]=1.5;
          }
          else if(stu2[i]<=63&&stu2[i]>=60){
              num[i]=1.0;
          }else{
              num[i]=0.0;
          }
       }
       int count=0;
       double rcount=0;
       for(int i=0;i<stu1.length;i++){
           count+=stu1[i];
           rcount+=stu1[i]*num[i];
       }
       double res=rcount/count;

        return res;
    }
}
