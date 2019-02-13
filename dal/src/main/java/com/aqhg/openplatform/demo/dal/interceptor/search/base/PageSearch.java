package com.aqhg.openplatform.demo.dal.interceptor.search.base;

import java.util.List;

public class PageSearch extends BaseSearch {

    /**
     * 总条数
     */
    private int total;
    /**
     * 当前第几页
     */
    private int pageNo;
    /**
     * 总页数
     */
    private int totalpage;
    /**
     * 每页显示条数
     */
    private int pageSize = 5;
    /**
     * 数据库中limit的参数，从第几条开始取
     */
    private transient int dbIndex;
    /**
     * 数据库中limit的参数，一共取多少条
     */
    private transient int dbNumber;

    /**
     * 根据当前对象中属性值计算并设置相关属性值
     */

    private void count() {
        // 计算总页数
        int totalpageNoTemp = this.total / this.pageSize;
        int plus = (this.total % this.pageSize) == 0 ? 0 : 1;
        totalpageNoTemp = totalpageNoTemp + plus;
        if (totalpageNoTemp <= 0) {
            totalpageNoTemp = 1;
        }
        this.totalpage = totalpageNoTemp;

        // 设置当前页数
        // 总页数小于当前页数，应将当前页数设置为总页数
        if (this.totalpage < this.pageNo) {
            this.pageNo = this.totalpage;
        }
        // 当前页数小于1设置为1
        if (this.pageNo < 1) {
            this.pageNo = 1;
        }

        // 设置limit的参数
        this.dbIndex = (this.pageNo - 1) * this.pageSize;
        this.dbNumber = this.pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
        this.count();
    }

    public void setPageInfo(Integer pageNo, Integer PageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize > 0 ? pageSize : 1;
    }

    public int getpageNo() {
        return pageNo;
    }

    public void setpageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalpageNo() {
        return totalpage;
    }

    public void setTotalpageNo(int totalpage) {
        this.totalpage = totalpage;
    }

    public int getpageNoSize() {
        return pageSize;
    }

    public void setpageNoSize(int pageSize) {
        this.pageSize = pageSize > 0 ? pageSize : 1;
    }

    public int getDbIndex() {
        return dbIndex;
    }

    public void setDbIndex(int dbIndex) {
        this.dbIndex = dbIndex;
    }

    public int getDbNumber() {
        return dbNumber;
    }

    public void setDbNumber(int dbNumber) {
        this.dbNumber = dbNumber;
    }

    public <T> pageNoInfo<T> getPageInfo(List<T> data) {

        return new pageNoInfo<T>(getpageNo(), getpageNoSize(), getTotal(), getTotalpageNo(), data);
    }

    public static class pageNoInfo<T> {
        /**
         * 页码
         */
        private int pageNo;
        /**
         * 每页数量
         */
        private int pageSize;
        /**
         * 总共数量
         */
        private int total;

        /**
         * 总共页数
         */
        private int totalpage;
        /**
         * 数据
         */
        private List<T> data;

        public pageNoInfo() {
        }

        public pageNoInfo(int pageNo, int pageSize, int total, int totalpage, List<T> data) {
            super();
            this.pageNo = pageNo;
            this.pageSize = pageSize;
            this.total = total;
            this.totalpage = totalpage;
            this.data = data;
        }

        public int getpageNo() {
            return pageNo;
        }

        public int getpageNoSize() {
            return pageSize;
        }

        public int getTotal() {
            return total;
        }

        public int getTotalpageNo() {
            return totalpage;
        }

        public List<T> getData() {
            return data;
        }

        public void setData(List<T> data) {
            this.data = data;
        }

    }
}
