package com.example.ejemplo_basico_camel;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

    public void configure(){
        from("timer:simple?=1000")
                .log("Procesando").end();

    }

}
