package ief.dao.impl;

import ief.dao.IUserInfoDao;
import ief.entity.UserInfoEntity;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangdongsheng on 2015/4/5.
 */
@Service("userInfoDao")
public class UserInfoDaoImpl extends SqlSessionDaoSupport implements IUserInfoDao{

    @Override
    public List<UserInfoEntity> getUserInfoList() {
        return this.getSqlSession().selectList("UserInfoDao.getUserInfoList");
    }
}
