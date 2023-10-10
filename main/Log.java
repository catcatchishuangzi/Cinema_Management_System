package main;

import administration.Administrator;
import manager.Manager;
import reception.Reception;
import user.User;

import java.util.Scanner;

public class Log {

    public void adminLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入管理员用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入管理员密码：");
        String password = scanner.nextLine();

        String adminUsername = "admin";
        String adminPassword = "ynuinfo#777";
        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("欢迎管理员登录电影院系统！");
            Administrator.main(null);
        } else {
            System.out.println("账户或密码错误！");
        }
    }

    public void managerLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入经理用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入经理密码：");
        String password = scanner.nextLine();

        if (username.equals("manager") && password.equals("ynuman")) {
            System.out.println("欢迎经理登录电影院系统！");
            Manager.main(null);
        } else {
            System.out.println("用户名或密码错误！");
        }
    }

    public void receptionLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入前台用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入前台密码：");
        String password = scanner.nextLine();

        if (username.equals("reception") && password.equals("ynurec")) {
            System.out.println("欢迎前台登录电影院系统！");
            Reception.main(null);
        } else {
            System.out.println("用户名或密码错误！");
        }
    }

    public void userLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入用户密码：");
        String password = scanner.nextLine();

        if (username.equals("user") && password.equals("ynuuser")) {
            System.out.println("欢迎用户登录电影院系统！");
            User.main(null);
        } else {
            System.out.println("用户名或密码错误！");
        }
    }
}

