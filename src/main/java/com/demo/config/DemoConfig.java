package com.demo.config;

import com.demo.controller.HelloController;
import com.jfinal.config.*;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

/**
 * Created by xuxia on 2017/5/1.
 */
public class DemoConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants constants) {
        constants.setViewType(ViewType.JSP);
        constants.setDevMode(true);
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello", HelloController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
