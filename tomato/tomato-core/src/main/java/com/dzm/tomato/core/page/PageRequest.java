package com.dzm.tomato.core.page;

import cn.hutool.db.Page;
import cn.hutool.db.sql.Order;

public class PageRequest extends Page {

    public PageRequest() {
    }

    public PageRequest(int pageNumber, int pageSize) {
        super(pageNumber, pageSize);
    }

    public PageRequest(int pageNumber, int pageSize, Order order) {
        super(pageNumber, pageSize, order);
    }
}
