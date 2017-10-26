package camelinaction;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class DownloadLogger implements Processor {
	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("We have downloaded a file." + exchange.getIn().getHeader("camelFileName"));
	}

}
