import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Git,AAA");

        int year;
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个年份：");
        year = scan.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
