package com.bw.jcart_administration_back.dto.out;

import java.util.List;

public class PageOutDTO<T> {
    private Integer total;
    private Integer pageSize;
    private Integer pageNum;
    private List<T> list;

    public PageOutDTO(Integer total, Integer pageSize, Integer pageNum, List<T> list) {
        this.total = total;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        this.list = list;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
