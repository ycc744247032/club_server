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
public class ClubLevel implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	/**
	 * 当前用户
	 */
	private Long userId;
	/**
	 * 上级用户
	 */
	private Integer parentId;
	/**
	 * 工会ID
	 */
	private Integer ghId;
	/**
	 * 权限
	 */
	private Integer role;
	/**
	 * 分红比例
	 */
	private Integer ratio;
	/**
	 * 显示比例
	 */
	private Integer display;
	private String Remark;
	/**
	 * 修改时间
	 */
	private Date ModDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getGhId() {
		return ghId;
	}

	public void setGhId(Integer ghId) {
		this.ghId = ghId;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Integer getRatio() {
		return ratio;
	}

	public void setRatio(Integer ratio) {
		this.ratio = ratio;
	}

	public Integer getDisplay() {
		return display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String Remark) {
		this.Remark = Remark;
	}

	public Date getModDate() {
		return ModDate;
	}

	public void setModDate(Date ModDate) {
		this.ModDate = ModDate;
	}

	@Override
	public String toString() {
		return "ClubLevel{" + ", id=" + id + ", userId=" + userId + ", parentId=" + parentId + ", ghId=" + ghId
				+ ", role=" + role + ", ratio=" + ratio + ", display=" + display + ", Remark=" + Remark + ", ModDate="
				+ ModDate + "}";
	}
}
