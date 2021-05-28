package com.neosoft.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/get")
						.filters(f -> f.addRequestHeader("MyHeader", "MyURI").addRequestParameter("Param", "MyValue"))
						.uri("http://httpbin.org:80"))
				.route(p -> p.path("/temperature-change/**").uri("lb://temperature-change"))
				.route(p -> p.path("/temperature-conversion-feign/**").uri("lb://temperature-conversion")) // lb-load balancer
				.route(p -> p.path("/temperature-conversion-new/**")
						.filters(f -> f.rewritePath("/temperature-conversion-new/(?<segment>.*)",
								"/temperature-conversion-feign/${segment}"))
						.uri("lb://temperature-conversion"))
				.build();
	}
}