package com.javacode2018.chat03.demo4.mapper;

import com.javacode2018.chat03.demo4.dto.UserFindDto;
import com.javacode2018.chat03.demo4.model.UserModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.ResultHandler;

import javax.swing.tree.RowMapper;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 公众号：路人甲Java，工作10年的前阿里P7分享Java、算法、数据库方面的技术干货！坚信用技术改变命运，让家人过上更体面的生活!
 */
public interface UserMapper {
    /**
     * 通过name查询
     *
     * @param name
     * @return
     */
    UserModel getByName(String name);

    /**
     * 通过map查询
     *
     * @param map
     * @return
     */
    List<UserModel> getByMap(Map<String, Object> map);

    /**
     * 通过UserFindDto进行查询
     *
     * @param userFindDto
     * @return
     */
    List<UserModel> getListByUserFindDto(UserFindDto userFindDto);

    /**
     * 通过id或者name查询
     *
     * @param id
     * @param name
     * @return
     */
    UserModel getByIdOrName(@Param("userId") Long id, @Param("userName") String name);

    /**
     * 查询用户id列表
     *
     * @param idCollection
     * @return
     */
    List<UserModel> getListByIdCollection(Collection<Long> idCollection);

    /**
     * 查询用户id列表
     *
     * @param idList
     * @return
     */
    List<UserModel> getListByIdList(List<Long> idList);

    /**
     * 查询用户id列表
     *
     * @param idArray
     * @return
     */
    List<UserModel> getListByIdArray(Long[] idArray);

    void getList(ResultHandler<UserModel> resultHandler);
}
