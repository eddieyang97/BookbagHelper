
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

object comments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.CourseDB.CommentInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(comments: List[models.CourseDB.CommentInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""

"""),_display_(/*3.2*/main("All Filtered Comments")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/(""" """)))}/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
  """),format.raw/*4.3*/("""<p>
     """),_display_(/*5.7*/for(comment <- comments) yield /*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
        """),format.raw/*6.9*/("""<hr/>
        <ul>
          <li>Professor Name: """),_display_(/*8.32*/comment/*8.39*/.profName),format.raw/*8.48*/("""</li>
          <li>Second Professor Name: """),_display_(/*9.39*/comment/*9.46*/.secProfName),format.raw/*9.58*/("""</li>
          <li>Semester: """),_display_(/*10.26*/comment/*10.33*/.semester),format.raw/*10.42*/("""</li>
          <li>Course Name: """),_display_(/*11.29*/comment/*11.36*/.courseName),format.raw/*11.47*/("""</li>
          <li>Comment Content: """),_display_(/*12.33*/comment/*12.40*/.comment),format.raw/*12.48*/("""</li>
        </ul>
        <hr/>
     """)))}),format.raw/*15.7*/("""
  """),format.raw/*16.3*/("""</p>
""")))}))
      }
    }
  }

  def render(comments:List[models.CourseDB.CommentInfo]): play.twirl.api.HtmlFormat.Appendable = apply(comments)

  def f:((List[models.CourseDB.CommentInfo]) => play.twirl.api.HtmlFormat.Appendable) = (comments) => apply(comments)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 10 23:03:26 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/comments.scala.html
                  HASH: 046d0fb48ab022db421e8723c7b497e3aa645198
                  MATRIX: 978->1|1118->46|1146->49|1183->78|1222->80|1242->82|1281->84|1310->87|1345->97|1384->121|1423->123|1458->132|1534->182|1549->189|1578->198|1648->242|1663->249|1695->261|1753->292|1769->299|1799->308|1860->342|1876->349|1908->360|1973->398|1989->405|2018->413|2088->453|2118->456
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|47->15|48->16
                  -- GENERATED --
              */
          