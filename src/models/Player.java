package models;

public class Player {
    private int num;
    private int weight;
    private int born;
    private String name;
    private String pos;
    private String college;

    public Player(String name, int num, String pos, int weight, int born, String college){
        setName(name);
        setNum(num);
        setPos(pos);
        setWeight(weight);
        setBorn(born);
        setCollege(college);
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
