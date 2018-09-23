package com.itheima.dao;

import com.itheima.domain.Items;

/**
 * Description:持久层接口
 * User: konakona
 * Date: 2018/9/22
 */
public interface ItemsDao {

    /**
     * 根据id查询一个
     * @param id
     * @return
     */
    public Items findOne(Integer id);
}
