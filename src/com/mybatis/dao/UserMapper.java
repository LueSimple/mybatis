package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.mybatis.domain.User;

public interface UserMapper {
//查询
//	根据id查用户
	User getUserByUid(@Param("uid")int d);
	
//	查询所有用户
	List<User> getAll();
	
//	模糊查询
	List<User> getUserLikeUname(@Param("name")String uname);
	
	
	@MapKey("uid")
	Map<Integer,User> getAlls();
	
	
//添加
	boolean add(@Param("name") String uname,@Param("pwd") String upwd);
	
//修改
	int update (User user); 
	
	int update1(@Param("u")User user);
	
	long update2(String uname,int uid);
//删除	
//	删除--根据uid，形参是数组或者集合类型
	boolean del(@Param("id")int[] ids);
	
	boolean del1(@Param("ids")List<Integer> ids);

//	条件删除
	boolean delByid(@Param("id")List<Integer> id);
	
	
	
	@MapKey("uid")
	Map<Integer, User> getAlls1();
	
	Map<String,Object> getUserById(@Param("uid") int id);

	
	
	
	
	
}
