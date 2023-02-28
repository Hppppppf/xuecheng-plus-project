package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author itcast
 */
@Data
@TableName("course_category")
public class CourseCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String label;

    private String parentid;

    private Integer isShow;

    private Integer orderby;

    private Integer isLeaf;


}
