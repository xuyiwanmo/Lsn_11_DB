package com.example.administrator.lsn_11_db.db;

/**
 * Created by Administrator on 2017/9/4.
 */

public interface IBaseDao<T> {

    Long insert(T entity);
    Long update(T entity,T where);
}
