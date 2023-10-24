package com.mostafa.playwithsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(authorizeRequest -> authorizeRequest.anyRequest().authenticated())
                .httpBasic(withDefaults());

        /*httpSecurity.authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests.requestMatchers("/demo").hasAuthority("read")
                                .requestMatchers("/hello").authenticated()
                )
                .httpBasic(withDefaults());*/
        return httpSecurity.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        var u1 = User.withUsername("john")
                .password(passwordEncoder().encode("12345"))
                .authorities("read")
                .build();

        var u2 = User.withUsername("bill")
                .password(passwordEncoder().encode("12345"))
                .authorities("write")
                .build();

        InMemoryUserDetailsManager uds = new InMemoryUserDetailsManager();

        uds.createUser(u1);
        uds.createUser(u2);

        return uds;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();  // NoOpPasswordEncoder ---> marked as deprecated beacause you can ONLY use it in demos.
    }
}
