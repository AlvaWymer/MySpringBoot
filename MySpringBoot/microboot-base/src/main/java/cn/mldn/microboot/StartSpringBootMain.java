package cn.mldn.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mldn.microboot.test.TestSampleController;

//控制器
@Controller
//默认使用SpringBoot 的自动的文件配置
@EnableAutoConfiguration
public class StartSpringBootMain {
//	设置访问路径
	@RequestMapping("/")
//	设置返回的restful 结构的内容
	@ResponseBody
	public String home() {
		return "www.mldn.cn";
	}
//主方法
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartSpringBootMain.class, args);
	}
}