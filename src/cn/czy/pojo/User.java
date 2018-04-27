package cn.czy.pojo;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Byte isteacher;

    private Byte isstudent;

    private Byte isadmin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getIsteacher() {
        return isteacher;
    }

    public void setIsteacher(Byte isteacher) {
        this.isteacher = isteacher;
    }

    public Byte getIsstudent() {
        return isstudent;
    }

    public void setIsstudent(Byte isstudent) {
        this.isstudent = isstudent;
    }

    public Byte getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Byte isadmin) {
        this.isadmin = isadmin;
    }
}