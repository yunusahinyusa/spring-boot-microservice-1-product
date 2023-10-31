//package com.sha.springbootmicroservice1product.security;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfig {
//    @Value("${service.security.secure-key-username}")
//    private String SECURE_KEY_USERNAME;
//
//    @Value("${service.security.secure-key-password}")
//    private String SECURE_KEY_PASSWORD;
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
//                .authorizeHttpRequests(requests ->
//                        requests
//
//                                //TODO: requestMatchers should be fixed. Security forbids every request now!
//                                .requestMatchers(new AntPathRequestMatcher("/api/v1/auth/test", HttpMethod.GET.name()))
//                                .permitAll()
//
//
//                                .anyRequest()
//                                .authenticated()
//                )
////
//                .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .authenticationProvider(authenticationProvider)
//                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
//                .logout(logoutHandler -> logoutHandler.logoutUrl("/api/v1/auth/logout")
//                        .addLogoutHandler(logoutService)
//                        .logoutSuccessHandler((request, response, authentication) -> SecurityContextHolder.clearContext()));
//
//        return http.build();
//    }
//
//
////    @Override // kimlik doğrulaması
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        PasswordEncoder encoder = new BCryptPasswordEncoder(); // password hashing
////
////        auth.inMemoryAuthentication()
////                .passwordEncoder(encoder)
////                .withUser(SECURE_KEY_USERNAME)
////                .password(encoder.encode(SECURE_KEY_PASSWORD))
////                .roles("USER");
////    }
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        super.configure(http);
////        http.csrf().disable();
////    }
//
//}
