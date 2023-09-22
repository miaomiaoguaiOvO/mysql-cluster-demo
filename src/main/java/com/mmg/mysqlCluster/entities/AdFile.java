package com.mmg.mysqlCluster.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mmg.mysqlCluster.enums.FileTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: fan
 * @Date: 2023/7/28
 * @Description:
 */
@TableName("ad_file")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdFile {
    @TableId(value = "file_id", type = IdType.ASSIGN_ID)
    private Long fileId;
    private String fileOriginalName;
    private String fileMd5Name;
    private String filePath;
    private String fileUrl;
    private Integer fileWidth;
    private Integer fileHeight;
    private FileTypeEnum fileType;
    private Long coverId;
    private Date createAt;
}
