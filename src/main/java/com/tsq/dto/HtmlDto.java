package com.tsq.dto;

import lombok.Data;

/**
 * 目标数据dto
 * Created by tsq on 2018/8/13 23:45.
 * VERSION 1.0.0
 */
@Data
public class HtmlDto {
    /**
     * 网页展示文本
     */
    private String text;
    /**
     * 网页展示图片
     */
    private String img;
    /**
     * 文本链接
     */
    private String link;
}
