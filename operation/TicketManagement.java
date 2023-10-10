package operation;

import film.Film;
import film.FilmList;
import java.util.Scanner;

public class TicketManagement implements IFilm {
    public void work(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择票务管理操作：");
        System.out.println("1. 查看所有电影放映信息");
        System.out.println("2. 查看指定电影放映信息");
        System.out.println("3. 购票");
        System.out.println("4. 付账");
        System.out.println("5. 取票");
        System.out.println("6. 查看购票历史");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayAllSchedules(filmList);
                break;
            case 2:
                displayFilmSchedule(filmList);
                break;
            case 3:
                buyTicket(filmList);
                break;
            case 4:
                payBill();
                break;
            case 5:
                getTicket();
                break;
            case 6:
                viewPurchaseHistory();
                break;
            default:
                System.out.println("无效的选择");
                break;
        }
    }

    public void displayAllSchedules(FilmList filmList) {
        System.out.println("所有电影放映信息如下：");
        for (int i = 0; i < filmList.getUsedsize(); i++) {
            Film film = filmList.getFilm(i);
            System.out.println("电影名称：" + film.getName());
            System.out.println("时间：" + film.getTime());
            System.out.println("价格：" + film.getPrice());
            System.out.println("--------------------");
        }
    }

    public void displayFilmSchedule(FilmList filmList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查看的电影名称：");
        String filmName = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < filmList.getUsedsize(); i++) {
            Film film = filmList.getFilm(i);
            if (film.getName().equals(filmName)) {
                System.out.println("电影名称：" + film.getName());
                System.out.println("时间：" + film.getTime());
                System.out.println("价格：" + film.getPrice());
                System.out.println("--------------------");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("电影不存在！");
        }
    }
    public void buyTicket(FilmList filmList) {
        boolean[][] seats = new boolean[7][12]; // 7行12列的座位矩阵
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要购买的电影名称：");
        String filmName = scanner.nextLine();
        System.out.println("请输入购买的座位号（如A1）：");
        String seatNumber = scanner.nextLine();
        String film = filmList.getName(filmName); // 根据电影名称获取电影对象
        int row = seatNumber.charAt(0) - 'A'; // 座位所在行数（从0开始）
        int col = Integer.parseInt(seatNumber.substring(1)) - 1; // 座位所在列数（从0开始）
        if (row >= 0 && row < 7 && col >= 0 && col < 12) { // 判断座位是否有效
            if (!seats[row][col]) { // 判断座位是否已售
                seats[row][col] = true; // 标记座位为已售
                System.out.println("购票成功！");
            } else {
                System.out.println("该座位已售出，请选择其他座位！");
            }
        } else {
            System.out.println("座位号无效！");
        }
        System.out.println("当前座位情况：");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j]) {
                    System.out.print("X "); // 已售座位
                } else {
                    System.out.print("O "); // 空位
                }
            }
            System.out.println();
        }
    }

    public void payBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入支付金额：");
        double amount = scanner.nextDouble();
        // 在这里付账
        System.out.println("支付成功！");
    }

    public void getTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入电影票的电子ID编号：");
        String ticketId = scanner.nextLine();
        // 在这里取票
        System.out.println("取票成功！");
    }

    public void viewPurchaseHistory() {
        System.out.println("购票历史如下：");
        // 在这里查看购票历史
    }
}

