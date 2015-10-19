/*
 * Copyright (c) 2015 - 10 - 17  8 : 26 :33
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package com.wpj.wx.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WPJ587 on 2015/10/17.
 */
@RestController
public class BaseController {
    public Object toClient(String callbackParam,Object object){
        if(callbackParam==null){
            return object;
        }else {
            return new JSONPObject(callbackParam,object);
        }
    }
}
