package com.hd.ibus.mapper;

import java.util.Map;

import com.hd.ibus.pojo.IbusTpvi;

public interface IbusTpviMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_tpvi
     *
     * @mbggenerated Tue Oct 18 13:47:53 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_tpvi
     *
     * @mbggenerated Tue Oct 18 13:47:53 CST 2016
     */
    int insert(IbusTpvi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_tpvi
     *
     * @mbggenerated Tue Oct 18 13:47:53 CST 2016
     */
    int insertSelective(Map record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_tpvi
     *
     * @mbggenerated Tue Oct 18 13:47:53 CST 2016
     */
    IbusTpvi selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_tpvi
     *
     * @mbggenerated Tue Oct 18 13:47:53 CST 2016
     */
    int updateByPrimaryKeySelective(IbusTpvi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_tpvi
     *
     * @mbggenerated Tue Oct 18 13:47:53 CST 2016
     */
    int updateByPrimaryKey(IbusTpvi record);
}