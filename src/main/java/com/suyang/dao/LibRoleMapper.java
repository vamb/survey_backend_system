package com.suyang.dao;

import com.suyang.model.LibRole;

public interface LibRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LibRole record);

    int insertSelective(LibRole record);

    LibRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LibRole record);

    int updateByPrimaryKey(LibRole record);
}