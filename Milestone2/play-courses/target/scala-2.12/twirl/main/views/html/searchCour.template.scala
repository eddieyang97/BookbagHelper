
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object searchCour extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.CourseDB.CourseInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courses: List[models.CourseDB.CourseInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""

"""),_display_(/*3.2*/main("All Matched Courses")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/(""" """)))}/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
  """),format.raw/*4.3*/("""<p>Click on course below to view more information:
    <ul>
      """),_display_(/*6.8*/for(course <- courses) yield /*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
        """),format.raw/*7.9*/("""<li><a href=""""),_display_(/*7.23*/routes/*7.29*/.Application.viewCourse(course.name)),format.raw/*7.65*/("""">"""),_display_(/*7.68*/course/*7.74*/.courseNumber),format.raw/*7.87*/(""" """),format.raw/*7.88*/(""": """),_display_(/*7.91*/course/*7.97*/.name),format.raw/*7.102*/("""</a></li>
      """)))}),format.raw/*8.8*/("""
    """),format.raw/*9.5*/("""</ul>
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.Application.index()),format.raw/*10.41*/("""">Back to Main Page</a>
  </p>
""")))}))
      }
    }
  }

  def render(courses:List[models.CourseDB.CourseInfo]): play.twirl.api.HtmlFormat.Appendable = apply(courses)

  def f:((List[models.CourseDB.CourseInfo]) => play.twirl.api.HtmlFormat.Appendable) = (courses) => apply(courses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 10 22:54:45 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/searchCour.scala.html
                  HASH: 278074390a5a1a014492c106f5484ec074d190be
                  MATRIX: 979->1|1117->44|1145->47|1180->74|1219->76|1239->78|1278->80|1307->83|1399->150|1436->172|1475->174|1510->183|1550->197|1564->203|1620->239|1649->242|1663->248|1696->261|1724->262|1753->265|1767->271|1793->276|1839->293|1870->298|1917->318|1932->324|1973->344
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|40->8|41->9|42->10|42->10|42->10
                  -- GENERATED --
              */
          