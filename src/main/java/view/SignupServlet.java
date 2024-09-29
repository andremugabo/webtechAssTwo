package view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String role = req.getParameter("role");

        // Check if password and confirmPassword match
        if (password.equals(confirmPassword)) {
            // Create cookies for username, password, and role
            Cookie userNameCookie = new Cookie("userName", username);
            Cookie passwordCookie = new Cookie("passWord", password);
            Cookie roleCookie = new Cookie("role", role);

            // Set cookies to expire after 1 hour
            userNameCookie.setMaxAge(60 * 60); // 1 hour
            passwordCookie.setMaxAge(60 * 60); // 1 hour
            roleCookie.setMaxAge(60 * 60); // 1 hour

            // Optionally add HttpOnly and Secure flags for security
            userNameCookie.setHttpOnly(true);
            passwordCookie.setHttpOnly(true);
            roleCookie.setHttpOnly(true);

            // Add cookies to the response
            res.addCookie(userNameCookie);
            res.addCookie(passwordCookie);
            res.addCookie(roleCookie);

            // Set response status as OK
            res.setStatus(HttpServletResponse.SC_OK);
        } else {
            // If passwords do not match, set the status as Unauthorized
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

            // You can also send an error message back to the client
            res.getWriter().write("Passwords do not match.");
        }
    }
}
