<%@ taglib uri="/struts-tags" prefix="s"%>
<h2 style="background-color: pink; text-align: center;">
	<s:url namespace="/" action="carburant" var="lien1"></s:url>
	<s:a href="%{lien1}" class="btn btn-primary">Carburants</s:a>
</h2>
<hr />