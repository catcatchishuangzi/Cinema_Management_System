package operation;

import film.FilmList;

import java.util.Scanner;

public class Passwordm implements IOperation{

    public void work(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入旧密码：");
        String oldPassword = scanner.nextLine();
        System.out.println("请输入新密码：");
        String newPassword = scanner.nextLine();

        if (changePassword(oldPassword, newPassword)) {
            System.out.println("密码修改成功！");
        } else {
            System.out.println("密码修改失败！");
        }
    }

    private boolean changePassword(String oldPassword, String newPassword) {
            if (oldPassword.equals(newPassword)) {
                return false;
            } else if(newPassword.length()>7){
                return true;
            } else{
                return false;
            }
    }
}
