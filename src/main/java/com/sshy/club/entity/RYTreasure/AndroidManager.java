package com.sshy.club.entity.RYTreasure;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaohualuo
 * @since 2019-12-19
 */
@TableName("AndroidManager")
public class AndroidManager implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户标识
	 */
	@TableId(value = "UserID", type = IdType.AUTO)
	private Integer UserID;
	/**
	 * 房间标识
	 */
	private Integer ServerID;
	/**
	 * 最少局数
	 */
	private Integer MinPlayDraw;
	/**
	 * 最大局数
	 */
	private Integer MaxPlayDraw;
	/**
	 * 最少分数
	 */
	private Long MinTakeScore;
	/**
	 * 最高分数
	 */
	private Long MaxTakeScore;
	/**
	 * 最少休息
	 */
	private Integer MinReposeTime;
	/**
	 * 最大休息
	 */
	private Integer MaxReposeTime;
	private Integer ServiceTime;
	/**
	 * 服务类型
	 */
	private Integer ServiceGender;
	/**
	 * 禁止标志
	 */
	private Integer Nullity;
	private Date CreateDate;
	/**
	 * 备注信息
	 */
	private String AndroidNote;

	public Integer getUserID() {
		return UserID;
	}

	public void setUserID(Integer UserID) {
		this.UserID = UserID;
	}

	public Integer getServerID() {
		return ServerID;
	}

	public void setServerID(Integer ServerID) {
		this.ServerID = ServerID;
	}

	public Integer getMinPlayDraw() {
		return MinPlayDraw;
	}

	public void setMinPlayDraw(Integer MinPlayDraw) {
		this.MinPlayDraw = MinPlayDraw;
	}

	public Integer getMaxPlayDraw() {
		return MaxPlayDraw;
	}

	public void setMaxPlayDraw(Integer MaxPlayDraw) {
		this.MaxPlayDraw = MaxPlayDraw;
	}

	public Long getMinTakeScore() {
		return MinTakeScore;
	}

	public void setMinTakeScore(Long MinTakeScore) {
		this.MinTakeScore = MinTakeScore;
	}

	public Long getMaxTakeScore() {
		return MaxTakeScore;
	}

	public void setMaxTakeScore(Long MaxTakeScore) {
		this.MaxTakeScore = MaxTakeScore;
	}

	public Integer getMinReposeTime() {
		return MinReposeTime;
	}

	public void setMinReposeTime(Integer MinReposeTime) {
		this.MinReposeTime = MinReposeTime;
	}

	public Integer getMaxReposeTime() {
		return MaxReposeTime;
	}

	public void setMaxReposeTime(Integer MaxReposeTime) {
		this.MaxReposeTime = MaxReposeTime;
	}

	public Integer getServiceTime() {
		return ServiceTime;
	}

	public void setServiceTime(Integer ServiceTime) {
		this.ServiceTime = ServiceTime;
	}

	public Integer getServiceGender() {
		return ServiceGender;
	}

	public void setServiceGender(Integer ServiceGender) {
		this.ServiceGender = ServiceGender;
	}

	public Integer getNullity() {
		return Nullity;
	}

	public void setNullity(Integer Nullity) {
		this.Nullity = Nullity;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date CreateDate) {
		this.CreateDate = CreateDate;
	}

	public String getAndroidNote() {
		return AndroidNote;
	}

	public void setAndroidNote(String AndroidNote) {
		this.AndroidNote = AndroidNote;
	}

	@Override
	public String toString() {
		return "AndroidManager{" + ", UserID=" + UserID + ", ServerID=" + ServerID + ", MinPlayDraw=" + MinPlayDraw
				+ ", MaxPlayDraw=" + MaxPlayDraw + ", MinTakeScore=" + MinTakeScore + ", MaxTakeScore=" + MaxTakeScore
				+ ", MinReposeTime=" + MinReposeTime + ", MaxReposeTime=" + MaxReposeTime + ", ServiceTime="
				+ ServiceTime + ", ServiceGender=" + ServiceGender + ", Nullity=" + Nullity + ", CreateDate="
				+ CreateDate + ", AndroidNote=" + AndroidNote + "}";
	}
}
