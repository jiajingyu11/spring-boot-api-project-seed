package com.company.project.service.impl;

import com.company.project.dao.ShopMapper;
import com.company.project.model.Shop;
import com.company.project.service.ShopService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import com.company.project.model.ShopExample;
import java.util.List;

/**
 * Created by jiajingyu on 2020/04/17.
 */
@Service
@Transactional
public class ShopServiceImpl extends AbstractService<Shop> implements ShopService {

    @Resource
    private ShopMapper tShopMapper;

    public List<Shop> findByExample(ShopExample tShopExample) {
        return tShopMapper.selectByExample(tShopExample);
    }

}
