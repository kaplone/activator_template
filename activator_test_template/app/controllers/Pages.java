package controllers;

import models.User;
import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

public class Pages extends Controller {

//
//    public Result unePage() {
//    	
//        return ok(page.render());
//    }
    
    public Result unePage_0() {
    	
        return ok(page.render(0));
    }
	
    public Result unePage_1() {
    	
        return ok(page.render(1));
    }
    
    public Result unePage_2() {
    	
        return ok(page.render(2));
    }
    public Result unePage_3() {
	
    return ok(page.render(3));
}


}
