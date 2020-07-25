package com.ujiuye.dao;

import com.ujiuye.bean.PersonBean;

import java.util.List;

public interface PersonDao {
    /*查询所有*/
    public List<PersonBean> findAll();
}
