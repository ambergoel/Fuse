package camelinaction;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopyWithCamel {

	public static void main(String[] args) {
		CamelContext context = new DefaultCamelContext();
		try {
			context.addRoutes(new RouteBuilder() {
				
				@Override
				public void configure() throws Exception {
					from("file:data/inbox?noop=true").to("file:data/outbox");
					
				}
			} );
			context.start();
			Thread.sleep(10000);
			context.stop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
