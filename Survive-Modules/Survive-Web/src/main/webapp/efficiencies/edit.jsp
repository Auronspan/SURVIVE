<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<s:layout-render name="/layout.jsp" titlekey="monster.edit.title">
    <s:layout-component name="body">
        <s:useActionBean beanclass="com.muni.fi.pa165.actions.monster.MonsterWeaponActionBean" var="actionBean"/>

        <s:form beanclass="com.muni.fi.pa165.actions.monster.MonsterWeaponActionBean" class="form-horizontal">
            <s:hidden name="monster.id"/>
            <fieldset><legend><f:message key="monster.edit.edit"/></legend>
                <%@include file="form.jsp"%>
               <div><s:submit class="btn btn-info" name="save"><f:message key="forms.save"/></s:submit> </div>              
                </fieldset>
        </s:form>
        
     


    </s:layout-component>
</s:layout-render>