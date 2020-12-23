package com.example.demo.gclcontroller.test;

public enum DefiningEnumimpl implements  DefiningEnum<String>{

    ADD("601","新增"), UPDATE("601","新增"), INSERT("601","新增"), DELETE("601","新增");
    private String code;
    private String dess;

    DefiningEnumimpl(String code, String dess) {
        this.code = code;
        this.dess = dess;
    }

    @Override
    public String getcode() {
        return code;
    }

    @Override
    public String getDess() {
        return dess;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDess(String dess) {
        this.dess = dess;
    }
}
class UserEnum{
    public static void main(String[] args) {
        String code = DefiningEnumimpl.ADD.getDess();
        System.out.println(code);
    }
}