/*
 * Copyright (c) 2015 - 10 - 17  5 : 19 :26
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package com.wpj.wx.serviceImpl;

import com.wpj.wx.dao.TbSliderMapper;
import com.wpj.wx.daomain.TbSlider;
import com.wpj.wx.service.BaseService;
import com.wpj.wx.service.SliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WPJ587 on 2015/10/17.
 */
@Service
public class SliderServiceImpl extends BaseService<TbSlider> implements SliderService {
    @Autowired
    TbSliderMapper tbSliderMapper;


    @Override
    public TbSlider findAllMenuMessageById(int id) {
        TbSlider tbSlider=tbSliderMapper.selectAllMenuMessageById(id);
//        System.out.println("----》"+tbSlider.getContent().size());
        return tbSlider;
    }
}
