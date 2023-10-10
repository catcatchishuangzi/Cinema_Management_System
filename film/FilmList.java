package film;

public class FilmList {
    private int usedsize;
    private Film[] films;

    public FilmList() {
        this.films = new Film[10];
        films[0]=new Film("夏目友人帐","大森贵弘","夏目贵志",30,
                "治愈","真的很喜欢看!","8月23日19：00——20:00","No1.hall",84);
        films[1]=new Film("咒术回战","竹下良平","虎杖悠仁" ,40,
                "战斗","出第二季了朋友们","8月24日8:00——9:30","No2.hall",84);
        films[2]=new Film("凹凸世界","严猛涛","金，格瑞",35,
                "热血","七创社你做个人吧","8月24日10:00——12:00","激光厅",84);
        films[3]=new Film("卫宫家今天的饭","三浦贵博","卫宫士郎",30,
                "日常","好好吃的样子","8月24日15:00——16:00","No3.hall",84);
        films[4]=new Film("只因你太美","只因棚工作室","坤坤",50,
                "偶像","唱跳rap打篮球","8月25日0:00——2:30","No4.hall",84);
        this.usedsize=5;
    }
    //下面可以写一些功能；
    public void  setFilms(int pos,Film film){ this.films[pos]=film; }

    public Film getFilm(int pos){
        return this.films[pos];
    }

    public int getUsedsize() { return usedsize; }

    public Film[] getFilms() {
        return films;
    }

    public void setUsedsize(int usedsize) {
        this.usedsize = usedsize;
    }

    public String getName(String filmname) { return filmname ; }
}
