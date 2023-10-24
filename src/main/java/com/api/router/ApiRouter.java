package com.api.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;

@Configuration
public class ApiRouter {

    @Bean
    public RouterFunction<ServerResponse> apiRoutes() {
        return route(GET("/example"), request -> ServerResponse.ok().build());
    }
}
