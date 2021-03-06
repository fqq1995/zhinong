package cn.blogss.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RaiseOrders {

    private Raise raise;

    public Raise getRaise() {
        return raise;
    }

    public void setRaise(Raise raise) {
        this.raise = raise;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_orders.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_orders.raise_id
     *
     * @mbggenerated
     */
    private Integer raiseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_orders.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_orders.amount
     *
     * @mbggenerated
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_orders.payment
     *
     * @mbggenerated
     */
    private BigDecimal payment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_orders.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_orders.num
     *
     * @mbggenerated
     */
    private String num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_orders.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_orders.id
     *
     * @return the value of raise_orders.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_orders.id
     *
     * @param id the value for raise_orders.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_orders.raise_id
     *
     * @return the value of raise_orders.raise_id
     *
     * @mbggenerated
     */
    public Integer getRaiseId() {
        return raiseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_orders.raise_id
     *
     * @param raiseId the value for raise_orders.raise_id
     *
     * @mbggenerated
     */
    public void setRaiseId(Integer raiseId) {
        this.raiseId = raiseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_orders.user_id
     *
     * @return the value of raise_orders.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_orders.user_id
     *
     * @param userId the value for raise_orders.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_orders.amount
     *
     * @return the value of raise_orders.amount
     *
     * @mbggenerated
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_orders.amount
     *
     * @param amount the value for raise_orders.amount
     *
     * @mbggenerated
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_orders.payment
     *
     * @return the value of raise_orders.payment
     *
     * @mbggenerated
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_orders.payment
     *
     * @param payment the value for raise_orders.payment
     *
     * @mbggenerated
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_orders.create_time
     *
     * @return the value of raise_orders.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_orders.create_time
     *
     * @param createTime the value for raise_orders.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_orders.num
     *
     * @return the value of raise_orders.num
     *
     * @mbggenerated
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_orders.num
     *
     * @param num the value for raise_orders.num
     *
     * @mbggenerated
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_orders.status
     *
     * @return the value of raise_orders.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_orders.status
     *
     * @param status the value for raise_orders.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RaiseOrders{" +
                "raise=" + raise +
                ", id=" + id +
                ", raiseId=" + raiseId +
                ", userId=" + userId +
                ", amount=" + amount +
                ", payment=" + payment +
                ", createTime=" + createTime +
                ", num='" + num + '\'' +
                ", status=" + status +
                '}';
    }
}