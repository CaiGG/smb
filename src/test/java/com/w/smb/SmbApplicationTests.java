package com.w.smb;

import com.w.smb.bean.User;
import com.w.smb.dao.UserDao;
import com.w.smb.mapping.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmbApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	UserMapper userMapper;

	@Test
	public void insertTest(){
		User user = new User();
		user.setId("w");
		user.setUsername("1234");
		user.setPassword("2134");
		userMapper.insert(user);
	}

//	@Test
//	public void insertTest(){
//		User user = new User();
//		user.setId("w");
//		user.setUsername("1234");
//		user.setPassword("2134");
//		userDao.insertUser(user);
//	}

	@Test
	public void selectUser(){
		/*String usernames = "' or 1=1 --,123";

		ArrayList<String> list = new ArrayList<>("+","1");
		System.out.println(list.contains(""));*/
		/*List<User> users = userDao.selectUser(usernames);
		System.out.println(users.size());*/
	}
}
