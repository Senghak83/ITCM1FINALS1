package edu.itc.gic;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Contributor")
public class Contributor {
    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "login")
    public String login;
    @ColumnInfo(name = "avatar_url")
    public String avater_url;

    public Contributor(){}

    public long getLoginid() {
        return id;
    }

    public void setLoginid(long loginid) {
        this.id = loginid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvater_url() {
        return avater_url;
    }

    public void setAvater_url(String avater_url) {
        this.avater_url = avater_url;
    }
}
