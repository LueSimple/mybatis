package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dao.ProductMapper;
import com.mybatis.dao.UserMapper;
import com.mybatis.domain.Product;
import com.mybatis.domain.User;








public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)加载配置文件

				String res = "mybatis.config.xml";

				try {

					//2)获取res对应的配置文件的输入流对象

					InputStream is = Resources.getResourceAsStream(res);

					//3)获取SqlsessionFactory对象

					SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

					//4)获取Sqlsession
					
					SqlSession ss = factory.openSession(true);

					//5)获取接口对象
					/*
					 * 用户
					 */			
//					查询
					UserMapper um1 = ss.getMapper(UserMapper.class);
					
					
					
//					模糊查询
//					List<User> u=um1.getUserLikeUname("%a%");
					
					
					
//					用户全查询
//					List<User> users=um1.getAll();
//					
//					for(User u: users) {
//						
//						System.out.println(u);
//						
//					}
					
//					User u = um1.getUserByUid(1);
					
					
					
//					添加
//					boolean u=um1.add("jane","123");
					
					
//					修改
//					User user=new User(3,"Maria","1235");
					
//					int u=um1.update(user);
					
//					long u=um1.update2("kangkang", 3);
					
					
//					删除
//					List<Integer> ids=new ArrayList();
//					ids.add(2);
//					boolean u =um1.del1(ids);
//					批量删除
//					List<Integer> id=new ArrayList<>();
//					
//					id.add(1);
//					
//					id.add(2);
//					
//					id.add(5);
//					
//					boolean u=um1.delByid(id);
				
				/*	
				 * 
				 * 商品*/
					
//					查询
//					ProductMapper um = ss.getMapper(ProductMapper.class);
					
//					Product u = um.getProductByproID(3);
					
					
					
					//6)执行UserMapper接口中的方法
					
//					Map<Integer ,User> alls=um1.getAlls();
//					
//					Set<Integer> keys=alls.keySet();
//					
//					for(int key: keys) {
//						
//						User u=alls.get(key);
//						
//						System.out.println(key+"="+u);
//						
//					}
					
					Map<String,Object> user=um1.getUserById(6);
					
					Set<Entry<String,Object>> entrys=user.entrySet();
					
					for(Entry<String,Object> en:entrys) {
						System.out.println(en.getKey()+"="+en.getValue());
					}
					
					System.out.println(user.size());
					
					ss.commit();
					
					
//					System.out.println(u);

				} catch (IOException e) {

					e.printStackTrace();

				}

	}

}
