//package com.anil.apigateway.filter;
//
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Mono;
//
//@Component
//public class LoggingFilter implements GlobalFilter {
//
//    @Override
//    public Mono<Void> filter(org.springframework.web.server.ServerWebExchange exchange,
//                             org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
//
//        System.out.println("Incoming Request → " + exchange.getRequest().getURI());
//
//        return chain.filter(exchange).then(
//                Mono.fromRunnable(() ->
//                        System.out.println("Outgoing Response ← " + exchange.getResponse().getStatusCode()))
//        );
//    }
//}
