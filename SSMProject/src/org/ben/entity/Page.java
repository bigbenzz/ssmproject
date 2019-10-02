package org.ben.entity;

import java.io.Serializable;

public class Page implements Serializable{
	private static final long serialVersionUID = -3198048449643774660L;
	private int pageNow=1;//��ǰҳ
	private int pageSize=5;//ÿҳ��¼������
	private int totalCount;//�ܼ�¼����
	private int totalPageCount;//��ҳ��
	@SuppressWarnings("unused")
	private int startPos;//��ʼλ�� 0��ʼ
	@SuppressWarnings("unused")
	private boolean hasFrist;//�Ƿ�����ҳ
	@SuppressWarnings("unused")
	private boolean hasPre;//�Ƿ���ǰһҳ
	@SuppressWarnings("unused")
	private boolean hasNext;//�Ƿ�����һҳ
	@SuppressWarnings("unused")
	private boolean hasLast;//�Ƿ������һҳ
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
	public boolean isHasFrist() {//��ҳ
		return (pageNow==1)?false:true;
	}
	public boolean isHasPre() {
		return isHasFrist()?true:false;
	}
	 public boolean isHasLast() {
	        // ����������һҳ����βҳ
	        return (pageNow == getTotalCount()) ? false : true;
	    }
	public boolean isHasNext() {
        // �����βҳ������һҳ����Ϊ��βҳ�����������һҳ
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
