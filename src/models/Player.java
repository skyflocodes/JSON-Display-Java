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
        if (num>=0 && num<=100) {
            this.num = num;
        }
        else{
            throw new IllegalArgumentException("Number is invalid, Please pick a number from 0-100.");
        }
    }

    public int getWeight() {
        if(weight>=120 && weight<=380) {
            return weight;
        }else{
            throw new IllegalArgumentException("This player is either too heavy or too light for the nba, sorry.");
        }
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        if (born>=1975 && born<=2002){
            this.born = born;
        }else{
            throw new IllegalArgumentException("This player is either too old or too young for the nba, sorry.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.matches("[A-z]*[-\\s]?[\\sA-z]*")){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Please input a name containing only A-z, spaces, and hyphens.");
        }
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        if (pos.equals("FrontCourt")  || pos.equals("BackCourt")){
            this.pos = pos;
        }else {
            throw new IllegalArgumentException("Please input a proper position.");
        }
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        if(college.matches("[A-z]*[-\\s]?[\\sA-z()]*")) {
            this.college = college;
        }else{
            throw new IllegalArgumentException("Please input a college name containing only A-z, spaces, hyphens, and parenthesis.");
        }
    }
}
