package com.sshy.club.entity.RYAccounts;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaohualuo
 * @since 2019-12-19
 */
public class ClubAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "ID", type = IdType.AUTO)
	private Integer ID;
	private Long UserId;
	private Integer GhId;
	/**
	 * 0: 申请 1: 正常 2: 踢掉 3: 冻结
	 */
	private Integer Status;
	private Date GhModDate;
	private String GhRemark;
	/**
	 * 介绍者ID
	 */
	private Long PullMan;
	/**
	 * 入伙时间
	 */
	private Date PullTime;
	private Long Score;
	/**
	 * 角色： 0 会长 1 副会长 2 会员
	 */
	private Integer Role;
	/**
	 * 角色更改时间
	 */
	private Date RoleTime;
	/**
	 * 累计拉人
	 */
	private Integer SumMan;
	/**
	 * 累计得分
	 */
	private Long SumScore;
	/**
	 * 顶级合伙人
	 */
	private Long TopId;
	/**
	 * 处理小数分
	 */
	private Float FloatScore;
	/**
	 * 锁定积分
	 */
	private Integer lock;
	/**
	 * 体力
	 */
	private Integer Grade;
	/**
	 * 财务管理
	 */
	private Integer finance;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public Long getUserId() {
		return UserId;
	}

	public void setUserId(Long UserId) {
		this.UserId = UserId;
	}

	public Integer getGhId() {
		return GhId;
	}

	public void setGhId(Integer GhId) {
		this.GhId = GhId;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer Status) {
		this.Status = Status;
	}

	public Date getGhModDate() {
		return GhModDate;
	}

	public void setGhModDate(Date GhModDate) {
		this.GhModDate = GhModDate;
	}

	public String getGhRemark() {
		return GhRemark;
	}

	public void setGhRemark(String GhRemark) {
		this.GhRemark = GhRemark;
	}

	public Long getPullMan() {
		return PullMan;
	}

	public void setPullMan(Long PullMan) {
		this.PullMan = PullMan;
	}

	public Date getPullTime() {
		return PullTime;
	}

	public void setPullTime(Date PullTime) {
		this.PullTime = PullTime;
	}

	public Long getScore() {
		return Score;
	}

	public void setScore(Long Score) {
		this.Score = Score;
	}

	public Integer getRole() {
		return Role;
	}

	public void setRole(Integer Role) {
		this.Role = Role;
	}

	public Date getRoleTime() {
		return RoleTime;
	}

	public void setRoleTime(Date RoleTime) {
		this.RoleTime = RoleTime;
	}

	public Integer getSumMan() {
		return SumMan;
	}

	public void setSumMan(Integer SumMan) {
		this.SumMan = SumMan;
	}

	public Long getSumScore() {
		return SumScore;
	}

	public void setSumScore(Long SumScore) {
		this.SumScore = SumScore;
	}

	public Long getTopId() {
		return TopId;
	}

	public void setTopId(Long TopId) {
		this.TopId = TopId;
	}

	public Float getFloatScore() {
		return FloatScore;
	}

	public void setFloatScore(Float FloatScore) {
		this.FloatScore = FloatScore;
	}

	public Integer getLock() {
		return lock;
	}

	public void setLock(Integer lock) {
		this.lock = lock;
	}

	public Integer getGrade() {
		return Grade;
	}

	public void setGrade(Integer Grade) {
		this.Grade = Grade;
	}

	public Integer getFinance() {
		return finance;
	}

	public void setFinance(Integer finance) {
		this.finance = finance;
	}

	@Override
	public String toString() {
		return "ClubAccount{" + ", ID=" + ID + ", UserId=" + UserId + ", GhId=" + GhId + ", Status=" + Status
				+ ", GhModDate=" + GhModDate + ", GhRemark=" + GhRemark + ", PullMan=" + PullMan + ", PullTime="
				+ PullTime + ", Score=" + Score + ", Role=" + Role + ", RoleTime=" + RoleTime + ", SumMan=" + SumMan
				+ ", SumScore=" + SumScore + ", TopId=" + TopId + ", FloatScore=" + FloatScore + ", lock=" + lock
				+ ", Grade=" + Grade + ", finance=" + finance + "}";
	}
}
