package org.ben.entity;

import java.io.Serializable;

public class Page implements Serializable{
	private static final long serialVersionUID = -3198048449643774660L;
	private int pageNow=1;//当前页
	private int pageSize=5;//每页记录的条数
	private int totalCount;//总记录条数
	private int totalPageCount;//总页数
	@SuppressWarnings("unused")
	private int startPos;//开始位置 0开始
	@SuppressWarnings("unused")
	private boolean hasFrist;//是否有首页
	@SuppressWarnings("unused")
	private boolean hasPre;//是否有前一页
	@SuppressWarnings("unused")
	private boolean hasNext;//是否有下一页
	@SuppressWarnings("unused")
	private boolean hasLast;//是否有最后一页
	public Page(int pageNow, int pageSize) {
		super();
		this.pageNow = pageNow;
		this.pageSize = pageSize;
	}
	public int getTotalPageCount() {
		totalPageCount=getTotalCount()/getPageSize();
		return (totalCount%pageSize==0)?totalPageCount:totalPageCount+1;
	}
	public int getStartPos() {
		return (pageNow-1)*pageSize;
	}
	public boolean isHasFrist() {//首页
		return (pageNow==1)?false:true;
	}
	public boolean isHasPre() {
		return isHasFrist()?true:false;
	}
	 public boolean isHasLast() {
	        // 如果不是最后一页就有尾页
	        return (pageNow == getTotalCount()) ? false : true;
	    }
	public boolean isHasNext() {
        // 如果有尾页就有下一页，因为有尾页表明不是最后一页
        return isHasLast() ? true : false;
    }
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public void setHasFrist(boolean hasFrist) {
		this.hasFrist = hasFrist;
	}
	
	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}
	
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	
	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
}
