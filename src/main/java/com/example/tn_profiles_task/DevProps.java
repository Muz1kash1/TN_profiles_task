package com.example.tn_profiles_task;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Getter
@Setter
@Configuration
@ConfigurationPropertiesScan
@Profile("dev")
@ConfigurationProperties(prefix = "dev")
public class DevProps {
  private String token;
  private String mail;
}
