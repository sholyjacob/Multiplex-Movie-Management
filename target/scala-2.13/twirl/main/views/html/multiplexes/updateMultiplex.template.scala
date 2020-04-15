
package views.html.multiplexes

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
/*2.2*/import views.html.multiplexes.common

object updateMultiplex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[MultiplexModel],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(multiplexForm : Form[MultiplexModel])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.102*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/common("Edit Multiplex")/*6.26*/ {_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<h4><a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.index()),format.raw/*7.48*/("""">Home</a></h4>
    """),_display_(/*8.6*/helper/*8.12*/.form(action = routes.MultiplexController.update())/*8.63*/ {_display_(Seq[Any](format.raw/*8.65*/("""
        """),format.raw/*9.9*/("""<!--
            <form action="routes.ProductController.save()" method="POST">
            <label>Enter Product Id</label>
            <input type="number" name="id">
            -->
        <fieldset>
            <legend>Multiplex</legend>
            """),format.raw/*16.37*/("""
            """),_display_(/*17.14*/helper/*17.20*/.CSRF.formField),format.raw/*17.35*/("""
            """),format.raw/*20.15*/("""
            """),_display_(/*21.14*/helper/*21.20*/.inputText(multiplexForm("name"), Symbol("_label") -> "Enter Multiplex Name")),format.raw/*21.97*/("""
            """),_display_(/*22.14*/helper/*22.20*/.inputText(multiplexForm("address"), Symbol("_label") -> "Enter Multiplex Address")),format.raw/*22.103*/("""
            """),_display_(/*23.14*/helper/*23.20*/.inputText(multiplexForm("noOfScreens"), Symbol("_label") -> "EnterNumber of Screens")),format.raw/*23.106*/("""

            """),format.raw/*25.13*/("""<input type="submit" value="SAVE" />
        </fieldset>
    """)))}),format.raw/*27.6*/("""
""")))}),format.raw/*28.2*/("""

"""))
      }
    }
  }

  def render(multiplexForm:Form[MultiplexModel],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(multiplexForm)(request,messages)

  def f:((Form[MultiplexModel]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (multiplexForm) => (request,messages) => apply(multiplexForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-13T12:04:44.653
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/multiplexes/updateMultiplex.scala.html
                  HASH: d3d65aa18420cabd1a4910548e8840c552a29f92
                  MATRIX: 623->3|1020->42|1193->145|1239->142|1267->162|1295->165|1327->189|1366->191|1398->197|1438->211|1452->217|1495->240|1542->262|1556->268|1615->319|1654->321|1690->331|1978->615|2020->630|2035->636|2071->651|2113->773|2155->788|2170->794|2268->871|2310->886|2325->892|2430->975|2472->990|2487->996|2595->1082|2639->1098|2733->1162|2766->1165
                  LINES: 23->2|28->3|31->4|34->3|35->5|36->6|36->6|36->6|37->7|37->7|37->7|37->7|38->8|38->8|38->8|38->8|39->9|46->16|47->17|47->17|47->17|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|53->25|55->27|56->28
                  -- GENERATED --
              */
          