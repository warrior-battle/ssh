package action;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;


import entity.User;
import service.UserService;
@Controller
public class UserAction extends ActionSupport{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Autowired
    private UserService userService;//

    public String toLogin(){
        List<User>list=userService.findAll();
//        for (User user : list) {
//            System.out.println(user.getUserName());
//        }
//        boolean a=true;
    	userService.findById(0);
    	
        return "success";
    }
    
}