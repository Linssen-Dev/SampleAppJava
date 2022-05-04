

import com.sampleapp.repository.HibernateSpeakerRepositoryImpl;
import com.sampleapp.repository.SpeakerRepository;
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
 * Beans here are implemented as Singleton
 *
 * Reference:
 * https://www.javatpoint.com/java-bean
 * https://www.baeldung.com/java-serialization
 */

@Configuration
public class AppConfig {

    /**
     * Setter Injection - is simply a matter of calling a setter on a bean
     * Simple as a method call
     * "Mystery" of Injection goes away
     *
     * This beans are all by default a Singleton (only return a one instance)
     */

    /**
     *
     * Setter Injection setRepository(getSpeakerRepository())
     * Instantiate the Speaker Service and
     * Inject Repository using setter function
     */
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        // Instantiate service
       SpeakerServiceImpl service = new SpeakerServiceImpl();
       // Inject Repository to Service
       service.setRepository(getSpeakerRepository());

       return service;
    }


    /**
     *
     * @return
     * Instantiate the speakerRepository / Speaker Model Data Access Layer
     */
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

}
