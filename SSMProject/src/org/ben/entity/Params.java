package org.ben.entity;

public class Params {
	private Integer pageSize = 0;//��ѯ������������
	private Integer pageNo = 0;//ÿҳ��Ϣ������
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
