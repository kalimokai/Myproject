import java.util.Scanner;

public class TernaryOperatorPlus {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        final int PASS = 60,
        ORDINARY = 70,
        GOOD = 80,
        EXCELLENT = 90,
        FULL = 100;
        System.out.print("请输入你的分数：");
        float score = input.nextFloat();
        input.close();
        String res = FULL <= score && score >= EXCELLENT ? "优秀" : 
        EXCELLENT < score && score >= ORDINARY ? "良好" :
        ORDINARY < score && score >= GOOD ? "一般" : 
        GOOD < score && score >=PASS ? "及格" :"不及格";
        System.out.println("你此次考试的结果为：" + res); 
    }
}
