import java.util.Scanner;

public class ChangeString {
    //给定两个字符串，检查第二个字符串插入第一个字符串后是否是回文字符串
    public static boolean changeHuiWen(String A){
        if(A.isEmpty()||A==null){
            return false;
        }
        StringBuffer stringBuffer=new StringBuffer();
        A.trim();
        for(int i=A.length()-1;i>=0;i--){
            stringBuffer.append(A.charAt(i));
        }
        if(stringBuffer.toString().equals(A.trim())){
            return true;
        }
        return false;
    }
    public static int insertChar(String A,String B){
        int count=0;
        String F=A+B;
        String E=B+A;
        if(changeHuiWen(F)){
            count++;
        }
        if(changeHuiWen(E)){
            count++;
        }
        for(int i=0;i<A.length()-1;i++) {
            String C = A.substring(0, i + 1);
            String D = A.substring(i + 1, A.length());
            System.out.println(C);
            System.out.println(D);
            StringBuffer stringBuffer1=new StringBuffer();
            stringBuffer1.append(C).append(B).append(D);
            System.out.println(stringBuffer1.toString());
            if (changeHuiWen(stringBuffer1.toString())) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
      //  Scanner scanner=new Scanner(System.in);
        String A="abba";
        String B="b";
        System.out.println(insertChar(A,B));
    }
}
