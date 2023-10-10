package manager;

import film.FilmList;
import operation.*;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilmList filmList = new FilmList();
        IFilm[] operations = {
                new Addfilm(),
                new DelFilm(),
                new ModifyFilm(),
                new DisplayFilm(),
                new ScheduleManagement()
        };

        while (true) {
            System.out.println("请选择要执行的操作：");
            System.out.println("1. 添加影片");
            System.out.println("2. 删除影片");
            System.out.println("3. 修改影片");
            System.out.println("4. 列出影片");
            System.out.println("5. 排片管理");
            System.out.println("0. 退出");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice >= 1 && choice <= 5) {
                operations[choice - 1].work(filmList);
            } else {
                System.out.println("无效的选择，请重新输入！");
            }
        }
    }
}

