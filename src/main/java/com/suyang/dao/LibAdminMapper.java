package com.suyang.dao;

import com.suyang.model.LibAdmin;

public interface LibAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LibAdmin record);

    int insertSelective(LibAdmin record);

    LibAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LibAdmin record);

    int updateByPrimaryKey(LibAdmin record);
}