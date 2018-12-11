
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
  	<ul>
    	<li>Gender: """),_display_(/*6.19*/professorInfo/*6.32*/.gender),format.raw/*6.39*/("""</li>
    	<li>Quality Rating: """),_display_(/*7.27*/professorInfo/*7.40*/.quality),format.raw/*7.48*/("""</li>
    	<li>Difficulty Rating: """),_display_(/*8.30*/professorInfo/*8.43*/.difficulty),format.raw/*8.54*/("""</li>
    	<li>Number of Reviews: """),_display_(/*9.30*/professorInfo/*9.43*/.numberOfReviews),format.raw/*9.59*/("""</li>
    	<li>Url: <a href="""),_display_(/*10.24*/professorInfo/*10.37*/.url),format.raw/*10.41*/(""">"""),_display_(/*10.43*/professorInfo/*10.56*/.name),format.raw/*10.61*/("""'s Bio</a></li>
    </ul>
    <br/>
    Courses Taught: <br/>
    	<ol>
    		"""),_display_(/*15.8*/for(course <- professorInfo.teaches) yield /*15.44*/ {_display_(Seq[Any](format.raw/*15.46*/("""
        		"""),format.raw/*16.11*/("""<li><a href=""""),_display_(/*16.25*/routes/*16.31*/.Application.viewCommentsFilteredByProfessorAndCourse(professorInfo.name, course)),format.raw/*16.112*/("""">"""),_display_(/*16.115*/course),format.raw/*16.121*/("""</a></br></li>
     		""")))}),format.raw/*17.9*/("""
     	"""),format.raw/*18.7*/("""</ol>
  </p>
  <a href=""""),_display_(/*20.13*/routes/*20.19*/.Application.index()),format.raw/*20.39*/("""">Back to Main Page</a>
""")))}),format.raw/*21.2*/("""
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
                  DATE: Mon Dec 10 16:32:24 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/professor.scala.html
                  HASH: a472656e7a936c996edbd05c51d48856cca329db
                  MATRIX: 975->1|1116->47|1144->50|1204->102|1243->104|1263->106|1302->108|1331->111|1387->141|1408->154|1435->161|1493->193|1514->206|1542->214|1603->249|1624->262|1655->273|1716->308|1737->321|1773->337|1829->366|1851->379|1876->383|1905->385|1927->398|1953->403|2058->482|2110->518|2150->520|2189->531|2230->545|2245->551|2348->632|2379->635|2407->641|2460->664|2494->671|2546->696|2561->702|2602->722|2657->747
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|48->16|49->17|50->18|52->20|52->20|52->20|53->21
                  -- GENERATED --
              */
          