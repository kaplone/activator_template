package controllers;

import models.User;
import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	
	Form<User> userForm = Form.form(User.class);

    public Result index() {
    	
        return ok(index.render(userForm));
    }
    
    public Result submit(){
    	
    	User user = userForm.bindFromRequest().get();
    	return ok(resultat.render(user.username));
    }

}
