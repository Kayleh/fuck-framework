package com.kayleh.bean;

/**
 * @Author: Kayleh
 * @Date: 2021/4/28 0:31
 */
public class User
{
    private String id;
    private String username;
    private String password;

    @Override
    public String toString()
    {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
//省略get set toString方法...
}

