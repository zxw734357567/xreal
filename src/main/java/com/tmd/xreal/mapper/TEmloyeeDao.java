package com.tmd.xreal.mapper;

import com.tmd.xreal.dto.TEmployContainOrder;
import com.tmd.xreal.entities.TEmloyee;
import com.tmd.xreal.entities.TEmloyeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TEmloyeeDao {

    @Select("select * from t_emloyee where id=#{sddsd}")
    TEmloyee selectById(@Param("sddsd") Integer id);

    long countByExample(TEmloyeeExample example);

    int deleteByExample(TEmloyeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TEmloyee record);

    int insertSelective(TEmloyee record);

    List<TEmloyee> selectByExample(TEmloyeeExample example);

    TEmloyee selectByPrimaryKey(Integer id);

    List<TEmloyee> selectAll();
    List<TEmployContainOrder> selectTemployAndOrders();

    int updateByExampleSelective(@Param("record") TEmloyee record, @Param("example") TEmloyeeExample example);

    int updateByExample(@Param("record") TEmloyee record, @Param("example") TEmloyeeExample example);

    int updateByPrimaryKeySelective(TEmloyee record);

    int updateByPrimaryKey(TEmloyee record);
}