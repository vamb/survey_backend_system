package com.suyang.dao;

import com.suyang.model.LibUser;

public interface LibUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LibUser record);

    int insertSelective(LibUser record);

    LibUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LibUser record);

    int updateByPrimaryKey(LibUser record);
}