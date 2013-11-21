/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muni.fi.pa165.base;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import org.apache.taglibs.standard.functions.Functions;

/**
 *
 * @author Auron
 */
    public abstract class BaseActionBean implements ActionBean {
    private ActionBeanContext context = null;

    @Override
    public void setContext(ActionBeanContext context) {
        this.context = context;
        preBind();
    }

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    public static String escapeHTML(String s) {
        return Functions.escapeXml(s);
    }
    
    protected void preBind()
	{
	}
}
