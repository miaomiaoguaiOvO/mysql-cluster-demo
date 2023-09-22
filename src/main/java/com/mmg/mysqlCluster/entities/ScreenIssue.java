package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: fan
 * @Date: 2022/8/4
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "screen_issue")
public class ScreenIssue implements Comparable<ScreenIssue> {
    @TableId(value = "screen_issue_id", type = IdType.ASSIGN_ID)
    private Long screenIssueId;
    private Long deviceId;
    private ScreenIssueEnum issueInfo;
    private IssueTypeEnum issueType;
    private Integer rowIndex;
    private Integer colIndex;
    private String customMessage;
    private TextColorEnum textColor;
    private RollModeEnum rollMode;
    private RollSpeedEnum rollSpeed;

    @Override
    public int compareTo(ScreenIssue o) {
        int i = this.getRowIndex().compareTo(o.getRowIndex());
        if (i == 0) {
            return this.getColIndex().compareTo(o.getColIndex());
        }
        return i;
    }
}
