package com.example.tn_profiles_task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.yml")
@EnableConfigurationProperties(UserProps.class)
public class TnProfilesTaskApplication {

  @Value("${myapp.username}")
  private String username;
  @Value("${myapp.password}")
  private String password;
  @Autowired
  private UserProps userProps;

  public void showCredentials(){
    String token = userProps.getToken();
    String mail = userProps.getMail();
    System.out.println(username + " " + password + " " + token + " " + mail);
  }
  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(TnProfilesTaskApplication.class,args);
    TnProfilesTaskApplication tnProfilesTaskApplication = context.getBean(TnProfilesTaskApplication.class);
    tnProfilesTaskApplication.showCredentials();
  }

}
