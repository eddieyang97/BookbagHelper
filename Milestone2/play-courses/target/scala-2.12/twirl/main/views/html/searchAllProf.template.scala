
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

object searchAllProf extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.CourseDB.ProfessorInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(professors: List[models.CourseDB.ProfessorInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),_display_(/*3.2*/main("All Matched Professors")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/(""" """)))}/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""
  """),format.raw/*4.3*/("""<p>
  <a href=""""),_display_(/*5.13*/routes/*5.19*/.Application.index()),format.raw/*5.39*/("""">Back to Main Page</a>
  </p>
  <p>Click on professor below to view more information:
  </p>
	<table>
		<tr>
  			<th><a href=""""),_display_(/*11.20*/routes/*11.26*/.Application.searchAllProfessorSortByName()),format.raw/*11.69*/("""">Name</a></th>
  			<th><a href=""""),_display_(/*12.20*/routes/*12.26*/.Application.searchAllProfessorSortByQuality()),format.raw/*12.72*/("""">Quality</a></th>
     		<th><a href=""""),_display_(/*13.22*/routes/*13.28*/.Application.searchAllProfessorSortByDifficulty()),format.raw/*13.77*/("""">Difficulty</a></th>
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

  def render(professors:List[models.CourseDB.ProfessorInfo]): play.twirl.api.HtmlFormat.Appendable = apply(professors)

  def f:((List[models.CourseDB.ProfessorInfo]) => play.twirl.api.HtmlFormat.Appendable) = (professors) => apply(professors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 11 13:51:56 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/searchAllProf.scala.html
                  HASH: 5e2078ad8c3e5bba4d7c5c7fdbe42ec5d46541fc
                  MATRIX: 985->1|1129->50|1157->53|1195->83|1234->85|1254->87|1293->89|1322->92|1364->108|1378->114|1418->134|1574->263|1589->269|1653->312|1715->347|1730->353|1797->399|1864->439|1879->445|1949->494|2008->527|2047->550|2087->552|2118->556|2170->581|2185->587|2243->624|2273->627|2286->631|2312->636|2360->657|2373->661|2402->669|2446->686|2459->690|2491->701|2540->720|2570->723
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|47->15|47->15|47->15|48->16|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|53->21|54->22
                  -- GENERATED --
              */
          