package com.atkj.state.forum;

public class highState extends AbstractState{
    // 你中有我 我中有你
    // 人有状态 通过状态调用方法
    // 状态有人 修改对应的人的状态

    @Override
    public void checkState(int score) {
        this.acc.setState(new primaryState(this));
    }

    public highState(AbstractState state) {
        this.acc = state.acc;
        this.point = state.point;
        this.stateName = "专家";
    }
}
