package com.atkj.state.forum;

public abstract class AbstractState {
    // 抽象状态类
    protected ForumAccount acc;
    protected int point;
    protected String stateName;
    public abstract void checkState(int score);

    public void downloadFile(int score) {
        System.out.println();
        this.point = this.point - score;
        checkState(score);
    }
    public void writeNote(int score) {
        System.out.println("发布留言 加分");
    }

}
