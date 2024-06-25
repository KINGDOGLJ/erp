package net.kingborn.erp.sc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.kingborn.erp.sc.dao.echartsDao;
import net.kingborn.erp.sc.service.echartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.kingborn.erp.sc.model.echart;

import java.util.LinkedHashMap;
import java.util.List;

@Service
@Transactional
public class echartServiceImpl extends ServiceImpl<net.kingborn.erp.sc.dao.echartsDao, echart> implements echartService {
    @Autowired
    private echartsDao echartsDao;

    @Override
    public List<LinkedHashMap<String, Object>> countGender() {
        return echartsDao.countGender();
    }
}