package film;//电影信息录入函数

public class Film {
    private String name;
    private String director;
    private String mainactor;
    private int price;
    private String type;
    private String introduction;
    private String time;
    private String hall;
    private int number;

    public Film(String name, String director, String mainactor, int price, String type, String introduction, String time, String hall, int number) {
        this.name = name;
        this.director = director;
        this.mainactor = mainactor;
        this.price = price;
        this.type = type;
        this.introduction = introduction;
        this.time = time;
        this.hall = hall;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getMainactor() {
        return mainactor;
    }

    public int getPrice() {
        return price;
    }

    public String getType() { return type; }

    public String getIntroduction() {
        return introduction;
    }

    public String getTime() {
        return time;
    }

    public String getHall(){ return hall; }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setMainactor(String mainactor) {
        this.mainactor = mainactor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setHall(String hall){ this.hall = hall; }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "name:" + name  + ",director:" + director + ",mainactor:" + mainactor + ", price:" + price
                + ", type:" + type + ", introction:" + introduction + ", time:" + time + ", hall:" + hall
                + ", number:" + number;
    }

}

