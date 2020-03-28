package com.example.demo.config;

/**
 * <ul>
 * <li>文件名称：MyAppConfig</li>
 * <li>文件描述：暂无描述</li>
 * <li>版权所有：版权所有(C) 2019</li>
 * <li>公 司：厦门云顶伟业信息技术有限公司</li>
 * <li>内容摘要：</li>
 * <li>其他说明：</li>
 * <li>创建日期：2020/3/28</li>
 * </ul>
 *
 * <ul>
 * <li>修改记录：</li>
 * <li>版 本 号：</li>
 * <li>修改日期：</li>
 * <li>修 改 人：</li>
 * <li>修改内容：</li>
 * </ul>
 *
 * @author chenyc
 * @version 1.0.0
 */

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
*  @Configuration  指明这是一个配置类
*/
@Configuration
public class MyAppConfig {
    //将方法的返回值添加到容器中,容器中这个组件默认的ID就是方法名
    @Bean
    public HelloService helloService02(){
        System.out.println("@bean注解给容器中添加组件了");
        return new HelloService();
    }
}
