package com.stylefeng.guns.modular.dist.vo;

public class DisMemberInfoVo   {

    /**
     * 密钥
     */
    private String  secret;

    /**
     * 平台id
     */
    private String disPlatformId;

    /**
     * 用户id
     */
    private String disUserId;

    /**
     * 父类id
     */
    private String disParentId;

    /**
     * 用户名称
     */
    private String disUserName;

    /**
     * 用户类型
     */
    private String disUserType;

    /**
     * 备注
     */
    private String disNote;


    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getDisPlatformId() {
        return disPlatformId;
    }

    public void setDisPlatformId(String disPlatformId) {
        this.disPlatformId = disPlatformId;
    }

    public String getDisUserId() {
        return disUserId;
    }

    public void setDisUserId(String disUserId) {
        this.disUserId = disUserId;
    }

    public String getDisParentId() {
        return disParentId;
    }

    public void setDisParentId(String disParentId) {
        this.disParentId = disParentId;
    }



    public String getDisUserName() {
        return disUserName;
    }

    public void setDisUserName(String disUserName) {
        this.disUserName = disUserName;
    }

    public String getDisUserType() {
        return disUserType;
    }

    public void setDisUserType(String disUserType) {
        this.disUserType = disUserType;
    }

    public String getDisNote() {
        return disNote;
    }

    public void setDisNote(String disNote) {
        this.disNote = disNote;
    }

    @Override
    public String toString() {
        return "DisMemberInfoVo{" +
                "secret='" + secret + '\'' +
                ", disPlatformId='" + disPlatformId + '\'' +
                ", disUserId='" + disUserId + '\'' +
                ", disParentId='" + disParentId + '\'' +
                ", disUserName='" + disUserName + '\'' +
                ", disUserType='" + disUserType + '\'' +
                ", disNote='" + disNote + '\'' +
                '}';
    }
}