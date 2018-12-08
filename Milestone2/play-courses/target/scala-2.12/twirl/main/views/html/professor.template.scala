
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

object professor extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.CourseDB.ProfessorInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(professorInfo: models.CourseDB.ProfessorInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),_display_(/*3.2*/main("Professor Information: " + professorInfo.name)/*3.54*/ {_display_(Seq[Any](format.raw/*3.56*/(""" """)))}/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/("""
  """),format.raw/*4.3*/("""<p>
    Gender: """),_display_(/*5.14*/professorInfo/*5.27*/.gender),format.raw/*5.34*/("""<br/>
    Quality Rating: """),_display_(/*6.22*/professorInfo/*6.35*/.quality),format.raw/*6.43*/("""<br/>
    Difficulty Rating: """),_display_(/*7.25*/professorInfo/*7.38*/.difficulty),format.raw/*7.49*/("""<br/>
    Number of Reviews: """),_display_(/*8.25*/professorInfo/*8.38*/.numberOfReviews),format.raw/*8.54*/("""<br/>
    Url: """),_display_(/*9.11*/professorInfo/*9.24*/.url),format.raw/*9.28*/("""<br/>
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.Application.index()),format.raw/*10.41*/("""">all professors</a>.
    <a href="https://users.cs.duke.edu/~junyang/">hyperline</a>
  </p>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(professorInfo:models.CourseDB.ProfessorInfo): play.twirl.api.HtmlFormat.Appendable = apply(professorInfo)

  def f:((models.CourseDB.ProfessorInfo) => play.twirl.api.HtmlFormat.Appendable) = (professorInfo) => apply(professorInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 08 16:45:16 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/professor.scala.html
                  HASH: a870f87a2cc57e84b9d725affe37cf203e10889c
                  MATRIX: 975->1|1116->47|1144->50|1204->102|1243->104|1263->106|1302->108|1331->111|1374->128|1395->141|1422->148|1475->175|1496->188|1524->196|1580->226|1601->239|1632->250|1688->280|1709->293|1745->309|1787->325|1808->338|1832->342|1879->362|1894->368|1935->388|2059->482
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|45->13
                  -- GENERATED --
              */
          