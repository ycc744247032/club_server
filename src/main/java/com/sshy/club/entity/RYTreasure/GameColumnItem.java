package com.sshy.club.entity.RYTreasure;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YC
 * @since 2019-12-19
 */
@TableName("GameColumnItem")
public class GameColumnItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 排列标识
     */
    @TableId("SortID")
    private Integer SortID;

    /**
     * 列头名字
     */
    @TableField("ColumnName")
    private String ColumnName;

    /**
     * 列表宽度
     */
    @TableField("ColumnWidth")
    private Integer ColumnWidth;

    /**
     * 数据描述
     */
    @TableField("DataDescribe")
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
    public String toString() {
        return "GameColumnItem{" +
            "SortID=" + SortID +
            ", ColumnName=" + ColumnName +
            ", ColumnWidth=" + ColumnWidth +
            ", DataDescribe=" + DataDescribe +
        "}";
    }
}
