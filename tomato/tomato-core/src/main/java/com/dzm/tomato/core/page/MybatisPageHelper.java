package com.dzm.tomato.core.page;

import com.dzm.tomato.common.utils.ReflectionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

public class MybatisPageHelper {
    public static final String FINDPAGE = "select";

    /**
     * findPage
     * @param pageRequest
     * @param mapper
     * @return PageResult
     */
    public static PageResult findPage(PageRequest pageRequest, Object mapper) {
        return findPage(pageRequest, mapper, FINDPAGE);
    }

    /**
     * findPage
     * @param pageRequest
     * @param mapper
     * @param FINDPAGE
     * @param arg
     * @return PageResult
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static PageResult findPage(PageRequest pageRequest, Object mapper, String FINDPAGE, Object ...arg) {
        int pageNumber = pageRequest.getPageNumber();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNumber, pageSize);

        Object result = ReflectionUtils.invoke(mapper, FINDPAGE, arg);
        PageInfo<?> pageInfo = new PageInfo<>((List) result);
        PageResult pageResult = new PageResult();
        pageResult.setPage(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotal((int) pageInfo.getTotal());
        pageResult.setTotalPage(pageInfo.getPages());
        pageResult.addAll(pageInfo.getList());
        System.out.println(pageResult.getTotal());
        return pageResult;
    }
}
