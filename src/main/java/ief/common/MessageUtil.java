package ief.common;

import ief.communicate.Message;
import ief.communicate.BStatus;

/**
 * Created by zhangdongsheng on 2015/4/5.
 */
public class MessageUtil {
    public static <T> Message messageWrapper(T t, BStatus bstatus){
        Message<T> message = new Message<T>();
        message.setBstatus(bstatus);
        message.setData(t);
        return message;
    }
}
