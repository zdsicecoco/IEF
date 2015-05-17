package ief.entity;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * Created by zhangdongsheng on 2015/4/4.
 */
public class UserInfoEntity {
    private int id;
    private String username;
    private int sex;
    private Date birthday;
    private String homeTown;
    private String presentAddress;
    private String career;
    private String phone;
    private String school;
    private String deviceInfo;
    private String signature;
    private String booksWanted;
    private String concernedPersons;
    private String knownPersons;
    private Date modifiedDatetime;
    private Date createdDate;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public String getCareer() {
        return career;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchool() {
        return school;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public String getSignature() {
        return signature;
    }

    public String getBooksWanted() {
        return booksWanted;
    }

    public String getConcernedPersons() {
        return concernedPersons;
    }

    public String getKnownPersons() {
        return knownPersons;
    }

    public Date getModifiedDatetime() {
        return modifiedDatetime;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setBooksWanted(String booksWanted) {
        this.booksWanted = booksWanted;
    }

    public void setConcernedPersons(String concernedPersons) {
        this.concernedPersons = concernedPersons;
    }

    public void setKnownPersons(String knownPersons) {
        this.knownPersons = knownPersons;
    }

    public void setModifiedDatetime(Date modifiedDatetime) {
        this.modifiedDatetime = modifiedDatetime;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this);
    }

    public static void main(String[] args) {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setId(123);
        userInfoEntity.setBirthday(new Date());
        System.out.println(userInfoEntity);
    }

}
