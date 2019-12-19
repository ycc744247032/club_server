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
public class ClubRoomNew implements Serializable {

	private static final long serialVersionUID = 1L;

	private String Name;
	private Long CreaterUid;
	@TableId(value = "GhId", type = IdType.AUTO)
	private Long GhId;
	private String GhCode;
	private String GhDesc;
	/**
	 * 0 有效 1 无效
	 */
	private Integer Nullity;
	/**
	 * 建立日期
	 */
	private Date CreateDate;
	private Date NullityDate;
	private Integer IsPublic;
	private Long Score;
	private Integer Type;
	/**
	 * 会员数量
	 */
	private Integer num;

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public Long getCreaterUid() {
		return CreaterUid;
	}

	public void setCreaterUid(Long CreaterUid) {
		this.CreaterUid = CreaterUid;
	}

	public Long getGhId() {
		return GhId;
	}

	public void setGhId(Long GhId) {
		this.GhId = GhId;
	}

	public String getGhCode() {
		return GhCode;
	}

	public void setGhCode(String GhCode) {
		this.GhCode = GhCode;
	}

	public String getGhDesc() {
		return GhDesc;
	}

	public void setGhDesc(String GhDesc) {
		this.GhDesc = GhDesc;
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

	public Date getNullityDate() {
		return NullityDate;
	}

	public void setNullityDate(Date NullityDate) {
		this.NullityDate = NullityDate;
	}

	public Integer getIsPublic() {
		return IsPublic;
	}

	public void setIsPublic(Integer IsPublic) {
		this.IsPublic = IsPublic;
	}

	public Long getScore() {
		return Score;
	}

	public void setScore(Long Score) {
		this.Score = Score;
	}

	public Integer getType() {
		return Type;
	}

	public void setType(Integer Type) {
		this.Type = Type;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "ClubRoomNew{" + ", Name=" + Name + ", CreaterUid=" + CreaterUid + ", GhId=" + GhId + ", GhCode="
				+ GhCode + ", GhDesc=" + GhDesc + ", Nullity=" + Nullity + ", CreateDate=" + CreateDate
				+ ", NullityDate=" + NullityDate + ", IsPublic=" + IsPublic + ", Score=" + Score + ", Type=" + Type
				+ ", num=" + num + "}";
	}
}
