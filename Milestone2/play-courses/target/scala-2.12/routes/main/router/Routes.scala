
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316Proj/Milestone2/play-courses/conf/routes
// @DATE:Mon Dec 10 17:50:54 EST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_1: controllers.Application,
  // @LINE:24
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_1: controllers.Application,
    // @LINE:24
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """professor/""" + "$" + """name<[^/]+>""", """controllers.Application.viewProfessor(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-all-professor""", """controllers.Application.searchAllProfessor()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-all-professor-sort-by-name""", """controllers.Application.searchAllProfessorSortByName()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-all-professor-sort-by-quality""", """controllers.Application.searchAllProfessorSortByQuality()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-all-professor-sort-by-difficulty""", """controllers.Application.searchAllProfessorSortByDifficulty()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-all-course""", """controllers.Application.searchAllCourse()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """course/""" + "$" + """name<[^/]+>""", """controllers.Application.viewCourse(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """prof_name<[^/]+>/""" + "$" + """course_name<[^/]+>""", """controllers.Application.viewCommentsFilteredByProfessorAndCourse(prof_name:String, course_name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """prof_name<[^/]+>""", """controllers.Application.viewCommentsFilteredByProfessor(prof_name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """course_name<[^/]+>""", """controllers.Application.viewCommentsFilteredByCourse(course_name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """course_name<[^/]+>/""" + "$" + """semester<[^/]+>""", """controllers.Application.viewCommentsFilteredByCourseAndSemester(course_name:String, semester:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-professor-sort-by-name/""" + "$" + """name<[^/]+>""", """controllers.Application.searchProfessorSortByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-professor-sort-by-quality/""" + "$" + """name<[^/]+>""", """controllers.Application.searchProfessorSortByQuality(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-professor-sort-by-difficulty/""" + "$" + """name<[^/]+>""", """controllers.Application.searchProfessorSortByDifficulty(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-professor""", """controllers.Application.searchProfessor()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-course""", """controllers.Application.searchCourse()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Application_viewProfessor1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("professor/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_viewProfessor1_invoker = createInvoker(
    Application_1.viewProfessor(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewProfessor",
      Seq(classOf[String]),
      "GET",
      this.prefix + """professor/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_searchAllProfessor2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-all-professor")))
  )
  private[this] lazy val controllers_Application_searchAllProfessor2_invoker = createInvoker(
    Application_1.searchAllProfessor(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchAllProfessor",
      Nil,
      "GET",
      this.prefix + """search-all-professor""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_searchAllProfessorSortByName3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-all-professor-sort-by-name")))
  )
  private[this] lazy val controllers_Application_searchAllProfessorSortByName3_invoker = createInvoker(
    Application_1.searchAllProfessorSortByName(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchAllProfessorSortByName",
      Nil,
      "GET",
      this.prefix + """search-all-professor-sort-by-name""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_searchAllProfessorSortByQuality4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-all-professor-sort-by-quality")))
  )
  private[this] lazy val controllers_Application_searchAllProfessorSortByQuality4_invoker = createInvoker(
    Application_1.searchAllProfessorSortByQuality(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchAllProfessorSortByQuality",
      Nil,
      "GET",
      this.prefix + """search-all-professor-sort-by-quality""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_searchAllProfessorSortByDifficulty5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-all-professor-sort-by-difficulty")))
  )
  private[this] lazy val controllers_Application_searchAllProfessorSortByDifficulty5_invoker = createInvoker(
    Application_1.searchAllProfessorSortByDifficulty(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchAllProfessorSortByDifficulty",
      Nil,
      "GET",
      this.prefix + """search-all-professor-sort-by-difficulty""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_searchAllCourse6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-all-course")))
  )
  private[this] lazy val controllers_Application_searchAllCourse6_invoker = createInvoker(
    Application_1.searchAllCourse(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchAllCourse",
      Nil,
      "GET",
      this.prefix + """search-all-course""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_viewCourse7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("course/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_viewCourse7_invoker = createInvoker(
    Application_1.viewCourse(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewCourse",
      Seq(classOf[String]),
      "GET",
      this.prefix + """course/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_viewCommentsFilteredByProfessorAndCourse8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("prof_name", """[^/]+""",true), StaticPart("/"), DynamicPart("course_name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_viewCommentsFilteredByProfessorAndCourse8_invoker = createInvoker(
    Application_1.viewCommentsFilteredByProfessorAndCourse(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewCommentsFilteredByProfessorAndCourse",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """comment/""" + "$" + """prof_name<[^/]+>/""" + "$" + """course_name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_viewCommentsFilteredByProfessor9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("prof_name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_viewCommentsFilteredByProfessor9_invoker = createInvoker(
    Application_1.viewCommentsFilteredByProfessor(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewCommentsFilteredByProfessor",
      Seq(classOf[String]),
      "GET",
      this.prefix + """comment/""" + "$" + """prof_name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_viewCommentsFilteredByCourse10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("course_name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_viewCommentsFilteredByCourse10_invoker = createInvoker(
    Application_1.viewCommentsFilteredByCourse(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewCommentsFilteredByCourse",
      Seq(classOf[String]),
      "GET",
      this.prefix + """comment/""" + "$" + """course_name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_viewCommentsFilteredByCourseAndSemester11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("course_name", """[^/]+""",true), StaticPart("/"), DynamicPart("semester", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_viewCommentsFilteredByCourseAndSemester11_invoker = createInvoker(
    Application_1.viewCommentsFilteredByCourseAndSemester(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "viewCommentsFilteredByCourseAndSemester",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """comment/""" + "$" + """course_name<[^/]+>/""" + "$" + """semester<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_searchProfessorSortByName12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-professor-sort-by-name/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_searchProfessorSortByName12_invoker = createInvoker(
    Application_1.searchProfessorSortByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchProfessorSortByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """search-professor-sort-by-name/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_searchProfessorSortByQuality13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-professor-sort-by-quality/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_searchProfessorSortByQuality13_invoker = createInvoker(
    Application_1.searchProfessorSortByQuality(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchProfessorSortByQuality",
      Seq(classOf[String]),
      "GET",
      this.prefix + """search-professor-sort-by-quality/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_searchProfessorSortByDifficulty14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-professor-sort-by-difficulty/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_searchProfessorSortByDifficulty14_invoker = createInvoker(
    Application_1.searchProfessorSortByDifficulty(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchProfessorSortByDifficulty",
      Seq(classOf[String]),
      "GET",
      this.prefix + """search-professor-sort-by-difficulty/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_searchProfessor15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-professor")))
  )
  private[this] lazy val controllers_Application_searchProfessor15_invoker = createInvoker(
    Application_1.searchProfessor(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchProfessor",
      Nil,
      "POST",
      this.prefix + """search-professor""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_searchCourse16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-course")))
  )
  private[this] lazy val controllers_Application_searchCourse16_invoker = createInvoker(
    Application_1.searchCourse(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchCourse",
      Nil,
      "POST",
      this.prefix + """search-course""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:6
    case controllers_Application_viewProfessor1_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_viewProfessor1_invoker.call(Application_1.viewProfessor(name))
      }
  
    // @LINE:7
    case controllers_Application_searchAllProfessor2_route(params) =>
      call { 
        controllers_Application_searchAllProfessor2_invoker.call(Application_1.searchAllProfessor())
      }
  
    // @LINE:8
    case controllers_Application_searchAllProfessorSortByName3_route(params) =>
      call { 
        controllers_Application_searchAllProfessorSortByName3_invoker.call(Application_1.searchAllProfessorSortByName())
      }
  
    // @LINE:9
    case controllers_Application_searchAllProfessorSortByQuality4_route(params) =>
      call { 
        controllers_Application_searchAllProfessorSortByQuality4_invoker.call(Application_1.searchAllProfessorSortByQuality())
      }
  
    // @LINE:10
    case controllers_Application_searchAllProfessorSortByDifficulty5_route(params) =>
      call { 
        controllers_Application_searchAllProfessorSortByDifficulty5_invoker.call(Application_1.searchAllProfessorSortByDifficulty())
      }
  
    // @LINE:11
    case controllers_Application_searchAllCourse6_route(params) =>
      call { 
        controllers_Application_searchAllCourse6_invoker.call(Application_1.searchAllCourse())
      }
  
    // @LINE:12
    case controllers_Application_viewCourse7_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_viewCourse7_invoker.call(Application_1.viewCourse(name))
      }
  
    // @LINE:13
    case controllers_Application_viewCommentsFilteredByProfessorAndCourse8_route(params) =>
      call(params.fromPath[String]("prof_name", None), params.fromPath[String]("course_name", None)) { (prof_name, course_name) =>
        controllers_Application_viewCommentsFilteredByProfessorAndCourse8_invoker.call(Application_1.viewCommentsFilteredByProfessorAndCourse(prof_name, course_name))
      }
  
    // @LINE:14
    case controllers_Application_viewCommentsFilteredByProfessor9_route(params) =>
      call(params.fromPath[String]("prof_name", None)) { (prof_name) =>
        controllers_Application_viewCommentsFilteredByProfessor9_invoker.call(Application_1.viewCommentsFilteredByProfessor(prof_name))
      }
  
    // @LINE:15
    case controllers_Application_viewCommentsFilteredByCourse10_route(params) =>
      call(params.fromPath[String]("course_name", None)) { (course_name) =>
        controllers_Application_viewCommentsFilteredByCourse10_invoker.call(Application_1.viewCommentsFilteredByCourse(course_name))
      }
  
    // @LINE:16
    case controllers_Application_viewCommentsFilteredByCourseAndSemester11_route(params) =>
      call(params.fromPath[String]("course_name", None), params.fromPath[String]("semester", None)) { (course_name, semester) =>
        controllers_Application_viewCommentsFilteredByCourseAndSemester11_invoker.call(Application_1.viewCommentsFilteredByCourseAndSemester(course_name, semester))
      }
  
    // @LINE:17
    case controllers_Application_searchProfessorSortByName12_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_searchProfessorSortByName12_invoker.call(Application_1.searchProfessorSortByName(name))
      }
  
    // @LINE:18
    case controllers_Application_searchProfessorSortByQuality13_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_searchProfessorSortByQuality13_invoker.call(Application_1.searchProfessorSortByQuality(name))
      }
  
    // @LINE:19
    case controllers_Application_searchProfessorSortByDifficulty14_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_Application_searchProfessorSortByDifficulty14_invoker.call(Application_1.searchProfessorSortByDifficulty(name))
      }
  
    // @LINE:21
    case controllers_Application_searchProfessor15_route(params) =>
      call { 
        controllers_Application_searchProfessor15_invoker.call(Application_1.searchProfessor())
      }
  
    // @LINE:22
    case controllers_Application_searchCourse16_route(params) =>
      call { 
        controllers_Application_searchCourse16_invoker.call(Application_1.searchCourse())
      }
  
    // @LINE:24
    case controllers_Assets_at17_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_0.at(path, file))
      }
  }
}
