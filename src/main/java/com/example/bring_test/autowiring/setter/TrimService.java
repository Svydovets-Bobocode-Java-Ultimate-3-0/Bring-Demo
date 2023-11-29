package com.example.bring_test.autowiring.setter;

import com.example.bring_test.beans.CommonService;
import svydovets.core.annotation.Autowired;
import svydovets.core.annotation.Component;

@Component
public class TrimService {
    private CommonService commonService;

    @Autowired
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    public CommonService getCommonService() {
        return commonService;
    }
}
