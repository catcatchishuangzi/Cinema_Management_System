package operation;

import film.Film;
import film.FilmList;

import java.util.Scanner;

public class ModifyFilm implements IFilm {
    public void work(FilmList filmList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的电影：");
        System.out.println("1.夏目友人帐 2.咒术回战 3.凹凸世界 4.卫宫家今天的饭 5.只因你太美");
        int name = sc.nextInt();
        if (name > 0 && name < 6) {
            System.out.println("请输入修改后的票价：");
            int price = sc.nextInt();
            System.out.println("请输入修改后的人数：");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("请输入修改后的时间（场次）：");
            String time = sc.nextLine();
            System.out.println("请输入修改后的影厅：");
            String hall = sc.nextLine();

            Film film = filmList.getFilm(name - 1);
            film.setPrice(price);
            film.setNumber(number);
            film.setTime(time);
            film.setHall(hall);
            System.out.println("修改成功！");
        } else {
            System.out.println("请重新输入");
        }
    }
}