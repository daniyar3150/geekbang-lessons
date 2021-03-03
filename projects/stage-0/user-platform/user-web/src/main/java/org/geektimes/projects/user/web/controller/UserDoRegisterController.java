package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Enumeration;

/**
 * @author daniyar
 * @version 1.0
 * @date 2021/3/3
 */
@Path("/user")
public class UserDoRegisterController implements PageController {


    private UserService userService;

    public  UserDoRegisterController() {
        userService = new UserServiceImpl();
    }

    @Override
    @POST
    @Path("/doRegister")
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setPhoneNumber(request.getParameter("phone"));
        userService.register(user);
        return "success.jsp";
    }
}
