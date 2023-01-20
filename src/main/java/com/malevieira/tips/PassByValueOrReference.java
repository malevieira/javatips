package com.malevieira.tips;

class BaseClass {

    private Integer levelOfPerformance = 0;

    public BaseClass() { }

    public BaseClass(Integer levelOfPerformance) {
        this.levelOfPerformance = levelOfPerformance;
    }

    public Integer getLevelOfPerformance() {
        return levelOfPerformance;
    }

    public void setLevelOfPerformance(Integer levelOfPerformance) {
        this.levelOfPerformance = levelOfPerformance;
    }
}

public class PassByValueOrReference {

    public static void main(String[] args) {

        BaseClass myBaseClass = new BaseClass();
        myBaseClass.setLevelOfPerformance(10);

        System.out.println("Before increase : " + myBaseClass);
        increaseLevelOfPerformance(myBaseClass);
        System.out.println(myBaseClass.getLevelOfPerformance());

    }

    private static void increaseLevelOfPerformance(BaseClass baseClass) {

        baseClass = new BaseClass();
        // the below code doesn't impact the parameter baseClass
        // because it will receive a new reference from (new BaseClass() instantiation)
        baseClass = new BaseClass();
        baseClass.setLevelOfPerformance(756);
    }
}
