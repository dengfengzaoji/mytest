package cn.itcast.springboot.service.impl;

import org.springframework.stereotype.Service;

import cn.itcast.springboot.service.UserService;

/**
 * UserServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午4:02:24
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public void say() {
		System.out.println("=========sayyou===========");
	}

}
