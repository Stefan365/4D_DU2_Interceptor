/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stv.interceptors;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

/**
 *
 * @author User
 */
public class MyLoginInterceptor extends AbstractInterceptor {

    /**
     *
     * @param ai
     * @return
     * @throws java.lang.Exception
     */
    @Override
    public String intercept(ActionInvocation ai) throws Exception {

        ActionContext actionContext = ai.getInvocationContext();
        Map<String, Object> session = actionContext.getSession();
        String action = ai.getInvocationContext().getName();
        
        if ("myLogin".equals(action) || "myLogout".equals(action)) {
            return ai.invoke();
        } else {
            String log, pw;
            log = (String) session.get("login");
            pw = (String) session.get("password");

            if ("Karel".equals(log) && "test".equals(pw)) {
                return ai.invoke();
            } else {
                return "input";//Action.INPUT;   
            }
        }
    }
}
