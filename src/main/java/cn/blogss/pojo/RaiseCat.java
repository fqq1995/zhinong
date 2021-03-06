package cn.blogss.pojo;

import java.util.Date;

public class RaiseCat {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_cat.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_cat.pid
     *
     * @mbggenerated
     */
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_cat.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_cat.num
     *
     * @mbggenerated
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_cat.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column raise_cat.addTime
     *
     * @mbggenerated
     */
    private Date addtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_cat.id
     *
     * @return the value of raise_cat.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_cat.id
     *
     * @param id the value for raise_cat.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_cat.pid
     *
     * @return the value of raise_cat.pid
     *
     * @mbggenerated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_cat.pid
     *
     * @param pid the value for raise_cat.pid
     *
     * @mbggenerated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_cat.name
     *
     * @return the value of raise_cat.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_cat.name
     *
     * @param name the value for raise_cat.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_cat.num
     *
     * @return the value of raise_cat.num
     *
     * @mbggenerated
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_cat.num
     *
     * @param num the value for raise_cat.num
     *
     * @mbggenerated
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_cat.status
     *
     * @return the value of raise_cat.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_cat.status
     *
     * @param status the value for raise_cat.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column raise_cat.addTime
     *
     * @return the value of raise_cat.addTime
     *
     * @mbggenerated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column raise_cat.addTime
     *
     * @param addtime the value for raise_cat.addTime
     *
     * @mbggenerated
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    @Override
    public String toString() {
        return "RaiseCat{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", status=" + status +
                ", addtime=" + addtime +
                '}';
    }
}