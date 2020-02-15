package edu.itc.gic;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Contributor.class},version = 1 ,exportSchema = true)

public abstract class DB_Pone extends RoomDatabase {

    public static DB_Pone dbphone;
    public static DB_Pone getInstance(Context con){
         if(dbphone== null){
             dbphone = Room.databaseBuilder(con,DB_Pone.class,"github.db")
                     .fallbackToDestructiveMigration().build();
         }
         return dbphone;
    }


    public abstract PH_DAO getConstributor();

}
