package org.example.demo.ticket.batch;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//    Classe de configuration de Spring
@Configuration
@ComponentScan("org.example.demo.ticket")
@ImportResource("classpath:/org/example/demo/ticket/batch/batchContext.xml")
public class SpringConfiguration {


}
