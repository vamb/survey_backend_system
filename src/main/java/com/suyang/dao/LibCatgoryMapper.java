package com.suyang.dao;

import com.suyang.model.LibCatgory;

public interface LibCatgoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LibCatgory record);

    int insertSelective(LibCatgory record);

    LibCatgory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LibCatgory record);

    int updateByPrimaryKey(LibCatgory record);
}