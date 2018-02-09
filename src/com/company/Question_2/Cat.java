package com.company.Question_2;

public class Cat extends Pet{

    private boolean likesCatnip;
    private boolean usesLitterbox;
    private String furType;


    public Cat(boolean likesCatnip, boolean usesLitterbox, String furType) {
        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;
    }

    public Cat(String name, boolean likesCatnip, boolean usesLitterbox, String furType) {
        super(name);
        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;
    }

    public Cat() {

    }

    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterbox() {
        return usesLitterbox;
    }

    public void setUsesLitterbox(boolean usesLitterbox) {
        this.usesLitterbox = usesLitterbox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }
}
