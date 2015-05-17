package ief.controller;

import ief.common.MessageUtil;
import ief.constant.BStatusCode;
import ief.constant.BStatusDes;
import ief.communicate.Message;
import ief.communicate.BStatus;
import ief.entity.UserInfoEntity;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.commons.logging.Log;

/**
 * Created by zhangdongsheng on 2015/4/5.
 */
@Controller
@RequestMapping("/welcome")
public class UserInfoController {
    private final Log logger =  LogFactory.getLog(UserInfoController.class);;

    @RequestMapping("/login")
    @RequestBody
    public  Message login(@RequestParam(value="c", defaultValue="test") String c,
                             @RequestParam(value="b", defaultValue="123456") String b,
                             @RequestParam(value="v", defaultValue="123456") String v) {
        logger.info("login:[c:" + c + ",b:" + b + ",v:" + v + "]");
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setId(1);
        userInfoEntity.setUsername(c);
        return MessageUtil.messageWrapper(userInfoEntity, new BStatus(BStatusCode.SUCCESS, BStatusDes.SUCCESS));
    }
}
