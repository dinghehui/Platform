package com.hd.ibus.mapper;

import com.hd.ibus.pojo.IbusGateway;

public interface IbusGatewayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_gateway
     *
     * @mbggenerated Tue Oct 11 16:37:18 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_gateway
     *
     * @mbggenerated Tue Oct 11 16:37:18 CST 2016
     */
    int insert(IbusGateway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_gateway
     *
     * @mbggenerated Tue Oct 11 16:37:18 CST 2016
     */
    int insertSelective(IbusGateway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_gateway
     *
     * @mbggenerated Tue Oct 11 16:37:18 CST 2016
     */
    IbusGateway selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_gateway
     *
     * @mbggenerated Tue Oct 11 16:37:18 CST 2016
     */
    int updateByPrimaryKeySelective(IbusGateway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ibus_gateway
     *
     * @mbggenerated Tue Oct 11 16:37:18 CST 2016
     */
    int updateByPrimaryKey(IbusGateway record);
}