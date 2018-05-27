package com.forum.service;

import com.forum.domain.Tab;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 16:12 2018/5/27
 * @Modified By:
 */
public interface TabService {

    List<Tab> getAllTabs();

    Tab getByTabNameEn(String tabName);
}
