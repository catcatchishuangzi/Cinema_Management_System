package operation;
import film.Film;
import film.FilmList;
import java.util.Scanner;

public class FoundFilm implements IFilm{
    public void work(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入需要查找的电影：");
        String name = scanner.nextLine();
        for (int i =0;i<filmList.getUsedsize();i++){
            Film film = filmList.getFilm(i);
            if(film.getName().equals(name)){
                System.out.println("查找成功");
                System.out.println(film);
                return;
            }
        }
        System.out.println("查找失败");
    }
}
