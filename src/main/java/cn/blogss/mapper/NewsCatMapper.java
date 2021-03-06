package cn.blogss.mapper;

import cn.blogss.pojo.NewsCat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsCatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cat
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cat
     *
     * @mbggenerated
     */
    int insert(NewsCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cat
     *
     * @mbggenerated
     */
    int insertSelective(NewsCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cat
     *
     * @mbggenerated
     */
    NewsCat selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cat
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NewsCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_cat
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NewsCat record);

    public abstract List<NewsCat> selectNewsCatByPage(@Param("pageIndex")int pageIndex,
                                                      @Param("pageSize")int pageSize,
                                                      @Param("newsCat")NewsCat newsCat);

    //新闻分类批量删除
    public abstract void delBatch(String[] ids);

    //模糊查询总记录
    public int totRecord(NewsCat newsCat);

    //添加新闻时的查询
    public List<NewsCat> newsAddShow();

    void increaseNumByCatId(Integer catId);

    List<NewsCat> selectNewsCat();
}