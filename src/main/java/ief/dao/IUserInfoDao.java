package ief.dao;


import ief.entity.UserInfoEntity;

import java.util.List;

/**
 * Created by zhangdongsheng on 2015/4/5.
 */
public interface IUserInfoDao {

    public List<UserInfoEntity> getUserInfoList();
}
