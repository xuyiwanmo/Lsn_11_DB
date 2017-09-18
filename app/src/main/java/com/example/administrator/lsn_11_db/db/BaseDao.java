package com.example.administrator.lsn_11_db.db;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 2017/9/4.
 */

public class BaseDao<T>  implements  IBaseDao{
    private SQLiteDatabase database;

    boolean init (Class<T> entity,SQLiteDatabase sqLiteDatabase){
        database=sqLiteDatabase;
    }
    @Override
    public Long insert(Object entity) {
        return null;
    }

    @Override
    public Long update(Object entity, Object where) {
        return null;
    }
}
