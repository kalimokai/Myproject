import java.util.Scanner;

public class TernaryOperator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的分数：");
        final int PASS = 60;
        float score = input.nextFloat();
        input.close();
        String res = score >= PASS ? "pass" : "no pass";
        System.out.println("您的成绩是" + score + "结果为：" + res);
    }
}
