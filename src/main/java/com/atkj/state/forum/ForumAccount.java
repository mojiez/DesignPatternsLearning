package com.atkj.state.forum;

public class ForumAccount {
    // 含有状态的对象 就是上下文类

    // 用户有一个状态 这个状态可以转移
    // 根据不同的状态有不同的行为
    private AbstractState state;
    private String name;
    public AbstractState getState() {
        return this.state;
    }
    public ForumAccount(String name) {
        // 创建这个用户 状态被初始化
        this.name = name;
        this.state = new primaryState(this);
    }
    public void setState(AbstractState state) {
        this.state = state;
    }

    // 这个用户的行为 都是调用state的行为 （）
    public void wirteNote() {
        this.state.writeNote(10);
    }
    public void accountshengji() {
        state.checkState(10);
    }
}
