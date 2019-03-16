package entity;
// Generated 2018-3-29 10:41:32 by Hibernate Tools 3.4.0.CR1

/**
 * User generated by hbm2java
 */

public class User implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer userid;
    private String userName;
    private String pwd;

    public User() {
    }

    public User(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", pwd=" + pwd + "]";
	}

    
}