package com.forum.dao;

import com.forum.domain.Tab;

import java.util.List;

/**
 * @Author: VaporYan
 * @Decription:
 * @Date: Created in 14:46 2018/5/27
 * @Modified By:
 */
public interface TabMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Tab record);

    int insertSelective(Tab record);

    Tab selectByPrimaryKey(Integer id);

    Tab getByTabNameEn(String tabName);

    int updateByPrimaryKeySelective(Tab record);

    int updateByPrimaryKey(Tab record);

    List<Tab> getAllTabs();

}
