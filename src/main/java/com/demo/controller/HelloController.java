package com.demo.controller;

import com.jfinal.core.Controller;

/**
 * Created by xuxia on 2017/5/1.
 */
public class HelloController extends Controller {
    public void index() {
        renderText("你好，世界");
    }
}
