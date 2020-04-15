// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PlaySamples/multiplex-movie-management/conf/routes
// @DATE:Wed Apr 15 10:33:10 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:34
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:24
  class ReverseSocketController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sock")
    }
  
    // @LINE:25
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sock/chat")
    }
  
  }

  // @LINE:8
  class ReverseMovieController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "movie/create")
    }
  
    // @LINE:9
    def listAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies")
    }
  
    // @LINE:14
    def deleteMovie(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movie/delete" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:30
    def searchByName(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movie/searchByName" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:12
    def update(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movie/updateMovie")
    }
  
    // @LINE:10
    def createMovie(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movie/create")
    }
  
    // @LINE:11
    def updateMovie(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movie/update" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:16
  class ReverseMultiplexController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "multiplex/create")
    }
  
    // @LINE:18
    def createcMultiplex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/create")
    }
  
    // @LINE:17
    def listAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplexs")
    }
  
    // @LINE:21
    def deleteMultiplex(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/delete" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:31
    def searchByName(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/searchByName" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:20
    def update(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/updateMovie")
    }
  
    // @LINE:19
    def updateMultiplex(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiplex/update" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
  }

  // @LINE:27
  class ReverseSocketControllerMultiplex(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sockMultiplex")
    }
  
    // @LINE:28
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sockMultiplex/chat")
    }
  
  }


}
