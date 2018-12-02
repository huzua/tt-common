package com.tt.common.bean;

import java.util.List;

public class EasyUIResult {
    public Long total;
    public List<?> rows;
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
    public EasyUIResult(Long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }
    public EasyUIResult() {
    }
}
