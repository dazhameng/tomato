package com.dzm.tomato.core.page;

import com.github.pagehelper.PageInfo;

public class PageResult{
    public static final long serialVersionUID = 1L;

    private PageInfo<?> pageInfo;

    public PageInfo<?> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<?> pageInfo) {
        this.pageInfo = pageInfo;
    }
}
