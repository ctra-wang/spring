package com.ctra.staticproxy;

public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; // 目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("begin...");
        target.teach();
        System.out.println("end...");
    }
}
