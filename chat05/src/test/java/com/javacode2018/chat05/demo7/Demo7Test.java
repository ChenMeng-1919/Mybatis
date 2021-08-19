package com.javacode2018.chat05.demo7;

import com.javacode2018.chat05.demo7.mapper.OrderMapper;
import com.javacode2018.chat05.demo7.model.OrderModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import sun.util.resources.cldr.lg.LocaleNames_lg;

import java.io.IOException;
import java.io.InputStream;

/**
 * 公众号：路人甲Java，工作10年的前阿里P7分享Java、算法、数据库方面的技术干货！坚信用技术改变命运，让家人过上更体面的生活!
 * <p>
 * 结果自动映射各种案例
 */
@Slf4j
public class Demo7Test {
    private SqlSessionFactory sqlSessionFactory;

    public void before(String mybatisConfig) throws IOException {
        //读取全局配置文件
        InputStream inputStream = Resources.getResourceAsStream(mybatisConfig);
        //构建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Test
    public void getById1() throws IOException {
        this.before("demo7/mybatis-config.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById1(1);
            log.info("{}", orderModel);
        }
    }

    @Test
    public void getById2() throws IOException {
        this.before("demo7/mybatis-config.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById2(2);
            log.info("{}", orderModel);
        }
    }

    @Test
    public void getById3() throws IOException {
        this.before("demo7/mybatis-config.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById3(2);
            log.info("{}", orderModel);
        }
    }

    @Test
    public void getById4() throws IOException {
        this.before("demo7/mybatis-config1.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById4(2);
            log.info("{}", orderModel);
        }
    }

    @Test
    public void getById5() throws IOException {
        this.before("demo7/mybatis-config2.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById5(2);
            log.info("{}", orderModel);
        }
    }

    @Test
    public void getById6() throws IOException {
        this.before("demo7/mybatis-config2.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById6(2);
            log.info("{}", orderModel);
        }
    }

    @Test
    public void getById6_0() throws IOException {
        this.before("demo7/mybatis-config3.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById6(2);
            log.info("{}", orderModel);
        }
    }

    @Test
    public void getById7() throws IOException {
        this.before("demo7/mybatis-config1.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById7(2);
            log.info("{}", orderModel);
        }
    }

    @Test
    public void getById8() throws IOException {
        this.before("demo7/mybatis-config.xml");
        try (SqlSession sqlSession = this.sqlSessionFactory.openSession(true);) {
            OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
            OrderModel orderModel = mapper.getById8(1);
            log.info("{}", orderModel);
        }
    }

}