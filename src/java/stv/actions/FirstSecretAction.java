/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stv.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author User
 */
//@InterceptorRef("myChecker")
//@Results({@Result(name = "success", location = "first_secret.jsp")})
//@InterceptorRefs({@InterceptorRef("myLoginInt"), @InterceptorRef("defaultStack")})
//@Results({@Result(name = "success", location = "first_secret.jsp"), 
//    @Result(name = "gohome", location = "default_page.jsp", type = "redirect")})
public class FirstSecretAction extends ActionSupport {

    /*
    @Override
    public String execute() throws Exception {
        
        Map<String, Object> session = ActionContext.getContext().getSession();
        System.out.println("AAAAAAA" + session.get("login") + session.get("password") );
        return Action.SUCCESS;
    }*/
}

