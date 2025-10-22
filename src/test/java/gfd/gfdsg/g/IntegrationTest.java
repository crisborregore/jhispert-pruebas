package gfd.gfdsg.g;
import gfd.gfdsg.g.config.EmbeddedKafka;

import gfd.gfdsg.g.JhipsterRepoGitApp;
import gfd.gfdsg.g.config.AsyncSyncConfiguration;
import gfd.gfdsg.g.config.EmbeddedMongo;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = {JhipsterRepoGitApp.class, AsyncSyncConfiguration.class})
@EmbeddedMongo
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
