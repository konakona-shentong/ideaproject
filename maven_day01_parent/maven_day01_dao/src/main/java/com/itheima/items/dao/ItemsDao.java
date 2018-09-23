package com.itheima.items.dao;

import com.itheima.items.domain.Items;

/**
 * Description:
 * User: konakona
 * Date: 2018/9/21
 */
public interface ItemsDao {

    /**
     * 根据id查询一个
     * @param id
     * @return
     */
    public Items findOne(Integer id);
}
