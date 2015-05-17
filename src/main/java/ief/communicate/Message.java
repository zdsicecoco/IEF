package ief.communicate;

/**
 * Created by zhangdongsheng on 2015/4/5.
 */
public class Message<T> {
    private BStatus bstatus;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BStatus getBstatus() {
        return bstatus;
    }

    public void setBstatus(BStatus bstatus) {
        this.bstatus = bstatus;
    }
}
