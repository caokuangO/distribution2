package com.distibution.service.impl;


import com.distibution.dao.LearnDao;
import com.distibution.domain.LearnResouce;
import com.distibution.service.LearnService;
import com.distibution.tools.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by caokuang on 2022/11/10.
 */
@Service
public class LearnServiceImpl implements LearnService {

    @Autowired
    LearnDao learnDao;
    @Override
    public int add(LearnResouce learnResouce) {
        return this.learnDao.add(learnResouce);
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return this.learnDao.update(learnResouce);
    }

    @Override
    public int deleteByIds(String ids) {
        return this.learnDao.deleteByIds(ids);
    }

    @Override
    public LearnResouce queryLearnResouceById(Long id) {
        return this.learnDao.queryLearnResouceById(id);
    }

    @Override
    public Page queryLearnResouceList(Map<String,Object> params) {
        return this.learnDao.queryLearnResouceList(params);
    }

    @Override
    public List<LearnResouce> queryLearnResouces() {
        return this.learnDao.queryLearnResouces();
    }
}
