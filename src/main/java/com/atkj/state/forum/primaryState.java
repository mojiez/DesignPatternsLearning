package com.atkj.state.forum;

public class primaryState extends AbstractState{

    public primaryState(AbstractState state) {
        this.point = 0;
        this.acc = state.acc;
        this.stateName = "新手";
    }
    public primaryState(ForumAccount account) {
        this.point = 0;
        this.acc = account;
        this.stateName = "新手";
    }
    @Override
    public void checkState(int score) {
        // 从新手转到高手
        // 转变对应的人的状态
        acc.setState(new highState(this));
    }
    @Override
    public void writeNote(int score) {
        System.out.println("新手发布留言 加分");
    }
}
