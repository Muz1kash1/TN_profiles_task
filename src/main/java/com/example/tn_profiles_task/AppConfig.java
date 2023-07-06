package com.example.tn_profiles_task;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
  private final Environment environment;
  public AppConfig(Environment environment){
    this.environment = environment;
  }

  public String getUsername(){
    return environment.getProperty("myapp.username");
  }
  public String getPassword(){
    return environment.getProperty("myapp.password");
  }
}
