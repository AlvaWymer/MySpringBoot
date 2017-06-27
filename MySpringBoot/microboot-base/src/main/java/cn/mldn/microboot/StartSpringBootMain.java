package cn.mldn.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.microboot.test.TestSampleController;

//控制器
@Controller
////默认使用SpringBoot 的自动的文件配置
//@EnableAutoConfiguration
//@ComponentScan("cn.mldn.microboot") // 定义一个扫描路径
/**
 * 注意：
 * @author paul
 * 
 */
@SpringBootApplication // 启动SpringBoot程序，而后自带子包扫描
public class StartSpringBootMain {

//主方法
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartSpringBootMain.class, args);
	}
}