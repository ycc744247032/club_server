package com.sshy.club.entity.RYTreasure;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YC
 * @since 2019-12-19
 */
public class GameColumnItem extends Model<GameColumnItem> {

    private static final long serialVersionUID = 1L;

    /**
     * 排列标识
     */
    private Integer SortID;

    /**
     * 列头名字
     */
    private String ColumnName;

    /**
     * 列表宽度
     */
    private Integer ColumnWidth;

    /**
     * 数据描述
     */
    private Integer DataDescribe;

    public Integer getSortID() {
        return SortID;
    }

    public void setSortID(Integer SortID) {
        this.SortID = SortID;
    }
    public String getColumnName() {
        return ColumnName;
    }

    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }
    public Integer getColumnWidth() {
        return ColumnWidth;
    }

    public void setColumnWidth(Integer ColumnWidth) {
        this.ColumnWidth = ColumnWidth;
    }
    public Integer getDataDescribe() {
        return DataDescribe;
    }

    public void setDataDescribe(Integer DataDescribe) {
        this.DataDescribe = DataDescribe;
    }

    @Override
    protected Serializable pkVal() {
        return this.SortID;
    }

    @Override
    public String toString() {
        return "GameColumnItem{" +
            "SortID=" + SortID +
            ", ColumnName=" + ColumnName +
            ", ColumnWidth=" + ColumnWidth +
            ", DataDescribe=" + DataDescribe +
        "}";
    }
}
