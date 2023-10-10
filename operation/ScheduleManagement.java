package operation;

import film.Film;
import film.FilmList;

import java.util.Scanner;

public class ScheduleManagement implements IFilm {

    public void work(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择排片管理操作：");
        System.out.println("1. 增加场次");
        System.out.println("2. 修改场次");
        System.out.println("3. 删除场次");
        System.out.println("4. 列出所有场次信息");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addSchedule(filmList);
                break;
            case 2:
                modifySchedule(filmList);
                break;
            case 3:
                deleteSchedule(filmList);
                break;
            case 4:
                listAllSchedules(filmList);
                break;
            default:
                System.out.println("无效的选择");
                break;
        }
    }

    public void addSchedule(FilmList filmList) {
        // 增加场次的逻辑
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入电影名称：");
        String filmName = scanner.nextLine();
        System.out.println("请输入时间：");
        String time = scanner.nextLine();
        System.out.println("请输入价格：");
        double price = scanner.nextDouble();

        // 根据电影名称查找电影
        Film film = null;
        for (int i = 0; i < filmList.getUsedsize(); i++) {
            if (filmList.getFilm(i).getName().equals(filmName)) {
                film = filmList.getFilm(i);
                break;
            }
        }

        if (film != null) {
            System.out.println("成功添加场次！");
        } else {
            System.out.println("电影不存在！");
        }
    }

    public void modifySchedule(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的场次编号：");
        int scheduleId = scanner.nextInt();

        System.out.println("成功修改场次！");
    }

    public void deleteSchedule(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的场次编号：");
        int scheduleId = scanner.nextInt();

        System.out.println("成功删除场次！");
    }

    public void listAllSchedules(FilmList filmList) {
        System.out.println("所有场次信息如下：");
        for (int i = 0; i < filmList.getUsedsize(); i++) {
            Film film = filmList.getFilm(i);
            System.out.println("场次编号：" + (i + 1));
            System.out.println("电影名称：" + film.getName());
            System.out.println("时间：" + film.getTime());
            System.out.println("价格：" + film.getPrice());
            System.out.println("--------------------");
        }
    }
}

