<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<s:layout-render name="/layout.jsp" titlekey="monster.edit.title">
    <s:layout-component name="body">
        <s:useActionBean beanclass="com.muni.fi.pa165.monster.MonsterActionBean" var="actionBean"/>


        <div>
            <s:form beanclass="com.muni.fi.pa165.monster.MonsterActionBean" class="form-horizontal">
                 <s:hidden name="monster.id"/>
                <fieldset><legend><f:message key="monster.edit.edit"/></legend>
                    <%@include file="form.jsp"%>
            </s:form>
            <s:form beanclass="com.muni.fi.pa165.monster.MonsterActionBean" class="form-horizontal" action="save"> 
                <s:hidden name="monster.id"/>
                    <s:submit  class="btn btn-info" name="save" ><f:message key="monster.edit.save"/></s:submit> 
                    </fieldset>
            </s:form>
            <s:form beanclass="com.muni.fi.pa165.monster.MonsterActionBean" class="form-horizontal" action="cancel">
                <s:submit class="btn btn-warning" name="cancel" ><f:message key="monster.edit.cancel" /></s:submit>  
            </s:form>

        </div>


    </s:layout-component>
</s:layout-render>