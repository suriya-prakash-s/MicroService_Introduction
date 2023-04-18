package com.noobied.studentmodule.configuration;

import com.noobied.studentmodule.utility.StudentDtoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

    @Bean
    public StudentDtoMapper StudentEntityToDtoBean() {
        return new StudentDtoMapper();
    }
}
