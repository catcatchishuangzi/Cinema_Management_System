package operation;

import film.Film;
import film.FilmList;

import java.util.Scanner;

public class DelFilm implements IFilm {
    public void work(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入需要删除的电影名字：");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < filmList.getUsedsize(); i++) {
            Film film = filmList.getFilm(i);
            if (film.getName().equals(name)) {
                break;
            }
        }
        if (i >= filmList.getUsedsize()) {
            System.out.println("没有要删除的了！");
            return;
        }
        int pos = i;
        for (int j = pos; j < filmList.getUsedsize() - 1; j++) {
            Film film = filmList.getFilm(j + 1);
            filmList.setFilms(j, film);
        }
        filmList.setUsedsize(filmList.getUsedsize() - 1);
        System.out.println("删除成功！");
    }
}
