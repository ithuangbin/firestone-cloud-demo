/**
 * Project Name:fire-industry-map
 * File Name:ResultEnum.java
 * Package Name:com.firestone.config.enums
 * Date:2018年7月4日下午7:25:23
 *
*/

package com.firestone.common.model.enums;
/**
 * @Description: 结果枚举类
 * @author lvxc
 * @date 2018年7月4日 下午7:25:23
 */
public enum ResultEnum {
    UN_LOGIN(-1, "用户未登陆"),
    UN_AUTH(403,"无权限"),
    SUCCESS(200, "成功"),
    PRAMA_ERRO(0,"参数有误");
    
    
    
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return  this.code;
    }

    public String getMsg(){
        return this.msg;
    }
}

