package com.dzm.tomato.admin.serviceImpl;

import cn.hutool.db.Page;
import cn.hutool.db.PageResult;
import com.dzm.tomato.admin.dao.SysDictDynamicSqlSupport;
import com.dzm.tomato.admin.dao.SysDictMapper;
import com.dzm.tomato.admin.model.SysDict;
import com.dzm.tomato.admin.service.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isIn;

@Service
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictMapper sysDictMapper;

    @Override
    public int delete(List<Long> ids) {
        return sysDictMapper.delete(c -> c.where(SysDictDynamicSqlSupport.id, isIn(ids)));
    }

    @Override
    public int save(SysDict record) {
        return sysDictMapper.insert(record);
    }

    @Override
    public int delete(SysDict record) {
        return sysDictMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(Long id) {
        return sysDictMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysDict findById(Long id) {
        return sysDictMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public PageResult<SysDict> findPage(Page page) {
        int offset = (page.getPageNumber() - 1) * page.getPageSize();
        List<SysDict> list = sysDictMapper.select(c -> c.limit(offset).offset(offset));
        PageResult<SysDict> pageResult = new PageResult<SysDict>();
        pageResult.addAll(list);
        return pageResult;
    }
}
