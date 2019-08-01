import java.util.Scanner;
public class BuildTree {

    StringBuilder SB=new StringBuilder();
    public String tree2str(TreeNode t) {
        if(t==null)
            return "";
        help(t);
        return SB.toString();

    }
    private void help(TreeNode t)
    {
        if(t==null)
            return;
        if(t.left==null&&t.right==null)
            SB.append(t.val);
        else if(t.right==null)
        {
            SB.append(t.val).append("(");
            help(t.left);

            SB.append(")");
        }
        else
        {
            SB.append(t.val).append("(");
            help(t.left);
            SB.append(")(");
            help(t.right);
            SB.append(")");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
    }
}
