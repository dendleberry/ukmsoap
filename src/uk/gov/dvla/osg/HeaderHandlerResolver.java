package uk.gov.dvla.osg;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
 
/**
 *
 * @author www.javadb.com
 */
public class HeaderHandlerResolver implements HandlerResolver {
	Properties props;
public HeaderHandlerResolver(Properties props) {
		this.props=props;
	}

@Override
public List<Handler> getHandlerChain(PortInfo portInfo) {
      List<Handler> handlerChain = new ArrayList<Handler>();
 
      HeaderHandler hh = new HeaderHandler(props);
 
      handlerChain.add(hh);
 
      return handlerChain;
   }
}