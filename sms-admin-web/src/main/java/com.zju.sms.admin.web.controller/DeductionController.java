package com.zju.sms.admin.web.controller;

import com.zju.sms.domain.Deduction;
import com.zju.sms.service.IDeductionService;
import com.zju.sms.util.UpdateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
public class DeductionController {
    @Autowired
    private IDeductionService deductionService;

    @RequestMapping(value = "/deductions",method = RequestMethod.POST)
    public String saveDeduction(@RequestBody Deduction deduction) {
        deduction.setDate((new Timestamp((new Date()).getTime())));
        deductionService.save(deduction);
        return"success";
    }

    @RequestMapping(value = "/deductions",method = RequestMethod.PUT)
    public String updateDeduction(@RequestBody Deduction deduction) {
        Deduction old = deductionService.get(deduction.getId());
        UpdateUtil.updateIfNotNull(old,deduction);
        deductionService.update(old);
        return"success";
    }

    @RequestMapping(value = "/deductions/{id}",method = RequestMethod.DELETE)
    public String deleteDeduction(@PathVariable("id") Integer id) {
        deductionService.delete(id);
        return"success";
    }

    @RequestMapping(value = "/deductions/{id}",method = RequestMethod.GET)
    public Deduction getDeduction(@PathVariable("id") Integer id){
        return deductionService.get(id);
    }

    @RequestMapping(value = "/deductions",method = RequestMethod.GET)
    public List<Deduction> getDeduction(){
        return deductionService.getAll();
    }
}
