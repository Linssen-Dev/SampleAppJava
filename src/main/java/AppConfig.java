import com.sampleapp.repository.HibernateSpeakerRepositoryImpl;
import com.sampleapp.repository.SpeakerRepository;
import com.sampleapp.service.SpeakerService;
import com.sampleapp.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * This is needed to bootstrapping our application
 * All Application Configuration will be added on this
 *
 * applicatioContext.xml replaced by @Configuration
 * @Congifuration - annotation to Define Congiguration Code
 * Spring Beans defined by @Bean
 *
 * Beans here are implemented as Singleton
 *
 * Reference:
 * https://www.javatpoint.com/java-bean
 * https://www.baeldung.com/java-serialization
 */

@Configuration
@ComponentScan({"com.sampleapp"})
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
     *
     *  @Scope(value = BeanDefinition.SCOPE_SINGLETON)
     *  make the SpeakerServiceImpl a singleton
     */
//    @Bean(name = "speakerService")
//   @Scope(value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        // Instantiate service
//       // SpeakerServiceImpl service = new SpeakerServiceImpl();
//        // Constructor Injection
//        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//       // Inject Repository to Service
//       //service.setRepository(getSpeakerRepository());
//
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//       return service;
//    }


    /**
     *
     * @return
     * Instantiate the speakerRepository / Speaker Model Data Access Layer
     */
//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//
//        return new HibernateSpeakerRepositoryImpl();
//    }

}
// Additional Notes
//Scopes
//        5 Scopes
//        Valid in any configuration
//        - Singleton
//        - Prototype
//        Valid only in web-aware Spring projects
//        - Request
//        - Session
//        - Global
//
//        Singleton
//        - Restrict the instantiation to just one object
//        - Default bean scope
//        - Single instance per Spring container
//
//        Singleton - Java Config
//
//@Service("customerService")
//@Scope("singleton")
//public class CustomerServiceImpl implements CustomerService

////    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//Prototype
//        - Per request
//        - Guaranteed unique
//        - Opposite of Singleton

//    Web Scopes
//
//- Spring MVC
//        - Request
//        - Session
//        - Global Session
//
//        AutoWired
//        - Convention over Configuration
//        - @ComponentScan({"com.linssen"})
//- @Bean
//- By Name Instance Type

