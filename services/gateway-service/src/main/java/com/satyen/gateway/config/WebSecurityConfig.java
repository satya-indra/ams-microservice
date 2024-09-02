package com.satyen.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class WebSecurityConfig {

  @Bean
  public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) throws Exception {

    http
      .csrf(ServerHttpSecurity.CsrfSpec::disable)
      .authorizeExchange(exchanges ->
              exchanges
                      .pathMatchers("/api/v1/users/getAllUser").permitAll()
                      .pathMatchers("/api/v1/users/exists/*").permitAll())
        .authorizeExchange(exchanges ->
              exchanges
                      .anyExchange().authenticated()
                      )
      .oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults()));

    return http.build();

  }

}
