// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PlaySamples/multiplex-movie-management/conf/routes
// @DATE:Wed Apr 15 10:33:10 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_5: controllers.HomeController,
  // @LINE:8
  MovieController_3: controllers.MovieController,
  // @LINE:16
  MultiplexController_1: controllers.MultiplexController,
  // @LINE:24
  SocketController_2: controllers.SocketController,
  // @LINE:27
  SocketControllerMultiplex_0: controllers.SocketControllerMultiplex,
  // @LINE:34
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_5: controllers.HomeController,
    // @LINE:8
    MovieController_3: controllers.MovieController,
    // @LINE:16
    MultiplexController_1: controllers.MultiplexController,
    // @LINE:24
    SocketController_2: controllers.SocketController,
    // @LINE:27
    SocketControllerMultiplex_0: controllers.SocketControllerMultiplex,
    // @LINE:34
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_5, MovieController_3, MultiplexController_1, SocketController_2, SocketControllerMultiplex_0, Assets_4, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, MovieController_3, MultiplexController_1, SocketController_2, SocketControllerMultiplex_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movie/create""", """controllers.MovieController.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies""", """controllers.MovieController.listAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movie/create""", """controllers.MovieController.createMovie(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movie/update""", """controllers.MovieController.updateMovie(request:Request, id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movie/updateMovie""", """controllers.MovieController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movie/delete""", """controllers.MovieController.deleteMovie(request:Request, id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/create""", """controllers.MultiplexController.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplexs""", """controllers.MultiplexController.listAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/create""", """controllers.MultiplexController.createcMultiplex(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/update""", """controllers.MultiplexController.updateMultiplex(request:Request, id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/updateMovie""", """controllers.MultiplexController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/delete""", """controllers.MultiplexController.deleteMultiplex(request:Request, id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sock""", """controllers.SocketController.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sock/chat""", """controllers.SocketController.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sockMultiplex""", """controllers.SocketControllerMultiplex.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sockMultiplex/chat""", """controllers.SocketControllerMultiplex.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movie/searchByName""", """controllers.MovieController.searchByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiplex/searchByName""", """controllers.MultiplexController.searchByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_MovieController_save1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movie/create")))
  )
  private[this] lazy val controllers_MovieController_save1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MovieController_3.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """movie/create""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_MovieController_listAll2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies")))
  )
  private[this] lazy val controllers_MovieController_listAll2_invoker = createInvoker(
    MovieController_3.listAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "listAll",
      Nil,
      "GET",
      this.prefix + """movies""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_MovieController_createMovie3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movie/create")))
  )
  private[this] lazy val controllers_MovieController_createMovie3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MovieController_3.createMovie(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "createMovie",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """movie/create""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_MovieController_updateMovie4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movie/update")))
  )
  private[this] lazy val controllers_MovieController_updateMovie4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MovieController_3.updateMovie(fakeValue[play.mvc.Http.Request], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "updateMovie",
      Seq(classOf[play.mvc.Http.Request], classOf[Integer]),
      "GET",
      this.prefix + """movie/update""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_MovieController_update5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movie/updateMovie")))
  )
  private[this] lazy val controllers_MovieController_update5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MovieController_3.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """movie/updateMovie""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MovieController_deleteMovie6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movie/delete")))
  )
  private[this] lazy val controllers_MovieController_deleteMovie6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MovieController_3.deleteMovie(fakeValue[play.mvc.Http.Request], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "deleteMovie",
      Seq(classOf[play.mvc.Http.Request], classOf[Integer]),
      "GET",
      this.prefix + """movie/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_MultiplexController_save7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/create")))
  )
  private[this] lazy val controllers_MultiplexController_save7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_1.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """multiplex/create""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MultiplexController_listAll8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplexs")))
  )
  private[this] lazy val controllers_MultiplexController_listAll8_invoker = createInvoker(
    MultiplexController_1.listAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "listAll",
      Nil,
      "GET",
      this.prefix + """multiplexs""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MultiplexController_createcMultiplex9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/create")))
  )
  private[this] lazy val controllers_MultiplexController_createcMultiplex9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_1.createcMultiplex(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "createcMultiplex",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """multiplex/create""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_MultiplexController_updateMultiplex10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/update")))
  )
  private[this] lazy val controllers_MultiplexController_updateMultiplex10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_1.updateMultiplex(fakeValue[play.mvc.Http.Request], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "updateMultiplex",
      Seq(classOf[play.mvc.Http.Request], classOf[Integer]),
      "GET",
      this.prefix + """multiplex/update""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_MultiplexController_update11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/updateMovie")))
  )
  private[this] lazy val controllers_MultiplexController_update11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_1.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """multiplex/updateMovie""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_MultiplexController_deleteMultiplex12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/delete")))
  )
  private[this] lazy val controllers_MultiplexController_deleteMultiplex12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MultiplexController_1.deleteMultiplex(fakeValue[play.mvc.Http.Request], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "deleteMultiplex",
      Seq(classOf[play.mvc.Http.Request], classOf[Integer]),
      "GET",
      this.prefix + """multiplex/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_SocketController_index13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sock")))
  )
  private[this] lazy val controllers_SocketController_index13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SocketController_2.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocketController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """sock""",
      """ Routes for websocket""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_SocketController_socket14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sock/chat")))
  )
  private[this] lazy val controllers_SocketController_socket14_invoker = createInvoker(
    SocketController_2.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocketController",
      "socket",
      Nil,
      "GET",
      this.prefix + """sock/chat""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_SocketControllerMultiplex_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sockMultiplex")))
  )
  private[this] lazy val controllers_SocketControllerMultiplex_index15_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SocketControllerMultiplex_0.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocketControllerMultiplex",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """sockMultiplex""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_SocketControllerMultiplex_socket16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sockMultiplex/chat")))
  )
  private[this] lazy val controllers_SocketControllerMultiplex_socket16_invoker = createInvoker(
    SocketControllerMultiplex_0.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocketControllerMultiplex",
      "socket",
      Nil,
      "GET",
      this.prefix + """sockMultiplex/chat""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_MovieController_searchByName17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movie/searchByName")))
  )
  private[this] lazy val controllers_MovieController_searchByName17_invoker = createInvoker(
    MovieController_3.searchByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "searchByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """movie/searchByName""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_MultiplexController_searchByName18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiplex/searchByName")))
  )
  private[this] lazy val controllers_MultiplexController_searchByName18_invoker = createInvoker(
    MultiplexController_1.searchByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MultiplexController",
      "searchByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """multiplex/searchByName""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_5.index)
      }
  
    // @LINE:8
    case controllers_MovieController_save1_route(params@_) =>
      call { 
        controllers_MovieController_save1_invoker.call(
          req => MovieController_3.save(req))
      }
  
    // @LINE:9
    case controllers_MovieController_listAll2_route(params@_) =>
      call { 
        controllers_MovieController_listAll2_invoker.call(MovieController_3.listAll)
      }
  
    // @LINE:10
    case controllers_MovieController_createMovie3_route(params@_) =>
      call { 
        controllers_MovieController_createMovie3_invoker.call(
          req => MovieController_3.createMovie(req))
      }
  
    // @LINE:11
    case controllers_MovieController_updateMovie4_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_MovieController_updateMovie4_invoker.call(
          req => MovieController_3.updateMovie(req, id))
      }
  
    // @LINE:12
    case controllers_MovieController_update5_route(params@_) =>
      call { 
        controllers_MovieController_update5_invoker.call(
          req => MovieController_3.update(req))
      }
  
    // @LINE:14
    case controllers_MovieController_deleteMovie6_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_MovieController_deleteMovie6_invoker.call(
          req => MovieController_3.deleteMovie(req, id))
      }
  
    // @LINE:16
    case controllers_MultiplexController_save7_route(params@_) =>
      call { 
        controllers_MultiplexController_save7_invoker.call(
          req => MultiplexController_1.save(req))
      }
  
    // @LINE:17
    case controllers_MultiplexController_listAll8_route(params@_) =>
      call { 
        controllers_MultiplexController_listAll8_invoker.call(MultiplexController_1.listAll)
      }
  
    // @LINE:18
    case controllers_MultiplexController_createcMultiplex9_route(params@_) =>
      call { 
        controllers_MultiplexController_createcMultiplex9_invoker.call(
          req => MultiplexController_1.createcMultiplex(req))
      }
  
    // @LINE:19
    case controllers_MultiplexController_updateMultiplex10_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_MultiplexController_updateMultiplex10_invoker.call(
          req => MultiplexController_1.updateMultiplex(req, id))
      }
  
    // @LINE:20
    case controllers_MultiplexController_update11_route(params@_) =>
      call { 
        controllers_MultiplexController_update11_invoker.call(
          req => MultiplexController_1.update(req))
      }
  
    // @LINE:21
    case controllers_MultiplexController_deleteMultiplex12_route(params@_) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_MultiplexController_deleteMultiplex12_invoker.call(
          req => MultiplexController_1.deleteMultiplex(req, id))
      }
  
    // @LINE:24
    case controllers_SocketController_index13_route(params@_) =>
      call { 
        controllers_SocketController_index13_invoker.call(
          req => SocketController_2.index(req))
      }
  
    // @LINE:25
    case controllers_SocketController_socket14_route(params@_) =>
      call { 
        controllers_SocketController_socket14_invoker.call(SocketController_2.socket)
      }
  
    // @LINE:27
    case controllers_SocketControllerMultiplex_index15_route(params@_) =>
      call { 
        controllers_SocketControllerMultiplex_index15_invoker.call(
          req => SocketControllerMultiplex_0.index(req))
      }
  
    // @LINE:28
    case controllers_SocketControllerMultiplex_socket16_route(params@_) =>
      call { 
        controllers_SocketControllerMultiplex_socket16_invoker.call(SocketControllerMultiplex_0.socket)
      }
  
    // @LINE:30
    case controllers_MovieController_searchByName17_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_MovieController_searchByName17_invoker.call(MovieController_3.searchByName(name))
      }
  
    // @LINE:31
    case controllers_MultiplexController_searchByName18_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_MultiplexController_searchByName18_invoker.call(MultiplexController_1.searchByName(name))
      }
  
    // @LINE:34
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
