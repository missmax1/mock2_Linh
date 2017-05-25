<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.Autcarmm"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>メーカー車種組合せマスター登録</title>

<link rel="stylesheet" href="css/stylemock2.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>

	<html:form action="/register" styleClass="form-group" method="post">

		<div class="container-fluid">
			<nav class="bodi navbar navbar-default">
				<div class="menu form-inline">
					<div class="col-md-4">AUTA382</div>
					<div class="col-md-4" style="text-align: center;">
						メーカー車種組合せマスター登録
					</div>
					<div class="col-md-4" style="text-align: right;">
						<span id="today">YYYY年MM月DD日</span>
					</div>
				</div>

				<div class="errormessagee" style="color: red; padding: 10px">
					<p style="color: red" id="p1">
						<html:errors property="numberError" />
					</p>
					<p style="color: red" id="p2">
						<html:errors property="cARMM_MKCDError" />
					</p>
					<p style="color: red" id="p3">
						<html:errors property="maxcARMM_JRCNTError" />
					</p>
					<p style="color: red" id="p4">
						<html:errors property="characterError" />
					</p>
					<p style="color: red" id="p5">
						<html:errors property="existDBError" />
					</p>
					<p style="color: red" id="p6">
						<html:errors property="accError" />
					</p>
				</div>


				<table class="table-striped table-bordered">
					<thead class="header">
						<tr>
							<th rowspan="3" width="4%"></th>
							<th colspan="3" style="width: 50px; text-align: center;"
								for="cb01">メーカー<span style="color: red">(*)</span></th>
							<th colspan="4" style="width: 50px; text-align: center;"
								for="cb02">車種<span style="color: red">(*)</span></th>
							<th colspan="2" style="width: 50px; text-align: center;">ＪＲ件数</th>
							<th colspan="1" style="width: 6%; text-align: center;">Ｊ１件数</th>
							<th colspan="4" style="width: 50px; text-align: center;">台紙ラベル単位</th>
							<th colspan="4" style="width: 50px; text-align: center;">発注可能期間</th>
							<th colspan="4" style="width: 50px; text-align: center;">処理対象フラッグ</th>
							<th colspan="2"
								style="width: 10%; text-align: center; border-left-style: hidden;"></th>
						</tr>
						<tr>
							<th colspan="23" style="width: 50px; text-align: center;">担当者</th>
						</tr>
						<tr>
							<th colspan="5" style="width: 50px; text-align: center;">計画(主(<span
								style="color: red">(*)</span></th>
							<th colspan="1" style="width: 100px; text-align: center;">計画(従)</th>
							<th colspan="1" style="width: 100px; text-align: center;">主製造技術</th>
							<th colspan="3" style="width: 50px; text-align: center;">副製造技術</th>
							<th colspan="3" style="width: 50px; text-align: center;">主技術ｻｰﾋﾞｽ</th>
							<th colspan="3" style="width: 50px; text-align: center;">副技術ｻｰﾋﾞｽ</th>
							<th colspan="1" style="width: 50px; text-align: center;">主営業</th>
							<th colspan="2" style="width: 50px; text-align: center;">副営業</th>
							<th colspan="1" style="width: 50px; text-align: center;">主業務</th>
							<th colspan="2" style="width: 50px; text-align: center;">副業務</th>
							<th colspan="1"></th>
						</tr>
					</thead>
					
					<tr>
						<td colspan="24" height="30px"></td>
					</tr>
					
					<tbody class="tbodytable">

						<logic:iterate name="autcarmmForm" property="stt" id="st">
							<bean:define id="idSTT" name="st"></bean:define>

							<tr id="${idSTT}">
							<tr>
								<td rowspan="3" style="width: 50px; text-align: center;"><bean:write
										name="st" /></td>
								<td colspan="4"><html:select
										property="arrcARMM_MKCD[${idSTT}]" styleClass="form-control"
										styleId="cb01">
										<option value="0">Please select..</option>
										<html:optionsCollection name="autcarmmForm"
											property="listAUTMFOPM" label="mFOPM_NAME" value="mFOPM_TRCD" />
									</html:select></td>
								<td colspan="3"><html:select
										property="arrcARMM_SYCD[${idSTT}]" styleClass="form-control"
										styleId="cb02">

										<option value="0">Please select..</option>
										<html:optionsCollection name="autcarmmForm"
											property="listAUTCARNM" label="cARNM_NAME"
											value="cARNM_SHSYCD" />
									</html:select></td>
								<td colspan="2"><html:text
										property="arrcARMM_JRCNT[${idSTT}]" styleId="Box1"
										styleClass="form-control"></html:text></td>
								<td colspan="2"><html:text
										property="arrcARMM_J1CNT[${idSTT}]" styleId="Box1"
										styleClass="form-control"></html:text></td>
								<td colspan="3"><html:text
										property="arrcARMM_LBLCT[${idSTT}]" styleId="Box1"
										styleClass="form-control"></html:text></td>
								<td colspan="4"><html:text
										property="arrcARMM_HTKN[${idSTT}]" styleId="Box1"
										styleClass="form-control"></html:text></td>
								<td colspan="3"><html:text
										property="arrcARMM_YOBI[${idSTT}]" styleId="Box5"
										styleClass="form-control"></html:text></td>
								<td colspan="2" style="border-bottom-style: hidden;"></td>
							</tr>

							<tr>
								<td colspan="1"><html:text
										property="arrcARMM_EMPNO1[${idSTT}]" styleId="Box6${idSTT}"
										styleClass="form-control"></html:text></td>
								<td colspan="1"><input id="checkId_Name${idSTT}"
									type="button" value="参照" class="btn btn-danger"
									data-toggle="modal" data-target="#choose-empMaster${idSTT}"></td>

								<td colspan="3"><html:text
										property="arreMPFL_EMPNM[${idSTT}]" styleId="Box7${idSTT}"
										styleClass="form-control"></html:text></td>
								<td colspan="1"><html:text
										property="arrcARMM_EMPNO2[${idSTT}]" styleId="cARMM_EMPNO2"
										styleClass="form-control"></html:text></td>
								<td colspan="1"><html:text
										property="arrcARMM_EMPNO3[${idSTT}]" styleId="cARMM_EMPNO3"
										styleClass="form-control"></html:text></td>
								<td colspan="3"><html:text
										property="arrcARMM_EMPNO4[${idSTT}]" styleId="cARMM_EMPNO4"
										styleClass="form-control"></html:text></td>
								<td colspan="3"><html:text
										property="arrcARMM_EMPNO5[${idSTT}]" styleId="cARMM_EMPNO5"
										styleClass="form-control"></html:text></td>
								<td colspan="3"><html:text
										property="arrcARMM_EMPNO6[${idSTT}]" styleId="cARMM_EMPNO6"
										styleClass="form-control"></html:text></td>
								<td colspan="1"><html:text
										property="arrcARMM_EMPNO7[${idSTT}]" styleId="cARMM_EMPNO7"
										styleClass="form-control"></html:text></td>


								<td colspan="2"><html:text
										property="arrcARMM_EMPNO8[${idSTT}]" styleId="cARMM_EMPNO8"
										styleClass="form-control"></html:text></td>
								<td colspan="1"><html:text
										property="arrcARMM_EMPNO9[${idSTT}]" styleId="cARMM_EMPNO9"
										styleClass="form-control"></html:text></td>
								<td colspan="2"><html:text
										property="arrcARMM_EMPNO10[${idSTT}]" styleId="cARMM_EMPNO10"
										styleClass="form-control"></html:text></td>
								<td colspan="1"></td>
							</tr>

							</tr>
							<tr>
								<td colspan="24" height="10px"></td>
							</tr>

							<div id="choose-empMaster${idSTT}" class="modal fade"
								role="dialog">
								<div class="modal-dialog modal-sm" role="document">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												&times;</span>
											</button>
											<h4 class="modal-title">プラン（メイン）を選択</h4>
										</div>
										<div class="modal-body">
											<div class="form-group">
												<label for="chooseEmpMaster">計画(主)コード</label>
												<html:select property="arrcARMM_EMPNO1[${idSTT}]"
													styleClass="form-control" styleId="ma_xe${idSTT}">
													<option value=""></option>
													<html:optionsCollection name="autcarmmForm"
														property="listAUTEMPFL" label="eMPFL_EMPNO"
														value="eMPFL_EMPNO" />


												</html:select>
												<label for="chooseEmpMaster">計画(主)名</label>
												<html:select property="arrcARMM_EMPNO1[${idSTT}]"
													styleClass="form-control" styleId="ten_xe${idSTT}">
													<option value=""></option>
													<html:optionsCollection name="autcarmmForm"
														property="listAUTEMPFL" label="eMPFL_EMPNM"
														value="eMPFL_EMPNO" />
												</html:select>

											</div>
										</div>
										<div class="modal-footer">
											<input type="button" class="btn btn-danger"
												data-dismiss="modal" aria-label="Close" value="選択">
										</div>
									</div>
								</div>
							</div>

							<script>
							    function displayVals1${idSTT}() {
							    
							  	  var singleValues${idSTT} = $( "#ma_xe${idSTT}").val();
							  		$( "input#Box6${idSTT}" ).val( singleValues${idSTT});					  		
							  		$( "#ten_xe${idSTT}" ).val( singleValues${idSTT});
							  		var maxe${idSTT} =  $( "#ten_xe${idSTT} :selected" ).text();
							  		$("input#Box7${idSTT}").val(maxe${idSTT});					  							  		
							  	}
							    
							  	function displayVals2${idSTT}() {	 	
							  	  var multipleValues${idSTT} = $( "#ten_xe${idSTT} :selected" ).text();
							  	  var tenxe${idSTT} = $( "#ten_xe${idSTT}").val();						  	 
							  	  $( "#ma_xe${idSTT}" ).val( tenxe${idSTT});  
							  	  $("input#Box7${idSTT}").val(multipleValues${idSTT});
							  	  $( "input#Box6${idSTT}" ).val( tenxe${idSTT});						  	 
							  	}
							  	
							  	function selectt${idSTT}(){ 						  		
							  		$( "select#ma_xe${idSTT}" ).change( displayVals1${idSTT} )
							  			displayVals1${idSTT}();		
							  		$( "select#ten_xe${idSTT}" ).change( displayVals2${idSTT} )
							  		displayVals2${idSTT}();						  	
							  	}
							    
							    $("#checkId_Name${idSTT}").click(function(){					    	
									 selectt${idSTT}();								 
								})
															
							</script>
						</logic:iterate>
					</tbody>
				</table>

				<div class="butt" style="float: right; padding-top: 10px">
					<html:submit styleClass="btn btn-primary" property="submit"
						value="登録(Ｎ)" />
					<input type="reset" class="btn btn-primary" id="reset"
						value="クリアー(C)" />
					<html:link styleClass="btn btn-primary" action="/danh-sach">キャンセル(K)</html:link>
				</div>

			</nav>
		</div>
	</html:form>


<script type="text/javascript">

		var today = new Date();
		var dd = today.getDate();
		var mm = today.getMonth() + 1;
		var yyyy = today.getFullYear();
		
		if (dd < 10) {
			dd = '0' + dd
		}
		if (mm < 10) {
			mm = '0' + mm
		}
		today = yyyy+ '年' + mm + '月' + dd + '日';
		document.getElementById("today").innerHTML = today;


		window.onload = function() {
			document.getElementById('cb01').focus();
			var x = document.getElementById('p1').innerHTML;
			var y = document.getElementById('p2').innerHTML;
			var z = document.getElementById('p3').innerHTML;
			var t = document.getElementById('p4').innerHTML;
			var r = document.getElementById('p5').innerHTML;
			var a = document.getElementById('p6').innerHTML;
			
			x = x.replace(/\s/g, "");
			y = y.replace(/\s/g, "");
			z = z.replace(/\s/g, "");
			t = t.replace(/\s/g, "");
			r = r.replace(/\s/g, "");
			a = a.replace(/\s/g, "");
			
			if (x != "") {
				document.getElementById('Box1').focus();
			} else if (y != "") {
				document.getElementById('Box6${idSTT}').focus();
			} else if (z != "") {
				document.getElementById('Box3').focus();
			} else if (t != "") {
				document.getElementById('Box4').focus();
			} else if (r != "") {
				document.getElementById('Box5').focus();
			} else if (a != "") {
				document.getElementById('Box6').focus();
			} 
		}



</script>

</body>
</html>
