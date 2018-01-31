package e3mall.service;

import e3mall.mapper.TbItemMapper;
import e3mall.pojo.TbItem;
import e3mall.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dailin on 2018/1/30.
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    TbItemMapper tbItemMapper;

    public TbItem getItemById(Long id) {
        System.out.println("id:" + id);
        TbItemExample tbItemExample = new TbItemExample();
        TbItemExample.Criteria criteria = tbItemExample.createCriteria();
        criteria.andIdEqualTo(id);

        List<TbItem> tbItems = tbItemMapper.selectByExample(tbItemExample);

        if (tbItems.size()!=0 && tbItems != null){
            return tbItems.get(0);
        }
        return null;
    }
}
