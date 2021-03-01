package com.imooc.service;

import com.imooc.pojo.Carousel;

import java.util.List;

/**
 * @author:Nhx
 * @description
 * @date:2021-03-01
 */
public interface CarouselService {

    /**
     * 查询所有轮播图列表
     * @param isShow
     * @return
     */
    public List<Carousel> queryAll(Integer isShow);
}
