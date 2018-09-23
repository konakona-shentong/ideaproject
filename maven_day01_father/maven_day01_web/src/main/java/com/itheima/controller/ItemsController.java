package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * User: konakona
 * Date: 2018/9/22
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findOne")
    public String findOne(Integer id, Model model){
        Items one = itemsService.findOne(id);
        model.addAttribute("item",one);
        return "itemDetail";
    }
}
