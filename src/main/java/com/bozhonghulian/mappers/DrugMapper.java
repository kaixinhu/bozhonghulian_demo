package com.bozhonghulian.mappers;

import com.bozhonghulian.pojo.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author:xiaokai
 * @Date 2022/12/14 16:15
 */
@Mapper
@Repository
public interface DrugMapper {

    //增加一个Drug
    int addDrug(Drug drug);

    //根据id删除一个Drug
    int delDrugById(String id);

    //更新Drug
    int updateDrug(Drug drug);

    //根据id查询，返回一个Drug
    Drug queryDrugById(String id);

    //查询全部Drug，返回Drug
    List<Drug> queryAllDrug();
    //根据药名查询所有药品
    List<Drug> queryDrugByName(String dname);
}
