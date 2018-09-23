package com.itheima.items.Service;

import com.itheima.items.domain.Items;

/**
 * Description:
 * User: konakona
 * Date: 2018/9/21
 */
public interface ItemsService {

    /**
     * 根据id查询一个
     * @param id
     * @return
     */
    public Items findOne(Integer id);
}
