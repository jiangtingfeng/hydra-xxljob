package net.app315.hydra.transfer.job.executor.server.config.swagger;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import net.app315.hydra.transfer.job.executor.common.AppConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:    Swagger2Config 配置功能模块
 * @Author:         xiaoliang.chen
 * @Date:     2019/8/21 上午11:45
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Swagger2Config {

    @Value("${swagger2.enable}")
    private boolean enable;

    @Bean
    public Docket regulationApis() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/(" + AppConstants.SERVICE_NAME + "/).*"))
                .build()
                .apiInfo(apiInfo())
                .enable(enable);
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("甲骨文超级码", "http://www.app315.net/", "pubaccount@app315.net");
        return new ApiInfoBuilder()
                .title("迁徙系统任务")
                .description("迁徙系统任务相关接口")
                .termsOfServiceUrl("http://www.app315.net/")
                .contact(contact)
                .version("0.1")
                .build();
    }
}