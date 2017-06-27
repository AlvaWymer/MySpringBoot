package cn.mldn.microboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // 取代了上面的
public class HelloController {
	// 设置访问路径
	@RequestMapping("/")
	// 设置返回的restful 结构的内容
	@ResponseBody
	public String home() {
		return "www.mldn.cn";
	}

	// 访问路径：http://localhost:8080/echo?msg=hello；
	@RequestMapping("/echo")
	public String echo(String msg) {
		return "【ECHO】" + msg;
	}

	// 访问路径：http://localhost:8080/echo1/hello；
	@RequestMapping(value = "/echo1/{message}", method = RequestMethod.GET)
	public String echo1(@PathVariable("message") String msg) {
		return "【ECHO1】" + msg;
	}

	
	@RequestMapping("/object")
	public String object(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("*** 客户端IP地址：" + request.getRemoteAddr());
		System.out.println("*** 取得客户端响应编码：" + response.getCharacterEncoding());
		System.out.println("*** 取得SessionID：" + request.getSession().getId());
		System.out.println("*** 取得真实路径：" + request.getServletContext().getRealPath("/upload/"));
		return "www.mldn.cn";
	}
}