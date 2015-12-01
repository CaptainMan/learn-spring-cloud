package ignoreme.learn_spring_cloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ConfigServerApplication.class);
    }

    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servletBean = new ServletRegistrationBean(dispatcherServlet());
        servletBean.setName("appServlet");
        servletBean.setLoadOnStartup(1);
        servletBean.addInitParameter("contextConfig",
                "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
        servletBean.addInitParameter("contextConfigLocation",
                "ignoreme.learn_spring_cloud.greeter.ConfigServerApplication");
        return servletBean;
    }

}
