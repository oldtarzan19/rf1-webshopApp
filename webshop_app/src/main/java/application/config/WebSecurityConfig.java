package application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import application.service.CustomUserDetailsService;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
            .authorizeRequests()
            .antMatchers("/edit/*").access("hasRole('felhasznalo') or hasRole('ROLE_ADMIN')")
            .antMatchers("/arucikk_hozzaadasa").access("hasRole('ROLE_ADMIN')")
            .antMatchers("/panaszbenyujtas").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
            .antMatchers("/felhasznalok_kezelese").access("hasRole('ROLE_ADMIN')")
            .and()
            .formLogin()
            .defaultSuccessUrl("/")
            .permitAll()
            .and()
            .logout().logoutSuccessUrl("/").permitAll();

  http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
    http.sessionManagement().maximumSessions(1).expiredUrl("/").and().invalidSessionUrl("/");

  }

  @Autowired
  protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {}

  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public UserDetailsService userDetailsService() {
    return new CustomUserDetailsService();
  }

}
