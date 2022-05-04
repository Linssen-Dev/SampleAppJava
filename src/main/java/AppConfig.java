

import com.sampleapp.service.SpeakerService;
import com.sampleapp.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * This is needed to bootstrapping our application
 * All Application Configuration will be added on this
 *
 * applicatioContext.xml replaced by @Configuration
 * @Congifuration at class level
 * Spring Beans defined by @Bean
 *
 * Reference:
 * https://www.javatpoint.com/java-bean
 * https://www.baeldung.com/java-serialization
 */

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl();
    }

    /**
     * Setter Injection - is simply a matter of calling a setter on a bean
     * Simple as a method call
     * "Mystery" of Injection goes away
     *
     * This beans are all by default a Singleton (only return a one instance)
     */

}
