package org.geektimes.projects.user.web.controller;

import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author daniyar
 * @version 1.0
 * @date 2021/3/3
 */
@Path("/user")
public class UserRegisterController implements PageController {

    @Override
    @Path("/register")
    @GET
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        System.out.println("用户注册。。。。");
        return "/user/register.jsp";
    }
}
