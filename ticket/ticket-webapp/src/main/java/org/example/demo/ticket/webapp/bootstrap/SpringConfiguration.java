package org.example.demo.ticket.webapp.bootstrap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//    Classe de configuration de Spring
@Configuration
@ComponentScan("org.example.demo.ticket")
@ImportResource("classpath:/org/example/demo/ticket/webapp/webappContext.xml")
public class SpringConfiguration {


}
