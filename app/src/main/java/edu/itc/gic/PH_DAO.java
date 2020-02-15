package edu.itc.gic;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PH_DAO {

    @Insert
    void Insert(List<Contributor>ls);

    @Query("Select * from Contributor")
    List<Contributor> listAll();

    @Query("Select login from Contributor where login = :sqlid")
    List<Contributor> listByLogin(String sqlid);


}
