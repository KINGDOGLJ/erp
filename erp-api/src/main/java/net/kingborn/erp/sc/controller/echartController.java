package net.kingborn.erp.sc.controller;

import net.kingborn.core.controller.BaseController;
import net.kingborn.core.controller.Controller;
import net.kingborn.core.entry.Result;
import net.kingborn.erp.sc.command.CAnalysisSaleChart;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/pro")
public class echartController extends BaseController {
    @PostMapping("/echart")
    public Result purchaseDetailList() {
        return doAction(CAnalysisSaleChart.class);
    }
}
