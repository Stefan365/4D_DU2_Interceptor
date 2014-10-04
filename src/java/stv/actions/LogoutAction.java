/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stv.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author User
 */
//@InterceptorRefs({@InterceptorRef("myLoginInt"), @InterceptorRef("defaultStack")})
public class LogoutAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        Map<String, Object> session = ActionContext.getContext().getSession();

        session.remove("login");
        session.remove("password");
        /*
        session.put("login", "");
        session.put("password", "");
        */
        return Action.SUCCESS;
    }
}
