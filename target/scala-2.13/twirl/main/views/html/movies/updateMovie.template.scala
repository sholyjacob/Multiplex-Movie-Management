
package views.html.movies

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
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import views.html.movies.common

object updateMovie extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[MovieModel],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(movieForm : Form[MovieModel])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.94*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/common("Edit Movie")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""<h4><a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.index()),format.raw/*6.48*/("""">Home</a></h4>
    """),_display_(/*7.6*/helper/*7.12*/.form(action = routes.MovieController.update())/*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""
        """),format.raw/*8.9*/("""<!--
            <form action="routes.ProductController.save()" method="POST">
            <label>Enter Product Id</label>
            <input type="number" name="id">
            -->
        <fieldset>
            <legend>Edit</legend>
            """),format.raw/*15.37*/("""
            """),_display_(/*16.14*/helper/*16.20*/.CSRF.formField),format.raw/*16.35*/("""
            """),format.raw/*19.15*/("""
            """),_display_(/*20.14*/helper/*20.20*/.inputText(movieForm("name"), Symbol("_label") -> "Movie Name")),format.raw/*20.83*/("""
            """),_display_(/*21.14*/helper/*21.20*/.inputText(movieForm("category"), Symbol("_label") -> "Enter Movie Category")),format.raw/*21.97*/("""
            """),_display_(/*22.14*/helper/*22.20*/.inputText(movieForm("director"), Symbol("_label") -> "Enter Director Name")),format.raw/*22.96*/("""
            """),_display_(/*23.14*/helper/*23.20*/.inputText(movieForm("producer"), Symbol("_label") -> "Enter Producer Name")),format.raw/*23.96*/("""
            """),_display_(/*24.14*/helper/*24.20*/.inputDate(movieForm("releaseDate"), Symbol("_label") -> "Enter release date")),format.raw/*24.98*/("""
            """),format.raw/*25.13*/("""<input type="submit" value="SAVE" />
        </fieldset>
    """)))}),format.raw/*27.6*/("""
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(movieForm:Form[MovieModel],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(movieForm)(request,messages)

  def f:((Form[MovieModel]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (movieForm) => (request,messages) => apply(movieForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-13T12:04:44.617
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/movies/updateMovie.scala.html
                  HASH: 4776779493913df345136439d97398a73f770e91
                  MATRIX: 618->1|1002->35|1167->130|1212->127|1240->147|1268->150|1296->170|1335->172|1367->178|1407->192|1421->198|1464->221|1511->243|1525->249|1580->296|1619->298|1655->308|1938->587|1980->602|1995->608|2031->623|2073->745|2115->760|2130->766|2214->829|2256->844|2271->850|2369->927|2411->942|2426->948|2523->1024|2565->1039|2580->1045|2677->1121|2719->1136|2734->1142|2833->1220|2875->1234|2969->1298|3002->1301
                  LINES: 23->1|28->2|31->3|34->2|35->4|36->5|36->5|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|46->15|47->16|47->16|47->16|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|56->27|57->28
                  -- GENERATED --
              */
          