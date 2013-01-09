package com.skumar.struts1.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class LanguageSelectAction extends DispatchAction{
	
	public ActionForward chinese(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		
		request.getSession().setAttribute(
				Globals.LOCALE_KEY, Locale.SIMPLIFIED_CHINESE);
		
		//return mapping.getInputForward();
		//String previousPage = (String)request.getSession().getAttribute(KeyConstants.PREVIOUS_PAGE);  
		//return new ActionForward(previousPage, true);
		ActionForward actionForward = mapping.findForward("success");
		ActionForward newActionForward = new ActionForward(actionForward); // ...to create a new one...
		newActionForward.setPath((String) request.getSession().getAttribute("USER_LAST_ACTION"));
		
		String str = (String) request.getSession().getAttribute("USER_LAST_ACTION");
		System.out.println(">>>>>>>>>>>>>" + str);
		return newActionForward;
	}
	
	public ActionForward english(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		
		request.getSession().setAttribute(
				Globals.LOCALE_KEY, Locale.ENGLISH);
		
		return mapping.findForward("success");
	}
	
	public ActionForward german(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		
		request.getSession().setAttribute(
				Globals.LOCALE_KEY, Locale.GERMAN);
		
		return mapping.findForward("success");
	}
	
	public ActionForward france(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		
		request.getSession().setAttribute(
				Globals.LOCALE_KEY, Locale.FRANCE);
		
		return mapping.findForward("success");
	}
	
	
	public ActionForward submit(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		
		request.getSession().setAttribute("USER_LAST_ACTION", request.getServletPath() + "?" + request.getQueryString());
		String str = request.getServletPath() + "?" + request.getQueryString();
		System.out.println(str);
		return mapping.findForward("success");
	}
	
	
}