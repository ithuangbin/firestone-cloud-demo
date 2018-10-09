/**
 * Project Name:fire-industry-map
 * File Name:ServerResult.java
 * Package Name:com.firestone.web.base
 * Date:2018年7月4日下午7:12:52
 *
*/

package com.firestone.common.model;


import com.firestone.common.model.enums.ResultEnum;

/**
 * @Description: 结果对象返回封装
 * @author lvxc
 * @date 2018年7月4日 下午7:12:52
 */
public class ServerResult<T> {
    //状态码
    private Integer code ; 
    //提示信息
    private String msg;
    //返回数据
    private T data;
    
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    
    public static ServerResult<Object> success(){
        return success(null);
    }
    public static <T> ServerResult<T> success(T object){
        ServerResult<T> result = new ServerResult<T>();
        result.setCode(200);
        result.setMsg("success");
        result.setData(object);
        return result;
    }
 
    public static ServerResult<Object> fail(Integer code, String msg){
        ServerResult<Object> result = new ServerResult<Object>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    
    public static ServerResult<Object> fail(ResultEnum resultEnum){
        ServerResult<Object> result = new ServerResult<Object>();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }
}

