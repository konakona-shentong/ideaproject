package com.itheima.items.Service.impl;

import com.itheima.items.domain.Items;
import com.itheima.items.Service.ItemsService;
import com.itheima.items.dao.ItemsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * User: konakona
 * Date: 2018/9/21
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService{

    @Autowired
    private ItemsDao itemsDao;

    public Items findOne(Integer id) {
        return itemsDao.findOne(id);
    }
}
