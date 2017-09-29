package com.suyang.dao;

import com.suyang.model.LibRecord;

public interface LibRecordMapper {
    int insert(LibRecord record);

    int insertSelective(LibRecord record);
}