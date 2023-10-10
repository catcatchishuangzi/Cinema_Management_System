package operation;

import film.FilmList;
import java.util.Scanner;

public class Userm implements IOperation{
    public void work(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入密码：");
        String password = scanner.nextLine();

        if (username.equals(" ")||password.equals(" ")) {
            System.out.println("用户创建失败！");
        } else {
            System.out.println("用户创建成功！");
        }
    }
}
