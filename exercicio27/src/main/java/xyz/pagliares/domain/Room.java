package xyz.pagliares.domain;

public class Room {
    private Integer number;
    private String name;
    private String type;
    private Integer floor;
    private String description;
    private Double dailyRate;
    private Double dimension; // square meters

//    public  Room(Integer number){
//        this.number = number;
//    }
//
//    public Room(Integer number, String type) {
//        this.number = number;
//        this.type = type;
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Double dailyRate) {
        this.dailyRate = dailyRate;
    }


    public double getDimension() {
        return dimension;
    }

    public void setDimension(Double dimension) {
        this.dimension = dimension;
    }
}
