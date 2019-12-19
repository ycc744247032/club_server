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
public class ClubRuleNew implements Serializable {

	private static final long serialVersionUID = 1L;

	private String RuleName;
	private String RuleStr;
	private String RuleDesc;
	private Integer GameType;
	private Long GhId;
	/**
	 * 0 有效 1 族长禁用 2 系统禁用
	 */
	private Integer Nullity;
	/**
	 * 禁用日期
	 */
	private Date NullityDate;
	@TableId(value = "Id", type = IdType.AUTO)
	private Long Id;

	public String getRuleName() {
		return RuleName;
	}

	public void setRuleName(String RuleName) {
		this.RuleName = RuleName;
	}

	public String getRuleStr() {
		return RuleStr;
	}

	public void setRuleStr(String RuleStr) {
		this.RuleStr = RuleStr;
	}

	public String getRuleDesc() {
		return RuleDesc;
	}

	public void setRuleDesc(String RuleDesc) {
		this.RuleDesc = RuleDesc;
	}

	public Integer getGameType() {
		return GameType;
	}

	public void setGameType(Integer GameType) {
		this.GameType = GameType;
	}

	public Long getGhId() {
		return GhId;
	}

	public void setGhId(Long GhId) {
		this.GhId = GhId;
	}

	public Integer getNullity() {
		return Nullity;
	}

	public void setNullity(Integer Nullity) {
		this.Nullity = Nullity;
	}

	public Date getNullityDate() {
		return NullityDate;
	}

	public void setNullityDate(Date NullityDate) {
		this.NullityDate = NullityDate;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long Id) {
		this.Id = Id;
	}

	@Override
	public String toString() {
		return "ClubRuleNew{" + ", RuleName=" + RuleName + ", RuleStr=" + RuleStr + ", RuleDesc=" + RuleDesc
				+ ", GameType=" + GameType + ", GhId=" + GhId + ", Nullity=" + Nullity + ", NullityDate=" + NullityDate
				+ ", Id=" + Id + "}";
	}
}
