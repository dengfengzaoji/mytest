package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 引导类
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月31日 下午3:34:32
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages={"cn.itcast.springboot"}) // 代表该类为SpringBoot的引导类
public class Application {

	public static void main(String[] args) {
		/** 第一种方式：运行SpringBoot项目 */
		//SpringApplication.run(Application.class, args);
		
		/** 第二种方式：运行SpringBoot项目 */
		SpringApplication springApplication = new SpringApplication(Application.class);
		/** 设置关闭Banner横幅 */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}
