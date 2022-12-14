package com.bozhonghulian.controller;

import com.bozhonghulian.pojo.Drug;
import com.bozhonghulian.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Author:xiaokai
 * @Date 2022/12/14 16:33
 */
@Controller
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    DrugService drugService;

    //查询全部书籍
    @RequestMapping("/allDrug")
    public String list(Model model){
        List<Drug> list = drugService.queryAllDrug();
        model.addAttribute("list", list);
        return "allDrug";
    }

    //添加书籍
    @RequestMapping("/toAddDrug")
    public String toAddPaper() {
        return "addDrug";
    }

    @RequestMapping("/addDrug")
    public String addPaper(Drug drug) {
        drugService.addDrug(drug);
        return "redirect:/drug/allDrug";
    }


    //修改书籍
    @RequestMapping("/toUpdateDrug")
    public String toUpdateBook(Model model, String id) {
        Drug drug = drugService.queryDrugById(id);
        model.addAttribute("drug",drug );
        return "updateDrug";
    }

    @RequestMapping("/updateDrug")
    public String updateBook(Model model, Drug drug) {
        drugService.updateDrug(drug);
        Drug drug1 = drugService.queryDrugById(drug.getDid());
        model.addAttribute("drug", drug1);
        return "redirect:/drug/allDrug";
    }

    @RequestMapping("/del/{drugDid}")
    public String deleteBook(@PathVariable("drugDid") String id){
        drugService.delDrugById(id);
        return "redirect:/drug/allDrug";
    }

    @RequestMapping("queryDrug")
    public String queryBook(String queryDrugName,Model model){
        List<Drug> drug = drugService.queryDrugByName(queryDrugName);

        if (drug.size()==0){
            drug = drugService.queryAllDrug();
            model.addAttribute("err", "未寻到");
        }
        model.addAttribute("list", drug);
        return "allDrug";

    }
}
