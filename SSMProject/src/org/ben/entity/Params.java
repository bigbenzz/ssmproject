package org.ben.entity;

public class Params {
	private Integer pageSize = 0;//查询结果数组的索引
	private Integer pageNo = 0;//每页信息的条数
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Params(Integer pageSize, Integer pageNo) {
		super();
		this.pageSize = pageSize;
		this.pageNo = pageNo;
	}
	public Params() {
		
	}
	
}
