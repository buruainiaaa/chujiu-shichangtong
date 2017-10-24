package com.cj.shichangtong.model;

import javax.persistence.*;

@Table(name = "sys_user_friend")
public class SysUserFriend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "userId")
    private String userid;

    @Column(name = "friendId")
    private String friendid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return friendId
     */
    public String getFriendid() {
        return friendid;
    }

    /**
     * @param friendid
     */
    public void setFriendid(String friendid) {
        this.friendid = friendid;
    }
}