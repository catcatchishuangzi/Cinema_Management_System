package operation;

import film.Film;
import film.FilmList;

import java.util.Scanner;

public class Addfilm implements IFilm {
    public void work(FilmList filmList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入电影名字：");
        String name = sc.nextLine();
        System.out.print("请输入导演：");
        String director = sc.nextLine();
        System.out.print("请输入主演：");
        String mainactor = sc.nextLine();
        System.out.print("请输入电影票价格：");
        int price = sc.nextInt();
        sc.nextLine(); // 读取换行符
        System.out.print("请输入电影类别：");
        String type = sc.nextLine();
        System.out.print("请输入电影简介：");
        String introduction = sc.nextLine();
        System.out.print("请输入场次：");
        String time = sc.nextLine();
        System.out.print("请输入影厅：");
        String hall = sc.nextLine();
        System.out.print("请输入人数：");
        int number = sc.nextInt();
        Film film = new Film(name, director, mainactor, price, type, introduction, time, hall, number);
        int len = filmList.getUsedsize();
        filmList.setFilms(len, film);
        filmList.setUsedsize(len + 1);
        System.out.println("添加成功！");
    }
}

