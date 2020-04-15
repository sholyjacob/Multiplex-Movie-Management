
package views.html.search

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

object multiplexSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>
        <h1>Multiplex Search</h1>
        <div id="messageContent"></div>

        <form>
            <textarea id="messageInput"></textarea>
            <button id="sendButton" >Send</button>
        </form>
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script>
                let webSocket;
                let messageInput;

                function init() """),format.raw/*17.33*/("""{"""),format.raw/*17.34*/("""
                    """),format.raw/*18.21*/("""initWebSocket();
                """),format.raw/*19.17*/("""}"""),format.raw/*19.18*/("""

                """),format.raw/*21.17*/("""function initWebSocket() """),format.raw/*21.42*/("""{"""),format.raw/*21.43*/("""
                    """),format.raw/*22.21*/("""console.log("actor initiated: ");
                    webSocket = new WebSocket(""""),_display_(/*23.49*/url),format.raw/*23.52*/("""");
                    webSocket.onopen = onOpen;
                    webSocket.onclose = onClose;
                    webSocket.onmessage = onMessage;
                    webSocket.onerror = onError;
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/("""

                """),format.raw/*30.17*/("""function onOpen(evt) """),format.raw/*30.38*/("""{"""),format.raw/*30.39*/("""
                    """),format.raw/*31.21*/("""writeToScreen("CONNECTED");
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/("""

                """),format.raw/*34.17*/("""function onClose(evt) """),format.raw/*34.39*/("""{"""),format.raw/*34.40*/("""
                    """),format.raw/*35.21*/("""writeToScreen("DISCONNECTED");
                    appendMessageToView(":", "DISCONNECTED");
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/("""

                """),format.raw/*39.17*/("""function onError(evt) """),format.raw/*39.39*/("""{"""),format.raw/*39.40*/("""
                    """),format.raw/*40.21*/("""writeToScreen("ERROR: " + evt.data);
                    writeToScreen("ERROR: " + JSON.stringify(evt));
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""

                """),format.raw/*44.17*/("""function onMessage(evt) """),format.raw/*44.41*/("""{"""),format.raw/*44.42*/("""
                    """),format.raw/*45.21*/("""var receivedData = JSON.parse(evt.data);
                    console.log("New Data: ", receivedData);
                    appendMessageToView("Server", receivedData.body);
                """),format.raw/*48.17*/("""}"""),format.raw/*48.18*/("""

                """),format.raw/*50.17*/("""function appendMessageToView(title, message) """),format.raw/*50.62*/("""{"""),format.raw/*50.63*/("""
                    """),format.raw/*51.21*/("""$("#messageContent").append("<p>" + title + ": " + message + "</p>");
                """),format.raw/*52.17*/("""}"""),format.raw/*52.18*/("""

                """),format.raw/*54.17*/("""function writeToScreen(message) """),format.raw/*54.49*/("""{"""),format.raw/*54.50*/("""
                    """),format.raw/*55.21*/("""console.log("New message: ", message);
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/("""

                """),format.raw/*58.17*/("""function doSend(protocolMessage) """),format.raw/*58.50*/("""{"""),format.raw/*58.51*/("""
                    """),format.raw/*59.21*/("""if(webSocket.readyState == WebSocket.OPEN) """),format.raw/*59.64*/("""{"""),format.raw/*59.65*/("""
                        """),format.raw/*60.25*/("""writeToScreen("SENT: " + protocolMessage.message);
                        webSocket.send(JSON.stringify(protocolMessage));
                    """),format.raw/*62.21*/("""}"""),format.raw/*62.22*/(""" """),format.raw/*62.23*/("""else """),format.raw/*62.28*/("""{"""),format.raw/*62.29*/("""
                        """),format.raw/*63.25*/("""writeToScreen("Could not send data. Websocket is not open.");
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/("""
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""

                """),format.raw/*67.17*/("""window.addEventListener("load", init, false);

                $("#sendButton").click(function () """),format.raw/*69.52*/("""{"""),format.raw/*69.53*/("""
                    """),format.raw/*70.21*/("""console.log("Submitting1.");
                    newMessage();
                """),format.raw/*72.17*/("""}"""),format.raw/*72.18*/(""");


                $(window).on("keydown", function (e) """),format.raw/*75.54*/("""{"""),format.raw/*75.55*/("""
                    """),format.raw/*76.21*/("""if (e.which == 13) """),format.raw/*76.40*/("""{"""),format.raw/*76.41*/("""
                        """),format.raw/*77.25*/("""console.log("Enter pressed.");
                        newMessage();
                        return false;
                    """),format.raw/*80.21*/("""}"""),format.raw/*80.22*/("""
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/(""");

                function newMessage() """),format.raw/*83.39*/("""{"""),format.raw/*83.40*/("""
                    """),format.raw/*84.21*/("""console.log("new message")
                    messageInput = $("#messageInput").val();
                    $("#messageInput").val("");
                    if ($.trim(messageInput) == "") """),format.raw/*87.53*/("""{"""),format.raw/*87.54*/("""
                        """),format.raw/*88.25*/("""return false;
                    """),format.raw/*89.21*/("""}"""),format.raw/*89.22*/("""

                    """),format.raw/*91.21*/("""appendMessageToView("Me", messageInput);

                    var message = """),format.raw/*93.35*/("""{"""),format.raw/*93.36*/("""
                        """),format.raw/*94.25*/("""message: messageInput
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/(""";

                    doSend(message);
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""
        """),format.raw/*99.9*/("""</script>

    </body>
</html>"""))
      }
    }
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T10:48:05.958
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/search/multiplexSearch.scala.html
                  HASH: 51d549c13271b3250caf211edf9da94ab9b92ab8
                  MATRIX: 925->1|1033->14|1061->16|1538->465|1567->466|1617->488|1679->522|1708->523|1756->543|1809->568|1838->569|1888->591|1998->674|2022->677|2273->900|2302->901|2350->921|2399->942|2428->943|2478->965|2551->1010|2580->1011|2628->1031|2678->1053|2707->1054|2757->1076|2896->1187|2925->1188|2973->1208|3023->1230|3052->1231|3102->1253|3253->1376|3282->1377|3330->1397|3382->1421|3411->1422|3461->1444|3680->1635|3709->1636|3757->1656|3830->1701|3859->1702|3909->1724|4024->1811|4053->1812|4101->1832|4161->1864|4190->1865|4240->1887|4324->1943|4353->1944|4401->1964|4462->1997|4491->1998|4541->2020|4612->2063|4641->2064|4695->2090|4869->2236|4898->2237|4927->2238|4960->2243|4989->2244|5043->2270|5154->2353|5183->2354|5229->2372|5258->2373|5306->2393|5434->2493|5463->2494|5513->2516|5622->2597|5651->2598|5740->2659|5769->2660|5819->2682|5866->2701|5895->2702|5949->2728|6107->2858|6136->2859|6182->2877|6211->2878|6283->2922|6312->2923|6362->2945|6581->3136|6610->3137|6664->3163|6727->3198|6756->3199|6808->3223|6914->3301|6943->3302|6997->3328|7068->3371|7097->3372|7184->3431|7213->3432|7250->3442
                  LINES: 27->1|32->1|33->2|48->17|48->17|49->18|50->19|50->19|52->21|52->21|52->21|53->22|54->23|54->23|59->28|59->28|61->30|61->30|61->30|62->31|63->32|63->32|65->34|65->34|65->34|66->35|68->37|68->37|70->39|70->39|70->39|71->40|73->42|73->42|75->44|75->44|75->44|76->45|79->48|79->48|81->50|81->50|81->50|82->51|83->52|83->52|85->54|85->54|85->54|86->55|87->56|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|93->62|93->62|93->62|93->62|93->62|94->63|95->64|95->64|96->65|96->65|98->67|100->69|100->69|101->70|103->72|103->72|106->75|106->75|107->76|107->76|107->76|108->77|111->80|111->80|112->81|112->81|114->83|114->83|115->84|118->87|118->87|119->88|120->89|120->89|122->91|124->93|124->93|125->94|126->95|126->95|129->98|129->98|130->99
                  -- GENERATED --
              */
          