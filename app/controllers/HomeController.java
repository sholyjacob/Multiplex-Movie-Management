package controllers;

import play.mvc.*;

public class HomeController extends Controller {

    public Result index(Http.Request request) {
        String url = routes.SearchController.socket().webSocketURL(request);
        return ok(views.html.index.render(url));
   }

}
