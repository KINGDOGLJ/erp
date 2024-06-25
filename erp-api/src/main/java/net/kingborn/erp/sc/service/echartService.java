package net.kingborn.erp.sc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import net.kingborn.erp.sc.model.echart;

import java.util.LinkedHashMap;
import java.util.List;

public interface echartService extends IService<echart> {
    List<LinkedHashMap<String,Object>> countGender();
}