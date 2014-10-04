/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stv.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author User
 */
//@InterceptorRefs({@InterceptorRef("myChecker")})
//@InterceptorRefs({@InterceptorRef("myLoginInt"), @InterceptorRef("defaultStack")})
//@Results({@Result(name = "success", location = "second_secret.jsp"), 
//    @Result(name = "gohome", location = "default_page.jsp",  type = "redirect")})
public class SecondSecretAction extends ActionSupport {

    
    
    @Override
    public String execute() throws Exception {
        
        return Action.SUCCESS;
    }
}

