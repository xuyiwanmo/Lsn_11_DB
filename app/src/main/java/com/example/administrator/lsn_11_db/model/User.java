package com.example.administrator.lsn_11_db.model;

import com.example.administrator.lsn_11_db.db.annotation.DbField;
import com.example.administrator.lsn_11_db.db.annotation.DbTable;

/**
 * Created by Administrator on 2017/9/4.
 */

@DbTable("db_user")
public class User {

    @DbField("db_user")
    public String name;

}
