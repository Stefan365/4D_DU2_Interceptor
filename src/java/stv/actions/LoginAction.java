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

//@InterceptorRefs({@InterceptorRef("myChecker")})
//@InterceptorRefs({@InterceptorRef("myLoginInt"), @InterceptorRef("defaultStack")})
//@Results({@Result(name = "login", location = "general_page.jsp"),
//    @Result(name = "success", location = "entry_page.jsp")})
public class LoginAction extends ActionSupport {

    private String login;
    private String passwd;
    private String submit;

    public String getLogin() {
        return login;
    }

    public void setLogin(String lg) {
        login = lg;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String pw) {
        passwd = pw;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    @Override
    public String execute() throws Exception {
        Map<String, Object> session = ActionContext.getContext().getSession();
        System.out.println("XXXXXXX" + session.get("login") + session.get("password") );
        
        if (submit != null) {
            if ("Karel".equals(login) && "test".equals(passwd)) {
                session.put("login", login);
                session.put("password", passwd);
                return Action.SUCCESS;
            } else {
                return Action.INPUT;
            }
            
        } else {
            return Action.INPUT;
        }
            

    }
}
