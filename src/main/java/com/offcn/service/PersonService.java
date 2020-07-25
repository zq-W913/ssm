package com.ujiuye.service;

import com.ujiuye.bean.PersonBean;
import com.ujiuye.dao.PersonDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface PersonService {
    //查询所有
      public List<PersonBean> save();

}
