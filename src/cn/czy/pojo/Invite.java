package cn.czy.pojo;

import java.util.Date;

public class Invite {
    private Integer id;

    private Integer userId;

    private Integer activityId;

    private Date createtime;

    private Byte isaccept;

    private Integer inviterId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getIsaccept() {
        return isaccept;
    }

    public void setIsaccept(Byte isaccept) {
        this.isaccept = isaccept;
    }

    public Integer getInviterId() {
        return inviterId;
    }

    public void setInviterId(Integer inviterId) {
        this.inviterId = inviterId;
    }
}