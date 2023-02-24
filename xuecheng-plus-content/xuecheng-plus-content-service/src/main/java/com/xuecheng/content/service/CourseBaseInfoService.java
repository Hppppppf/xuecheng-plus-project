package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author hpf19
 * @version 1.0
 * @description 课程基本信息管理业务接口
 * @date 2023/2/24 21:05
 */
public interface CourseBaseInfoService {
    /***
     * @description 课程查询接口
     * @param pageParams 分页参数
     * @param queryCourseParamsDto  查询条件
     * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
     * @author hpf19
     * @date 2023/2/24 21:06
     */
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
