package com.zm.crm.crmclue.other;

public class R {
    private int code;
    private String msg;
    private Object data;
    public static final int SUCCESS = 200;
    public static final int ERROR = 500;

    private R() {}

    public static R ok() {
        return new R().setCode(SUCCESS).setMsg("操作成功");
    }

    public static R ok(int code, String msg) {
        return new R().setCode(code).setMsg(msg);
    }

    public static R ok(Object data) {
        return new R().setCode(SUCCESS).setData(data).setMsg("操作成功");
    }

    public static R error(String msg) {
        return new R().setCode(ERROR).setMsg(msg);
    }

    public static R error(int code, String msg) {
        return new R().setCode(code).setMsg(msg);
    }

    public int getCode() {
        return code;
    }

    public R setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public R setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public R setData(Object data) {
        this.data = data;
        return this;
    }
}
