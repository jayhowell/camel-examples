// camel-k: dependency=mvn:org.json:json:20240303


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.json.JSONObject;

public class JSONObjectExampleUsingExchange extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("timer:java?period=1000")
        .process(exchange -> {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("dateTimeStamp", exchange.getProperty("dateTimeStamp", String.class));
            jsonObject.put("auditID", exchange.getProperty("auditID", String.class));
            jsonObject.put("TransacationStatus", exchange.getProperty("TransacationStatus", String.class));
            jsonObject.put("TransacationStage", exchange.getProperty("TransacationStage", String.class));
            jsonObject.put("PayloadType", exchange.getProperty("PayloadType", String.class));
            jsonObject.put("Payload", exchange.getProperty("Payload", String.class));
            exchange.getMessage().setBody(jsonObject.toString());
        })
        
        .removeHeaders("CamelHttp.*")
        .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
        .to("log:output"); // Replace with your desired endpoint
                
    }
}