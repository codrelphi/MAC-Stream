<c:choose>
<c:when test="${empty sessionScope.USER_CONNECTED_SESSION}">
	<%@ include file="/WEB-INF/vues/components/menuGuest.jsp" %>
</c:when>
<c:otherwise>
	<%@ include file="/WEB-INF/vues/components/menuUser.jsp" %>
</c:otherwise>
</c:choose>

