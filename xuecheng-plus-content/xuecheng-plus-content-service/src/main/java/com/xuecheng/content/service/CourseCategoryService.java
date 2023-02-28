package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author hpf19
 * @version 1.0
 * @description 课程分类相关服务
 * @date 2023/2/27 17:32
 */
public interface CourseCategoryService {
    /***
     * @description 课程分类树形结构查询
     * @param id 根节点id
     * @return List<CourseCategoryTreeDto>
     * @author hpf19
     * @date 2023/2/27 17:32
     */
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
