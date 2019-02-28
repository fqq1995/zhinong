package cn.blogss.mapper;

import cn.blogss.pojo.RaiseOrders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RaiseOrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table raise_orders
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table raise_orders
     *
     * @mbggenerated
     */
    int insert(RaiseOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table raise_orders
     *
     * @mbggenerated
     */
    int insertSelective(RaiseOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table raise_orders
     *
     * @mbggenerated
     */
    RaiseOrders selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table raise_orders
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RaiseOrders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table raise_orders
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RaiseOrders record);

    RaiseOrders queryByIdWithSucKill(@Param("raiseId") int raiseId, @Param("userId") int userId);

    List<?> queryByRaiseId(int raiseId);

    public abstract List<RaiseOrders> selectRaiseOrdersByPage(@Param("pageIndex") int pageIndex,
                  @Param("pageSize") int pageSize, @Param("raiseOrders") RaiseOrders raiseOrders);

    //订单批量删除
    public abstract void delBatch(String[] ids);

    public int totRecord(RaiseOrders raiseOrders);
}