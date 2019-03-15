package com.jason.myjavatrips;



import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 活动规则表礼包赠品扩展字段
 * @param <T>
 */
public class PacksGiftInfoDto<T> implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private java.lang.Integer giftId;// 赠品ssu
	private java.lang.String giftName;// 赠品名称
	private java.lang.Integer giftOnceNum;// 礼包中赠品数量
	private BigDecimal thresholdCost;
	private java.lang.Integer giftNum;// 赠送的赠品数量
	private T giftSsu;//商品信息
	
	public java.lang.Integer getGiftId() {
		return giftId;
	}
	public void setGiftId(java.lang.Integer giftId) {
		this.giftId = giftId;
	}
	public java.lang.Integer getGiftOnceNum() {
		return giftOnceNum;
	}
	public void setGiftOnceNum(java.lang.Integer giftOnceNum) {
		this.giftOnceNum = giftOnceNum;
	}
	public java.lang.String getGiftName() {
		return giftName;
	}
	public void setGiftName(java.lang.String giftName) {
		this.giftName = giftName;
	}
	public BigDecimal getThresholdCost() {
		return thresholdCost;
	}
	public void setThresholdCost(BigDecimal thresholdCost) {
		this.thresholdCost = thresholdCost;
	}
	public java.lang.Integer getGiftNum() {
		return giftNum;
	}
	public void setGiftNum(java.lang.Integer giftNum) {
		this.giftNum = giftNum;
	}
	public T getGiftSsu() {
		return giftSsu;
	}
	public void setGiftSsu(T giftSsu) {
		this.giftSsu = giftSsu;
	}
	
}
