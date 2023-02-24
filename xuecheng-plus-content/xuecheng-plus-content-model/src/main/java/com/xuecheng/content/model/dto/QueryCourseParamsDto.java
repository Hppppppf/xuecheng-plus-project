package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author hpf19
 * @version 1.0
 * @description 课程查询参数Dto
 * @date 2023/2/24 16:10
 */
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
