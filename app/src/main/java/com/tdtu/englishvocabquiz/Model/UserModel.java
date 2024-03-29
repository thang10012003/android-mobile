package com.tdtu.englishvocabquiz.Model;

public class UserModel  {
    private String name;
    private String gender;
    private String createDate;
    private int posts;
    private String avt;
    private String id_acc;
    private String mobile;

    public UserModel( String name, String gender, String createDate, int posts, String avt, String id_acc,String mobile) {
        this.name = name;
        this.gender = gender;
        this.createDate = createDate;
        this.posts = posts;
        this.avt = avt;
        this.id_acc = id_acc;
        this.mobile = mobile;

    }
    public UserModel(UserModel clone) {
        this.name = clone.name;
        this.gender =  clone.gender;
        this.createDate =  clone.createDate;
        this.posts =  clone.posts;
        this.avt =  clone.avt;
        this.id_acc =  clone.id_acc;
        this.mobile =  clone.mobile;

    }
    public UserModel(){
        this.name = "";
        this.gender = "";
        this.createDate = "";
        this.posts = -1;
        this.avt = "";
        this.id_acc = "";
        this.mobile = "";
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getId_acc() {
        return id_acc;
    }

    public void setId_acc(String id_acc) {
        this.id_acc = id_acc;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", createDate='" + createDate + '\'' +
                ", posts=" + posts +
                ", avt='" + avt + '\'' +
                ", id_acc='" + id_acc + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
