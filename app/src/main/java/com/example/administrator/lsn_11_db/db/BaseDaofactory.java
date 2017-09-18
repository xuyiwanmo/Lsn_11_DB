package com.example.administrator.lsn_11_db.db;

import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

/**
 * Created by Administrator on 2017/9/4.
 */

public class BaseDaofactory {
    private String sqliteDatabasepath;
    private SQLiteDatabase mSqliteDatabase;

    public BaseDaofactory() {
        sqliteDatabasepath = Environment.getDataDirectory().getAbsolutePath() + "use.db";
        openDatabase();
    }

    public synchronized <T extends BaseDao<M>, M> T getDataHepler(Class<T> clazz, Class<M> entiyClass) {
        BaseDao baseDao=null;
        try {
            baseDao=clazz.newInstance();
            baseDao.init(clazz,mSqliteDatabase);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void openDatabase() {
        this.mSqliteDatabase = SQLiteDatabase.openOrCreateDatabase(sqliteDatabasepath, null);
    }
}
