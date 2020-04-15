
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

object movieSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>
        <h1>Movie Search</h1>
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
                  DATE: 2020-04-14T18:37:57.917
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/search/movieSearch.scala.html
                  HASH: fd8c8bccbf573a8aec11b023207b3c421a0128aa
                  MATRIX: 921->1|1029->14|1057->16|1530->461|1559->462|1609->484|1671->518|1700->519|1748->539|1801->564|1830->565|1880->587|1990->670|2014->673|2265->896|2294->897|2342->917|2391->938|2420->939|2470->961|2543->1006|2572->1007|2620->1027|2670->1049|2699->1050|2749->1072|2888->1183|2917->1184|2965->1204|3015->1226|3044->1227|3094->1249|3245->1372|3274->1373|3322->1393|3374->1417|3403->1418|3453->1440|3672->1631|3701->1632|3749->1652|3822->1697|3851->1698|3901->1720|4016->1807|4045->1808|4093->1828|4153->1860|4182->1861|4232->1883|4316->1939|4345->1940|4393->1960|4454->1993|4483->1994|4533->2016|4604->2059|4633->2060|4687->2086|4861->2232|4890->2233|4919->2234|4952->2239|4981->2240|5035->2266|5146->2349|5175->2350|5221->2368|5250->2369|5298->2389|5426->2489|5455->2490|5505->2512|5614->2593|5643->2594|5732->2655|5761->2656|5811->2678|5858->2697|5887->2698|5941->2724|6099->2854|6128->2855|6174->2873|6203->2874|6275->2918|6304->2919|6354->2941|6573->3132|6602->3133|6656->3159|6719->3194|6748->3195|6800->3219|6906->3297|6935->3298|6989->3324|7060->3367|7089->3368|7176->3427|7205->3428|7242->3438
                  LINES: 27->1|32->1|33->2|48->17|48->17|49->18|50->19|50->19|52->21|52->21|52->21|53->22|54->23|54->23|59->28|59->28|61->30|61->30|61->30|62->31|63->32|63->32|65->34|65->34|65->34|66->35|68->37|68->37|70->39|70->39|70->39|71->40|73->42|73->42|75->44|75->44|75->44|76->45|79->48|79->48|81->50|81->50|81->50|82->51|83->52|83->52|85->54|85->54|85->54|86->55|87->56|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|93->62|93->62|93->62|93->62|93->62|94->63|95->64|95->64|96->65|96->65|98->67|100->69|100->69|101->70|103->72|103->72|106->75|106->75|107->76|107->76|107->76|108->77|111->80|111->80|112->81|112->81|114->83|114->83|115->84|118->87|118->87|119->88|120->89|120->89|122->91|124->93|124->93|125->94|126->95|126->95|129->98|129->98|130->99
                  -- GENERATED --
              */
          