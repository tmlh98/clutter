package xyz.tmlh.webscoket.suport;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//@WebListener
public class RequestListener implements  ServletRequestListener {
	

	@Override
	public void requestInitialized(ServletRequestEvent requestEvent) {
		HttpSession session=((HttpServletRequest) requestEvent.getServletRequest()).getSession();
		System.out.println("SESSION_ID:          " + session.getId());
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		
	}

}