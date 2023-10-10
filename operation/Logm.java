package operation;

import film.FilmList;

import java.util.Scanner;

public class Logm implements IOperation {

    private String username;
    private String password;
    Scanner scanner = new Scanner(System.in);

    public void work(FilmList filmList) {
        System.out.println("请输入用户名：");
        username = scanner.nextLine();
        System.out.println("请输入密码：");
        password = scanner.nextLine();
        // 验证用户名和密码
        if (validateUser(username ,password)) {
            System.out.println("登录成功！");
        } else {
            System.out.println("用户名或密码错误！");
        }
    }
    private boolean validateUser(String validUsername ,String validPassword) {
        // 检查用户名和密码是否匹配
        if (username.equals(validUsername) && password.equals(validPassword)) {
            return true; // 验证通过
        } else {
            return false; // 验证失败
        }
    }
}

