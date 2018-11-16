package cn.com.ouyangblog;

import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author oyc
 * @Title: SwaggerConfiguration
 * @ProjectName ouyangblog
 * @Description: Blog的Swagger 接口测试配置
 * @date 2018/11/16 21:01
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.com.ouyangblog.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //自定义信息可按需求填写
                .title("OuYangBlog Swagger APIs")
                .description("OuYangBlog使用Swagger构建RESTful APIs")
                .termsOfServiceUrl("http://www.ouyangblog.com")
                .contact(new Contact("ouyangcheng","http://www.baidu.com","1456682842@qq.com"))
                .version("1.0.0")
                .build();
    }
}
