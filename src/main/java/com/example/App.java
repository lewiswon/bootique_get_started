package com.example;

import com.example.controller.Hello2Controller;
import com.example.controller.HelloController;
import io.bootique.BaseModule;
import io.bootique.Bootique;
import io.bootique.di.Binder;
import io.bootique.jersey.JerseyModule;
import io.bootique.jersey.jackson.JerseyJacksonModule;

/**
 * Hello world!
 *
 */
public class App extends BaseModule
{
    public static void main( String[] args )
    {
        Bootique
                .app(args)
                .autoLoadModules()
                .module(App.class)
                .exec()
                .exit();
    }

    @Override
    public void configure(Binder binder) {
        JerseyModule.extend(binder).addResource(HelloController.class).addResource(Hello2Controller.class);
        JerseyJacksonModule.extend(binder).skipNullProperties();
    }
}
