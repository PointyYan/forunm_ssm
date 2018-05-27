package com.forum.service.impl;

import com.forum.dao.TabMapper;
import com.forum.domain.Tab;
import com.forum.service.TabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:16 2018/5/27
 * @Modified By:
 */
@Service
public class TabServiceImpl implements TabService {

    @Autowired
    public TabMapper tabDao;

    public List<Tab> getAllTabs() {
        return tabDao.getAllTabs();
    }

    public Tab getByTabNameEn(String tabNameEn) {
        return tabDao.getByTabNameEn(tabNameEn);
    }
}
