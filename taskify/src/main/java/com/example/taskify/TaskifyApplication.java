package com.example.taskify;

// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

// import java.math.BigDecimal;
// import java.time.LocalDateTime;
// import java.time.ZonedDateTime;
// import java.util.List;

@SpringBootApplication
public class TaskifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskifyApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(StudentRepository repository) {
//        return args -> {
//            Address address = new Address("Rwanda", "Kigali", "GUE66");
//            Student student = new Student(
//                    "cha",
//                    "wdwe",
//                    "edwed@jdew.mem",
//                    Gender.MALE,
//                    address,
//                    List.of("Computer sciences"),
//                    BigDecimal.TEN,
//                    LocalDateTime.now()
//            );
//            repository.insert(student);
//        };
//    }
}
