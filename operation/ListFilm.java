package operation;

import film.Film;
import film.FilmList;

public class ListFilm implements IFilm {
    public void work(FilmList filmList) {
        for (int i = 0; i < filmList.getUsedsize(); i++) {
            Film film = filmList.getFilm(i);
            System.out.println(film);
        }
        System.out.println("以上是全部电影");
    }
}
