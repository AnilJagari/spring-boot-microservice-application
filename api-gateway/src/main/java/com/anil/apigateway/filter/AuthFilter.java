//package com.anil.apigateway.filter;
//
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class AuthFilter implements GlobalFilter {
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange,
//                             org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
//
//        String apiKey = exchange.getRequest().getHeaders().getFirst("X-API-KEY");
//
//        if (apiKey == null || !apiKey.equals("anil-secret")) {
//            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//            return exchange.getResponse().setComplete();
//        }
//
//        return chain.filter(exchange);
//    }
//}
