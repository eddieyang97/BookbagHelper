
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
	"""),format.raw/*4.2*/("""<table>
		<tr>
  			<th><a href=""""),_display_(/*6.20*/routes/*6.26*/.Application.searchAllProfessorSortByName()),format.raw/*6.69*/("""">Name</a></th>
  			<th><a href=""""),_display_(/*7.20*/routes/*7.26*/.Application.searchAllProfessorSortByQuality()),format.raw/*7.72*/("""">Quality</a></th>
     		<th><a href=""""),_display_(/*8.22*/routes/*8.28*/.Application.searchAllProfessorSortByDifficulty()),format.raw/*8.77*/("""">Difficulty</a></th>
		</tr>
		"""),_display_(/*10.4*/for(prof <- professors) yield /*10.27*/ {_display_(Seq[Any](format.raw/*10.29*/("""
 		"""),format.raw/*11.4*/("""<tr>
    		<th><a href=""""),_display_(/*12.21*/routes/*12.27*/.Application.viewProfessor(prof.name)),format.raw/*12.64*/("""">"""),_display_(/*12.67*/prof/*12.71*/.name),format.raw/*12.76*/("""</a></th>
    		<th>"""),_display_(/*13.12*/prof/*13.16*/.quality),format.raw/*13.24*/("""</th>
    		<th>"""),_display_(/*14.12*/prof/*14.16*/.difficulty),format.raw/*14.27*/("""</th>
 		</tr>
 		""")))}),format.raw/*16.5*/("""
 	"""),format.raw/*17.3*/("""</table>
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
                  DATE: Mon Dec 10 18:01:02 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/searchAllProf.scala.html
                  HASH: 100889a8ba95153ba6350e3b7615f1186134cddb
                  MATRIX: 985->1|1129->50|1157->53|1195->83|1234->85|1254->87|1293->89|1321->91|1381->125|1395->131|1458->174|1519->209|1533->215|1599->261|1665->301|1679->307|1748->356|1807->389|1846->412|1886->414|1917->418|1969->443|1984->449|2042->486|2072->489|2085->493|2111->498|2159->519|2172->523|2201->531|2245->548|2258->552|2290->563|2339->582|2369->585
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|42->10|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|48->16|49->17
                  -- GENERATED --
              */
          