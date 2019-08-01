import java.util.Scanner;

public class ClassMain {
    //找出输入字符串中最长的数字字符串

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if(str.length()==0||str==null){
            System.out.println("");
        }
        str.trim();//将字符串中的空格 去掉


        StringBuffer strs=new StringBuffer();
        StringBuffer nstrs=new StringBuffer();
        int i=0;
        for(i=0;i<str.length();i++){
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                strs.append(str.charAt(i));
            } else if (str.charAt(i) < '0'|| str.charAt(i) > '9') {
                strs = new StringBuffer("");
            }
            if (nstrs.length() < strs.length()) {
                nstrs = strs;
            }
        }
        if(nstrs.length()!=0){
            System.out.println(nstrs.toString());
        }
        else
            System.out.println("");
    }
}
