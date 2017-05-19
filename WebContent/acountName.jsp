<%@page import="model.bean.LanguageScore"%>
<%@page import="model.bean.Department"%>
<%@page import="model.bean.Status"%>
<%@page import="model.bean.Account"%>
<%@page import="model.bean.Language"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>Language Score</title>
<link
	href="http://cdn.datatables.net/plug-ins/a5734b29083/integration/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet">
<link
	href="http://cdn.datatables.net/responsive/1.0.1/css/dataTables.responsive.css"
	rel="stylesheet">
<script src="js/jquery-1.12.3.js"></script>
<script
	src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script
	src="http://cdn.datatables.net/responsive/1.0.1/js/dataTables.responsive.min.js"></script>
<script
	src="http://cdn.datatables.net/plug-ins/a5734b29083/integration/bootstrap/3/dataTables.bootstrap.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="fonts/glyphicons-halflings-regular.eot" />
<link rel="stylesheet" href="fonts/glyphicons-halflings-regular" />
<link rel="stylesheet" href="fonts/glyphicons-halflings-regular.woff" />
<script src="sweetalert-master/dist/sweetalert.min.js"></script>
<link rel="stylesheet" href="sweetalert-master/dist/sweetalert.css" />
<!-- //tables -->
</head>
<script language="javascript" type="text/javascript">
	function SetFocus(InputID) {
		document.getElementById(InputID).focus();
	}
</script>
<body style="background-color: #eac19e" onload="SetFocus('Box2')"
	styleId="Box2">

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<ul class="nav navbar-nav">
				<li><a href="#">MY PROFILE</a></li>
				<li><a href="#">ACOUNT COURSE</a></li>
				<li><a href="#">ACCOUNT</a></li>
				<li><a href="#">COURSE</a></li>
				<li><a href="#">ACOUNT CERTIFICATE</a></li>
				<li class="active"><a href="#">LANGUAGE SCORE</a></li>
				<li><a href="#">REPORT</a></li>
				<li><a href="#">SERCURITY</a></li>


			</ul>
			<ul class="nav navbar-nav" style="float: right;">
				<li><a href="#">Trần Nhật Linh</a></li>
			</ul>
		</div>

	</nav>
	<!-- thông báo kết quả tìm kiếm -->

	<div class="col-md-7 col-md-offset-3">
	<button type="button" class="btn btn-info">
		<a class="close" href="danh-sach.do">Back</a>
	</button>
	<img alt="" src="img/anh.PNG">
	</div>

</body>
</html>

