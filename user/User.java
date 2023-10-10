package user;

import film.FilmList;
import operation.*;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilmList filmList = new FilmList();
        IOperation[] operations = {
                new Passwordm(),
                new Logm()
        };
        IFilm[] operation = {
                new TicketManagement()
        };
        while (true) {
            System.out.println("请选择要执行的操作：");
            System.out.println("1. 密码管理");
            System.out.println("2. 重新登录");
            System.out.println("3. 购票服务");
            System.out.println("0. 退出");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }
            else if (choice >= 1 && choice <= 2) {
                operations[choice - 1].work(filmList);
            }
            else if (choice == 3){
                operation[choice -3].work(filmList);
            }
            else {
                System.out.println("无效的选择，请重新输入！");
            }
        }
    }
}