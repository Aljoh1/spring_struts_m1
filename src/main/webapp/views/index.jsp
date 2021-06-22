<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page d'accueil</title>
<!-- Font Awesome Icons -->
<link rel="stylesheet" href="<s:url value='/style/adminlte.min.css'/>"
	rel="stylesheet" />
<link rel="stylesheet" href="<s:url value='/style/all.min.css'/>"
	rel="stylesheet" />
</head>
<body>
<%@ include file="/layout/header.jsp" %>
	<s:url namespace="/" action="carburant" var="lien1"></s:url>
	<s:a href="%{lien1}" class="btn btn-primary">Carburants</s:a>
</body>
</html>