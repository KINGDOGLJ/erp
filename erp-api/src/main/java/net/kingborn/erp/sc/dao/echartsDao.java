package net.kingborn.erp.sc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.kingborn.erp.sc.model.echart;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;

@Component
public interface echartsDao extends BaseMapper<echart>  {

    List<LinkedHashMap<String,Object>> countGender();
}
