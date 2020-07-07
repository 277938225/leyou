package com.leyou.item.service;

import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.mapper.SpecParamMapper;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 根据分类id查询参数查询组
 */
@Service
public class SpecificationService {

    @Autowired
    private SpecGroupMapper specGroupMapper;
    @Autowired
    private SpecParamMapper specParamMapper;

    public List<SpecGroup> queryGroupsByCid(Long cid) {
        SpecGroup record =  new SpecGroup();
        record.setCid(cid);
        return specGroupMapper.select(record);
    }

    public List<SpecParam> queryParams(Long gid) {
        SpecParam record = new SpecParam();
        record.setGroupId(gid);
        return specParamMapper.select(record);
    }
}
