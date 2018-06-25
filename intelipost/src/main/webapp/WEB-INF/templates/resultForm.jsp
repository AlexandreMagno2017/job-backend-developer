<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Usuarios cadastrados</h2>

	<c:if test="${not empty users}">

		<ul>
			<c:forEach var="u" items="${users}">
				<li>${u.user}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>