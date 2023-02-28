package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @author hpf19
 * @version 1.0
 * @description 课程基本信息管理业务接口
 * @date 2023/2/28 15:12
 */
public interface TeachplanService {
    /***
     * @description 课程基本信息管理业务接口
     * @param courseId
     * @return java.util.List<com.xuecheng.content.model.dto.TeachplanDto>
     * @author hpf19
     * @date 2023/2/28 15:12
     */
    public List<TeachplanDto> findTeachplayTree(long courseId);

    /***
     * @description 保存课程计划
     * @param teachplanDto 课程计划信息
     * @return void
     * @author hpf19
     * @date 2023/2/28 15:47
     */
    public void saveTeachplan(SaveTeachplanDto teachplanDto);

}
