package com.example.tn_profiles_task;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TnProfilesTaskApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    AppConfig appConfig = context.getBean(AppConfig.class);

    String username = appConfig.getUsername();
    String password = appConfig.getPassword();
    System.out.println(username + " " + password);

    context.close();
  }

}
