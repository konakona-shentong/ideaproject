package com.itheima.service;

import com.itheima.domain.Items;

/**
 * Description:
 * User: konakona
 * Date: 2018/9/22
 */
public interface ItemsService {

    /**
     * 根据id查询一个
     * @param id
     * @return
     */
    public Items findOne(Integer id);
}
