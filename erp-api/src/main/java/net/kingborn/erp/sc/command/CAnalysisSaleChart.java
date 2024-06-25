package net.kingborn.erp.sc.command;

import net.kingborn.core.command.BaseCommand;
import net.kingborn.core.command.Command;
import net.kingborn.erp.sc.service.echartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.List;

@Command
public class CAnalysisSaleChart extends BaseCommand {
    @Autowired
    private echartService echartService;

    @Override
    protected void init() throws Exception {

    }

    @Override
    protected void doCommand() throws Exception{
        List<LinkedHashMap<String, Object>> list = echartService.countGender();
        data.put("list", list);
    }
}
