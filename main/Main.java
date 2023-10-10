package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Log log = new Log();

        System.out.println("欢迎登录电影院系统：");
        System.out.println("请选择登录身份：");
        System.out.println("1. 管理员");
        System.out.println("2. 经理");
        System.out.println("3. 前台");
        System.out.println("4. 用户");
        System.out.println("0. 退出");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                log.adminLogin();
                break;
            case 2:
                log.managerLogin();
                break;
            case 3:
                log.receptionLogin();
                break;
            case 4:
                log.userLogin();
                break;
            case 0:
                System.out.println("退出系统");
                break;
            default:
                System.out.println("无效的选择");
                break;
        }
    }
}
