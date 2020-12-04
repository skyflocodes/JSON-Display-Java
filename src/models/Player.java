package models;

import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("num")
    private int num;
    @SerializedName("weight")
    private int weight;
    @SerializedName("born")
    private int born;
    @SerializedName("name")
    private String name;
    @SerializedName("pos")
    private String pos;
    @SerializedName("college")
    private String college;
    @SerializedName("imgURL")
    private String imgURL;

    /**
     * player object
     * @param name
     * @param num
     * @param pos
     * @param weight
     * @param born
     * @param college
     * @param imgURL
     */
    public Player(String name, int num, String pos, int weight, int born, String college, String imgURL){
        setImgURL(imgURL);
        setName(name);
        setNum(num);
        setPos(pos);
        setWeight(weight);
        setBorn(born);
        setCollege(college);
    }

    /**
     * returns the players image url
     * @return
     */
    public String getImgURL() {
        return imgURL;
    }

    /**
     * sets the players image url
     * @param imgURL
     */
    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    /**
     * returns players number
     * @return
     */
    public int getNum() {
        return num;
    }

    /**
     * if the number is valid this sets the players number to it
     * @param num
     */
    public void setNum(int num) {
        if (num>=0 && num<=100) {
            this.num = num;
        }
        else{
            throw new IllegalArgumentException("Number is invalid, Please pick a number from 0-100.");
        }
    }

    /**
     * returns player weight
     * @return
     */
    public int getWeight() {
            return weight;
    }

    /**
     * sets players weight if it fits within the range
     * @param weight
     */
    public void setWeight(int weight) {
        if(weight>=120 && weight<=380) {
        this.weight = weight;
        }else{
            throw new IllegalArgumentException("This player is either too heavy or too light for the nba, sorry.");
        }
    }

    /**
     * returns players birth year
     * @return
     */
    public int getBorn() {
        return born;
    }

    /**
     * sets players birth year if it fits within the range
     * @param born
     */
    public void setBorn(int born) {
        if (born>=1975 && born<=2002){
            this.born = born;
        }else{
            throw new IllegalArgumentException("This player is either too old or too young for the nba, sorry.");
        }
    }

    /**
     * returns players name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * sets players name if it follows the allowed characters
     * @param name
     */
    public void setName(String name) {
        if(name.matches("[A-z]*[-\\s]?[\\sA-z]*")){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Please input a name containing only A-z, spaces, and hyphens.");
        }
    }

    /**
     * gets players position
     * @return
     */
    public String getPos() {
        return pos;
    }

    /**
     * checks if their position is either front or back court then sets it
     * @param pos
     */
    public void setPos(String pos) {
        if (pos.equals("FrontCourt")  || pos.equals("BackCourt")){
            this.pos = pos;
        }else {
            throw new IllegalArgumentException("Please input a proper position.");
        }
    }

    /**
     * gets players college
     * @return
     */
    public String getCollege() {
        return college;
    }

    /**
     * sets players college if it follows the allowed characters
     * @param college
     */
    public void setCollege(String college) {
        if(college.matches("[A-z]*[-\\s]?[\\sA-z()]*")) {
            this.college = college;
        }else{
            throw new IllegalArgumentException("Please input a college name containing only A-z, spaces, hyphens, and parenthesis.");
        }
    }

    /**
     * makes a readable string for displaying player information
     * @return
     */
    @Override
    public String toString() {
        return "Number " + num + ", " + name + ". From "+ college + ".";
    }
}
