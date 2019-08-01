import java.util.Stack;

public class Convert {
    //将一串字母进行z字变换
    public static String convert(String s, int numRows){
        if(s.length()==0||s.isEmpty()){
            return "";
        }
        if(numRows==1){
            return s;
        }
        if(numRows>=s.length()){
            return "";
        }
        char[] ch=s.toCharArray();
        StringBuffer buff=new StringBuffer(s.charAt(0));
        int count=0;
        while(numRows + numRows - 2<1) {
            for (int i = 0; i < s.length(); i += (numRows + numRows - 2)) {
                buff.append(ch[i]);
            }
            count++;
      }
        return buff.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert(new String("LEETCODEISHIRING"),4));
    }
}
