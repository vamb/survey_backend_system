package com.suyang.dao;

import com.suyang.model.LibBook;

public interface LibBookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LibBook record);

    int insertSelective(LibBook record);

    LibBook selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LibBook record);

    int updateByPrimaryKey(LibBook record);
}