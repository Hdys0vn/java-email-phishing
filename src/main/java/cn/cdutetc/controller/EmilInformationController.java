package cn.cdutetc.controller;

import cn.cdutetc.common.Result;
import cn.cdutetc.entity.EmilInformation;
import cn.cdutetc.service.EmilInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmilInformationController {
    //注入emilInformationService
    @Autowired
    private EmilInformationService emilInformationService;

    @RequestMapping("/add")
    public Result add(EmilInformation emilInformation){
        Integer count = emilInformationService.insertByEmil(emilInformation);
        if (count != 0){
            return Result.ok("添加成功");
        }
        return Result.ok("添加失败");
    }
}
