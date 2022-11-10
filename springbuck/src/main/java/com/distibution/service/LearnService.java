package com.distibution.service;



import com.distibution.domain.LearnResouce;
import com.distibution.tools.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by caokuang on 2022/11/10.
 */
public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
    Page queryLearnResouceList(Map<String,Object> params);

    List<LearnResouce> queryLearnResouces();
}
