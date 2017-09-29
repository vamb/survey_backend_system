<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value="/page/media/jquery-ui-1.11.4.custom/jquery-ui.min.css"/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/page/media/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/page/media/css/bootstrap-responsive.min.css"/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/page/media/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/page/media/css/style-metro.css"/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/page/media/css/style.css"/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/page/media/css/style-responsive.css"/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/page/media/css/light.css"/>" rel="stylesheet" type="text/css" id="style_color"/>
<link href="<c:url value="/page/media/css/uniform.default.css"/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/page/media/css/jquery.nestable.css"/>" rel="stylesheet" type="text/css"/>
<script src="${rc.contextPath}/page/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/page/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/page/media/jquery-ui-1.11.4.custom/jquery-ui.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/page/media/jquery-ui-1.11.4.custom/jquery-ui-datepicker.zh-cn.js" type="text/javascript"></script>
<script src="${rc.contextPath}/page/media/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/page/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/page/media/js/jquery.blockui.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/page/media/js/jquery.cookie.min.js" type="text/javascript"></script>
<script src="${rc.contextPath}/page/media/js/jquery.uniform.min.js" type="text/javascript" ></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<title>listArticles</title>
	</head>
	<meta name="menu" content="listSurveys"/>
	 
	<body>
		<div style="width:1330px;font-family:'Microsoft YaHei';"> 
			<div style="width:716px; margin:0 auto;height:800px;
				background-image:url(${rc.contextPath}/pages/media/image/bg_pic/wine_cup.jpg);">
			
				<div style="margin:0 auto;text-align:center;float:left;width:716px;">
					<h3 class="page-title" style="height:50px;padding-left:10px;font-size:1.5rem;">
						Survey List Page
					</h3>
				</div>
				
				<div style="margin:0 auto;font-size:1rem;color:black;float:left;">
					<c:forEach var="sury" items="${list}" varStatus="index">   
						<div style="width:100%;margin-top:10px;padding-left:20px;"> 
							<div style="width:100%;cursor:pointer;">
								<span onclick="surveyChooseAction(this)" attrId="${sury.id }" style="text-decoration: underline;">
									Choose this survey:《 ${sury.suryName } 》
								</span>
								<br/>
							</div>
						</div>
					</c:forEach>
				</div>
				
				<form id="hiddenForm" action="" >
					<input type="hidden" id="hiddenId" name="id" value="" />
				</form>
			
			</div>
		</div>
	</body>
		<script type="text/javascript">
					
					function surveyChooseAction(obj){
						$("#hiddenId").val($(obj).attr("attrId"));
						$("#hiddenForm").attr("action","${rc.contextPath}/surveyShow/SurveyDetailPage");
						$("#hiddenForm").submit();
					}
					
				</script>
</html>
