package ief.communicate;

/**
 * Created by zhangdongsheng on 2015/4/5.
 */
public class BStatus {
    private int code;
    private String desc;

    public BStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
