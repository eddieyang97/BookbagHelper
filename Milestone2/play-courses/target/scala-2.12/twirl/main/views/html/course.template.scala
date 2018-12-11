
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

object course extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.CourseDB.CourseInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courseInfo: models.CourseDB.CourseInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main("Course Information: " + courseInfo.name)/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/(""" """)))}/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/("""
  """),format.raw/*4.3*/("""<p>
    Course Number: """),_display_(/*5.21*/courseInfo/*5.31*/.courseNumber),format.raw/*5.44*/("""<br/>
    <ul>
      """),_display_(/*7.8*/for(prof_name <- courseInfo.taughtBy) yield /*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/("""
        """),format.raw/*8.9*/("""<li><a href=""""),_display_(/*8.23*/routes/*8.29*/.Application.viewProfessor(prof_name)),format.raw/*8.66*/("""">"""),_display_(/*8.69*/prof_name),format.raw/*8.78*/("""</a>, <a href=""""),_display_(/*8.94*/routes/*8.100*/.Application.viewCommentsFilteredByProfessorAndCourse(prof_name, courseInfo.name)),format.raw/*8.181*/("""">associated comments</a></li>
      """)))}),format.raw/*9.8*/("""
    """),format.raw/*10.5*/("""</ul>
  </p>
  <a href=""""),_display_(/*12.13*/routes/*12.19*/.Application.index()),format.raw/*12.39*/("""">Back to Main Page</a>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(courseInfo:models.CourseDB.CourseInfo): play.twirl.api.HtmlFormat.Appendable = apply(courseInfo)

  def f:((models.CourseDB.CourseInfo) => play.twirl.api.HtmlFormat.Appendable) = (courseInfo) => apply(courseInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 09 21:22:14 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/course.scala.html
                  HASH: 601853e29697bfb0f44abfb9ce87ad6d27af1fe2
                  MATRIX: 969->1|1104->41|1132->44|1186->90|1225->92|1245->94|1284->96|1313->99|1363->123|1381->133|1414->146|1461->168|1513->205|1552->207|1587->216|1627->230|1641->236|1698->273|1727->276|1756->285|1798->301|1813->307|1915->388|1982->426|2014->431|2066->456|2081->462|2122->482|2177->507
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|40->8|41->9|42->10|44->12|44->12|44->12|45->13
                  -- GENERATED --
              */
          