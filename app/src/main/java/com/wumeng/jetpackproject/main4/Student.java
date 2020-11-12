package com.wumeng.jetpackproject.main4;

/**
 * @author WuMeng
 * @date 2020/11/4
 * desc:
 */
public class Student {

    /**
     * 学号
     */
    private int stuNumber;

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 分数
     */
    private int stuScore;

    public Student() {

    }

    public Student(int stuNumber, String stuName, int stuScore) {
        this.stuNumber = stuNumber;
        this.stuName = stuName;
        this.stuScore = stuScore;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }
}
