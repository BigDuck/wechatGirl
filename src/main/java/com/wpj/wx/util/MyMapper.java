/*
 * Copyright (c) 2015 - 10 - 13  10 : 34 :$second
 * @author wupeiji It will be
 * @Email wpjlovehome@gmail.com
 */

package com.wpj.wx.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @author liuzh_3nofxnp
 * @since 2015-09-06 21:53
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
