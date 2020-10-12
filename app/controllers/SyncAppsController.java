package controllers;
import play.mvc.*;

public class SyncAppsController extends Controller{
    
    public Result index(){
        return ok(views.html.index.render());
    }
    
    public Result display(){
        return ok(views.html.display.render());
    }

}