import java.util.Scanner;

public class Count {
    //计算给定正整数n，计算其十进制下的所有位置数字之和
    //并计算其平方的各位数字之和
    public static int count(int num){
        String a = Integer.toString(num);
        int count=0;
        for(int i=0;i<a.length();i++){
            count+=Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int num=scanner.nextInt();
            if(num<10) {
                System.out.print(num+" ");
                int x=(int)Math.pow(num,2);
                System.out.println(count(x));
            }
            else {
                System.out.print(count(num)+" ");
                int x=(int)Math.pow(num,2);
                System.out.println(count(x));
            }
        }
    }
}
