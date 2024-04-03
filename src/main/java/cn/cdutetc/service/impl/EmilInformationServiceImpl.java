package cn.cdutetc.service.impl;

import cn.cdutetc.entity.EmilInformation;
import cn.cdutetc.mapper.EmilInformationMapper;
import cn.cdutetc.service.EmilInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmilInformationServiceImpl implements EmilInformationService {

    @Autowired
    private EmilInformationMapper emilInformationMapper;


    @Override
    public Integer insertByEmil(EmilInformation emilInformation) {
        return emilInformationMapper.insert(emilInformation);
    }
}
