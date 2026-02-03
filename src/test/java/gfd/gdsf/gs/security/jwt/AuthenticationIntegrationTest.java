package gfd.gdsf.gs.security.jwt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.test.annotation.DirtiesContext;

import gfd.gdsf.gs.config.SecurityConfiguration;
import gfd.gdsf.gs.config.SecurityJwtConfiguration;
import gfd.gdsf.gs.config.WebConfigurer;
import gfd.gdsf.gs.management.SecurityMetersService;

import tech.jhipster.config.JHipsterProperties;

import org.springframework.boot.test.context.SpringBootTest;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JHipsterProperties.class,
        WebConfigurer.class,
        SecurityConfiguration.class,
        SecurityJwtConfiguration.class,
        SecurityMetersService.class,
        JwtAuthenticationTestUtils.class
    }
)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface AuthenticationIntegrationTest {

}
