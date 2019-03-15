package com.jason.myjavatrips;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 活动规则表t_promotion_activity_rule扩展字段
 */
@SuppressWarnings("rawtypes")
public class ActivityRuleExtendDto implements Serializable {

	private static final long serialVersionUID = 4026149382069207096L;

	/**
	 * 活动力度：1，买赠；2，每买赠；3，阶梯买赠; 活动力度：1，满赠；2，每满赠；3，阶梯满赠
	 */
	private Integer activityDynamics;
	/**
	 * 参与次数类型：1，不限制；2，每商户每日限制，3，每商户活动限制
	 */
	private Integer partakeNumType;
	/**
	 * 参与次数：0为不限制
	 */
	private Integer partakeNum;
	/**
	 * 活动赠品类型：1，赠品（将来可能会有卡券）
	 */
	private Integer giftType;
	/**
	 * 门槛件数
	 */
	private Integer thresholdQuantity;
	/**
	 * 赠品id
	 */
	private String giftId;

	/**
	 * 门槛内一次赠送数
	 */
	private Integer thresholdOnceNum;
	/**
	 * 门槛内限量个数
	 */
	private Integer thresholdTotalNum;

	/**
	 * 门槛限量形式：1，活动限量；2，每日限量
	 */
	private Integer thresholdLimitType;
	/**
	 * 门槛金额
	 */
	private BigDecimal thresholdPrice;
	/**
	 * 礼包内赠品详情
	 */
	private List<PacksGiftInfoDto> giftInfos;
	
	public Integer getActivityDynamics() {
		return activityDynamics;
	}
	public void setActivityDynamics(Integer activityDynamics) {
		this.activityDynamics = activityDynamics;
	}
	public Integer getPartakeNumType() {
		return partakeNumType;
	}
	public void setPartakeNumType(Integer partakeNumType) {
		this.partakeNumType = partakeNumType;
	}
	public Integer getPartakeNum() {
		return partakeNum;
	}
	public void setPartakeNum(Integer partakeNum) {
		this.partakeNum = partakeNum;
	}
	public Integer getGiftType() {
		return giftType;
	}
	public void setGiftType(Integer giftType) {
		this.giftType = giftType;
	}
	public Integer getThresholdQuantity() {
		return thresholdQuantity;
	}
	public void setThresholdQuantity(Integer thresholdQuantity) {
		this.thresholdQuantity = thresholdQuantity;
	}
	public String getGiftId() {
		return giftId;
	}
	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}
	public Integer getThresholdOnceNum() {
		return thresholdOnceNum;
	}
	public void setThresholdOnceNum(Integer thresholdOnceNum) {
		this.thresholdOnceNum = thresholdOnceNum;
	}
	public Integer getThresholdTotalNum() {
		return thresholdTotalNum;
	}
	public void setThresholdTotalNum(Integer thresholdTotalNum) {
		this.thresholdTotalNum = thresholdTotalNum;
	}
	public Integer getThresholdLimitType() {
		return thresholdLimitType;
	}
	public void setThresholdLimitType(Integer thresholdLimitType) {
		this.thresholdLimitType = thresholdLimitType;
	}
	public BigDecimal getThresholdPrice() {
		return thresholdPrice;
	}
	public void setThresholdPrice(BigDecimal thresholdPrice) {
		this.thresholdPrice = thresholdPrice;
	}
	public List<PacksGiftInfoDto> getGiftInfos() {
		return giftInfos;
	}
	public void setGiftInfos(List<PacksGiftInfoDto> giftInfos) {
		this.giftInfos = giftInfos;
	}
	
}
