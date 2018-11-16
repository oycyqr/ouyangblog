package cn.com.ouyangblog.filter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author oyc
 * @Title: LoginInterceptor
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/16 22:04
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("LoginInterceptor preHandle  。。。。。。。。。。。。。。。");
        /* try {
            HttpSession session = request.getSession();
            System.out.println("session  : " + session.getAttribute("scenicUser"));
            if (session.getAttribute("scenicUser") == null) {
                response.sendRedirect("/seengene/login");
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("LoginInterceptor postHandle 。。。。。。。。。。。。。。。");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("LoginInterceptor afterCompletion 。。。。。。。。。。。。。。。");
    }
}