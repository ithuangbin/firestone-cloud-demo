package com.firestone.api;

import com.firestone.common.model.ServerResult;
import com.firestone.common.model.es.CydnPersonInformationInfos;
import com.firestone.service.IPersonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huang
 * @Date: 2018/9/30 09:39
 * @Description:
 */
@RestController
@RequestMapping("person")
public class PersonerApi {

    @Autowired
    private IPersonerService personerService;

    @RequestMapping(value = "detail",method = RequestMethod.POST)
    public ServerResult<Object> detail(@RequestParam("id") String id, @RequestParam("areaId") String areaId){
        CydnPersonInformationInfos infos  = personerService.findDetail(id,areaId);
        return ServerResult.success(infos);
    }
}