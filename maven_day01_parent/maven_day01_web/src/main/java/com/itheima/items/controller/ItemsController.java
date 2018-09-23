package com.itheima.items.controller;

import com.itheima.items.domain.Items;
import com.itheima.items.Service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * User: konakona
 * Date: 2018/9/21
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("findOne")
    public String findOne(Integer id, Model model){
        Items one = itemsService.findOne(id);
        model.addAttribute("item",one);
        return "itemDetail";
    }
}
