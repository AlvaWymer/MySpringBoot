package cn.mldn.microboot.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.microboot.StartSpringBootMain;
import junit.framework.TestCase;

/**
 * 测试类
 * 
 * @author paul
 *
 */
//测试这个主方法
@SpringBootTest(classes = StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
//使用web的配置
@WebAppConfiguration
public class TestSampleController {
	// 使用注解
	@Resource
	private StartSpringBootMain startSpringBootMain;

	// 测试的注解
	@Test
	public void testHome() {
		TestCase.assertEquals(this.startSpringBootMain.home(), "www.mldn.cn");
	}
}