package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
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

    /***
     * @description 添加课程基本信息
     * @param companyId 教学机构id
     * @param addCourseDto 课程基本信息
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author hpf19
     * @date 2023/2/27 20:00
     */
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    /***
     * @description 根据ID查询课程信息
     * @param courseId id
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author hpf19
     * @date 2023/2/27 21:32
     */
    CourseBaseInfoDto getCourseBaseInfo(Long courseId);

    /***
     * @description 修改课程信息
     * @param companyId 机构id,用于校验机构权限
     * @param dto 课程信息
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @author hpf19
     * @date 2023/2/27 21:34
     */
    public CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);
}
