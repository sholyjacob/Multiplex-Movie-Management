
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
/*1.6*/import views.html.movies.common

object createMultiplex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[MultiplexModel],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.6*/(multiplexForm : Form[MultiplexModel])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.6*/import helper._


Seq[Any](format.raw/*2.106*/("""
    """),format.raw/*4.1*/("""
        """),_display_(/*5.10*/common("Add Multiplex")/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""
            """),format.raw/*6.13*/("""<h4><a href=""""),_display_(/*6.27*/routes/*6.33*/.HomeController.index()),format.raw/*6.56*/("""">Home</a></h4>
            """),_display_(/*7.14*/helper/*7.20*/.form(action = routes.MultiplexController.save())/*7.69*/ {_display_(Seq[Any](format.raw/*7.71*/("""
                """),format.raw/*8.17*/("""<!--
            <form action="routes.ProductController.save()" method="POST">
            <label>Enter Product Id</label>
            <input type="number" name="id">
            -->
                <fieldset>
                    <legend>Multiplex</legend>
                    """),format.raw/*15.45*/("""
                    """),_display_(/*16.22*/helper/*16.28*/.CSRF.formField),format.raw/*16.43*/("""
                    """),format.raw/*19.23*/("""
                    """),_display_(/*20.22*/helper/*20.28*/.inputText(multiplexForm("name"), Symbol("_label") -> "Enter Multiplex Name", Symbol("placeholder") -> "Enter  name")),format.raw/*20.145*/("""
                    """),_display_(/*21.22*/helper/*21.28*/.inputText(multiplexForm("address"), Symbol("_label") -> "Enter Multiplex Address", Symbol("placeholder") -> "Enter address")),format.raw/*21.153*/("""
                    """),_display_(/*22.22*/helper/*22.28*/.inputText(multiplexForm("noOfScreens"), Symbol("_label") -> "EnterNumber of Screens", Symbol("placeholder") -> "Enter screens")),format.raw/*22.156*/("""

                    """),format.raw/*24.21*/("""<input type="submit" value="SAVE" />
                </fieldset>

            """)))}),format.raw/*27.14*/("""
        """)))}))
      }
    }
  }

  def render(multiplexForm:Form[MultiplexModel],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(multiplexForm)(request,messages)

  def f:((Form[MultiplexModel]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (multiplexForm) => (request,messages) => apply(multiplexForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-13T10:52:37.461
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/multiplexes/createMultiplex.scala.html
                  HASH: e53ab1327bb1fefdef0cd7a38cf49b5d8f9750f5
                  MATRIX: 623->5|1015->43|1188->150|1234->143|1266->167|1303->178|1334->201|1373->203|1414->217|1454->231|1468->237|1511->260|1567->290|1581->296|1638->345|1677->347|1722->365|2034->673|2084->696|2099->702|2135->717|2185->863|2235->886|2250->892|2389->1009|2439->1032|2454->1038|2601->1163|2651->1186|2666->1192|2816->1320|2868->1344|2981->1426
                  LINES: 23->1|28->2|31->3|34->2|35->4|36->5|36->5|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|46->15|47->16|47->16|47->16|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|53->24|56->27
                  -- GENERATED --
              */
          