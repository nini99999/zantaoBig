package com.poshist.zantaoBig.vo;

/**
 * Created by server on 17-5-12.
 */
public class ProjectVO {
    private Long waitSum;
    private Long doingSum;
    private Long doneSum;
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getWaitSum() {
        return waitSum;
    }

    public void setWaitSum(Long waitSum) {
        this.waitSum = waitSum;
    }

    public Long getDoingSum() {
        return doingSum;
    }

    public void setDoingSum(Long doingSum) {
        this.doingSum = doingSum;
    }

    public Long getDoneSum() {
        return doneSum;
    }

    public void setDoneSum(Long doneSum) {
        this.doneSum = doneSum;
    }

}
