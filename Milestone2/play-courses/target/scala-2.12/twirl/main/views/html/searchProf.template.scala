
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

object searchProf extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[models.CourseDB.ProfessorInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchedName:String, professors: List[models.CourseDB.ProfessorInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/main("All Matched Professors for " + searchedName)/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/(""" """)))}/*3.56*/ {_display_(Seq[Any](format.raw/*3.58*/("""
  """),format.raw/*4.3*/("""<p>
  <a href=""""),_display_(/*5.13*/routes/*5.19*/.Application.index()),format.raw/*5.39*/("""">Back to Main Page</a>
  </p>
  <p>Click on professor below to view more information:
  </p>
	<table>
		<tr>
  			<th><a href=""""),_display_(/*11.20*/routes/*11.26*/.Application.searchProfessorSortByName(searchedName)),format.raw/*11.78*/("""">Name</a></th>
  			<th><a href=""""),_display_(/*12.20*/routes/*12.26*/.Application.searchProfessorSortByQuality(searchedName)),format.raw/*12.81*/("""">Quality</a></th>
     		<th><a href=""""),_display_(/*13.22*/routes/*13.28*/.Application.searchProfessorSortByDifficulty(searchedName)),format.raw/*13.86*/("""">Difficulty</a></th>
		</tr>
		"""),_display_(/*15.4*/for(prof <- professors) yield /*15.27*/ {_display_(Seq[Any](format.raw/*15.29*/("""
 		"""),format.raw/*16.4*/("""<tr>
    		<th><a href=""""),_display_(/*17.21*/routes/*17.27*/.Application.viewProfessor(prof.name)),format.raw/*17.64*/("""">"""),_display_(/*17.67*/prof/*17.71*/.name),format.raw/*17.76*/("""</a></th>
    		<th>"""),_display_(/*18.12*/prof/*18.16*/.quality),format.raw/*18.24*/("""</th>
    		<th>"""),_display_(/*19.12*/prof/*19.16*/.difficulty),format.raw/*19.27*/("""</th>
 		</tr>
 		""")))}),format.raw/*21.5*/("""
 	"""),format.raw/*22.3*/("""</table>
""")))}))
      }
    }
  }

  def render(searchedName:String,professors:List[models.CourseDB.ProfessorInfo]): play.twirl.api.HtmlFormat.Appendable = apply(searchedName,professors)

  def f:((String,List[models.CourseDB.ProfessorInfo]) => play.twirl.api.HtmlFormat.Appendable) = (searchedName,professors) => apply(searchedName,professors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 11 13:51:56 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/searchProf.scala.html
                  HASH: b9312944d53a1d29909c5a3b71a4f5effc0a4457
                  MATRIX: 989->1|1154->71|1182->74|1240->124|1279->126|1299->128|1338->130|1367->133|1409->149|1423->155|1463->175|1619->304|1634->310|1707->362|1769->397|1784->403|1860->458|1927->498|1942->504|2021->562|2080->595|2119->618|2159->620|2190->624|2242->649|2257->655|2315->692|2345->695|2358->699|2384->704|2432->725|2445->729|2474->737|2518->754|2531->758|2563->769|2612->788|2642->791
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|47->15|47->15|47->15|48->16|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|53->21|54->22
                  -- GENERATED --
              */
          