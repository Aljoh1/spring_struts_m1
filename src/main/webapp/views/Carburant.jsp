<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carburant</title>
</head>
<body>
	<%@ include file="/layout/header.jsp"%>
	<div>
		<s:form action="save" method="post">
			<s:textfield label="REF" name="carburant.reference"></s:textfield>
			<s:textfield label="Type de Carburant" name="carburant.typeCarburant"></s:textfield>
			<s:textfield label="Prix" name="carburant.prixUnitaire"></s:textfield>
			<s:textfield label="Quantite" name="carburant.quantite"></s:textfield>
			<s:hidden name="editMode"></s:hidden>
			<s:submit value="save"></s:submit>
		</s:form>
	</div>
	<div>
		<table>
			<tr>
				<th>REF</th>
				<th>Type de Carburant</th>
				<th>Prix</th>
				<th>Quantite</th>
			</tr>
			<s:iterator value="carburants">
				<tr>
					<td><s:property value="reference" /></td>
					<td><s:property value="typeCarburant" /></td>
					<td><s:property value="prixUnitaire" /></td>
					<td><s:property value="quantite" /></td>
					<s:url namespace="/" action="delete" var="lien2">
						<s:param name="ref">
							<s:property value="reference" />
						</s:param>
					</s:url>
					<s:url namespace="/" action="edit" var="lien3">
						<s:param name="ref">
							<s:property value="reference" />
						</s:param>
					</s:url>
					<td><s:a href="%{lien2}" class="btn btn-danger">Supprimer</s:a></td>
					<td><s:a href="%{lien3}" class="btn btn-info">Modifier</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
</body>
</html>