package cn.cdutetc.mapper;

import cn.cdutetc.entity.EmilInformation;
import org.springframework.stereotype.Repository;

@Repository
public interface EmilInformationMapper {
    //插入单条信息
    public Integer insert(EmilInformation emilInformation);
}
