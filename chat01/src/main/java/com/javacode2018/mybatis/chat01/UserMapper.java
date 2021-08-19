package com.javacode2018.mybatis.chat01;

import java.util.List;
import java.util.Map;

/**
 * 公众号：路人甲Java，工作10年的前阿里P7分享Java、算法、数据库方面的技术干货！坚信用技术改变命运，让家人过上更体面的生活!
 */
public interface UserMapper {

    /**
     * 插入用户信息
     *
     * @param userModel
     * @return
     */
    void insert(UserModel userModel);

    /**
     * 批量插入用户信息
     *
     * @param userModelList
     */
    void insertBatch(List<UserModel> userModelList);

    /**
     * 更新用户信息
     *
     * @param userModel
     * @return
     */
    int update(UserModel userModel);

    /**
     * 通过map来更新用户记录
     *
     * @param map
     * @return
     */
    int updateByMap(Map<String, Object> map);

    /**
     * 通过map来删除用户记录
     *
     * @param map
     * @return
     */
    int delete(Map<String, Object> map);

    /**
     * 查询用户列表
     *
     * @param map
     * @return
     */
    List<UserModel> getModelList(Map<String, Object> map);

}
