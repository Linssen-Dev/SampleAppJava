import com.sampleapp.service.SpeakerService;
import com.sampleapp.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        /**
         * Loading Spring and loading Configuration files
         * When this code runs it will create two beans from the AppConfig
         */
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//        SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

         System.out.println(service.findAll().get(0).getFirstName());
    }
}
