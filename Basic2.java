

import org.apache.camel.builder.RouteBuilder;


public class Basic2 extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("seda:log2SPlunk_shared")
        .to("log:output"); // Replace with your desired endpoint
                
    }
}