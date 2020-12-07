package com.example.rnrtask;

class MyListData {

    private String name;
    private String points;
    private int imgId;

    public MyListData(String name,String points, int imgId) {
        this.name = name;
        this.points = points;
        this.imgId = imgId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

}
