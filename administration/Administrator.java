package administration;

import film.FilmList;
import operation.*;

import java.util.Scanner;

public class Administrator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilmList filmList = new FilmList();
        IOperation[] operations = {
                new Logm(),
                new Passwordm(),
                new Userm()
        };
        while (true) {
            System.out.println("请选择要执行的操作：");
            System.out.println("1. 登录管理");
            System.out.println("2. 密码管理");
            System.out.println("3. 用户管理");
            System.out.println("0. 退出");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice >= 1 && choice <= 3) {
                operations[choice - 1].work(filmList);
            } else {
                System.out.println("无效的选择，请重新输入！");
            }
        }
    }
}
