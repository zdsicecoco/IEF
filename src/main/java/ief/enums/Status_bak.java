package ief.enums;

import com.alibaba.fastjson.JSON;

/**
 * Created by zhangdongsheng on 2015/4/5.
 */
public enum Status_bak {
    SUCCESS(1, "成功"),
    FAIL(0, "失败");

    private int code;
    private String msg;

    private Status_bak(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }
}
