package com.dzm.tomato.admin.serviceImpl;

import com.dzm.tomato.admin.dao.SysDeptMapper;
import com.dzm.tomato.admin.model.SysDept;
import com.dzm.tomato.admin.service.SysDeptService;
import com.dzm.tomato.core.page.PageRequest;
import com.dzm.tomato.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public List<SysDept> findTree() {
        List<SysDept> rootSysDepts = new ArrayList<SysDept>();
        List<SysDept> list = sysDeptMapper.select(c -> c);
        for(SysDept sysDept: list){
            if (sysDept.getParentId() == 0){
                sysDept.setLevel(0);
                rootSysDepts.add(sysDept);
                list.remove(sysDept);
            }
        }

        findTreeChilds(rootSysDepts, list);
        return rootSysDepts;
    }

    @Override
    public SysDept findParent(Long id) {
        return sysDeptMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public List<SysDept> findChilds(Long id) {
        SysDept rootSysDept = sysDeptMapper.selectByPrimaryKey(id).get();
        List<SysDept> list = sysDeptMapper.select(c -> c);
        List<SysDept> childrens = new ArrayList<SysDept>();
        for(SysDept sysDept: list){
            if(id == sysDept.getId()){
                childrens.add(sysDept);
            }
        }
        return childrens;
    }

    private void findTreeChilds(List<SysDept> rootSysDepts, List<SysDept> list){
        for(SysDept rootSysDept: rootSysDepts){
            List<SysDept> tempChildrens = new ArrayList<SysDept>();
            for(SysDept sysDept: list){
                if(sysDept.getParentId().equals(rootSysDept.getParentId())){
                    sysDept.setParentName(rootSysDept.getName());
                    sysDept.setLevel(rootSysDept.getLevel() + 1);
                    tempChildrens.add((sysDept));
                }
            }
            rootSysDept.setChildren(tempChildrens);
            findTreeChilds(tempChildrens, list);
        }
    }

    @Override
    public int save(SysDept record) {
        return sysDeptMapper.insert(record);
    }

    @Override
    public int delete(SysDept record) {
        return sysDeptMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(Long id) {
        return sysDeptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SysDept findById(Long id) {
        return sysDeptMapper.selectByPrimaryKey(id).get();
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
//        int offset = (page.getPageNumber() - 1) * page.getPageSize();
//        List<SysDept> list = sysDeptMapper.select(c -> c.limit(offset).offset(offset));
//        PageResult<SysDept> pageResult = new PageResult<SysDept>();
//        pageResult.addAll(list);
//        return pageResult;
        return null;
    }
}
