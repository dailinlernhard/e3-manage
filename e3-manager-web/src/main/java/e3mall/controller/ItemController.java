package e3mall.controller;

import e3mall.pojo.TbItem;
import e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dailin on 2018/1/31.
 * 商品管理controller
 */
@Controller
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "/items/{id}")
    @ResponseBody
    public TbItem getItemById(@PathVariable(value = "id") Long itemId){
        return itemService.getItemById(itemId);
    }
}
