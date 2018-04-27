package cn.czy.pojo;

import java.util.Date;

public class Joined {
    private Integer id;

    private Integer userId;

    private Integer acticityId;

    private Date createtime;

    private Byte isjoin;

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

    public Integer getActicityId() {
        return acticityId;
    }

    public void setActicityId(Integer acticityId) {
        this.acticityId = acticityId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getIsjoin() {
        return isjoin;
    }

    public void setIsjoin(Byte isjoin) {
        this.isjoin = isjoin;
    }
}