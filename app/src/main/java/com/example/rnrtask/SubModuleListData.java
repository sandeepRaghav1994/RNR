package com.example.rnrtask;

class SubModuleListData {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtilte() {
        return subtilte;
    }

    public void setSubtilte(String subtilte) {
        this.subtilte = subtilte;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    private String title;
    private String subtilte;
    private int imgId;

    public SubModuleListData(String title, String subtilte, int imgId) {
        this.title = title;
        this.subtilte = subtilte;
        this.imgId = imgId;
    }




}
