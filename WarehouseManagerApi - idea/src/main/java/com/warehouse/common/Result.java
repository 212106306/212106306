package com.warehouse.common;

/*
 * 返回前端统一数据的封装类
 * @author warehouse
 * @date 2023/1/2 20:36
 */
public class Result {

    private int code;  //编码 200/400
    private String msg;  //成功/失败
    private Long total;  //总记录数
    private Object data;  //数据

    public static Result fail(){
        return result(400,"失败",0L,null);
    }

    public static Result success(){
        return result(200,"成功",0L,null);
    }

    public static Result success(Object data){
        return result(200,"成功",0L,data);
    }

    public static Result success(Object data,Long total){
        return result(200,"成功",total,data);
    }

    private static Result result(int code,String msg,Long total,Object data){
        Result res = new Result();
        res.setData(data);
        res.setMsg(msg);
        res.setCode(code);
        res.setTotal(total);
        return res;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}
