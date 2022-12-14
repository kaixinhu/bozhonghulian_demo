package com.bozhonghulian.service.impl;

import com.bozhonghulian.mappers.DrugMapper;
import com.bozhonghulian.pojo.Drug;
import com.bozhonghulian.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author:xiaokai
 * @Date 2022/12/14 16:29
 */
@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    DrugMapper drugMapper;

    @Override
    public int addDrug(Drug drug) {
        return drugMapper.addDrug(drug);
    }

    @Override
    public int delDrugById(String id) {
        return drugMapper.delDrugById(id);
    }

    @Override
    public int updateDrug(Drug drug) {
        return drugMapper.updateDrug(drug);
    }

    @Override
    public Drug queryDrugById(String id) {
        return drugMapper.queryDrugById(id);
    }

    @Override
    public List<Drug> queryAllDrug() {
        return drugMapper.queryAllDrug();
    }

    @Override
    public List<Drug> queryDrugByName(String dname) {
        return drugMapper.queryDrugByName(dname);
    }
}
