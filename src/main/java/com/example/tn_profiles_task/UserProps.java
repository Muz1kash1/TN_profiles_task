package com.example.tn_profiles_task;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationPropertiesScan
@ConfigurationProperties(prefix = "user")
public class UserProps {
  private String token;
  private String mail;
}
