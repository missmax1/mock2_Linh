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
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>メーカー車種組合せマスター登録</title>

	<link rel="stylesheet" href="css/stylemock2.css"/>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body >

<html:form action="/register" styleClass="form-group" method="post">


	<div id="choose-empMaster" class="modal fade" role="dialog" >
	  	<div class="modal-dialog modal-sm" role="document">
	    	<div class="modal-content">
	      		<div class="modal-header">
	      			<button type="button" class="close" data-dismiss="modal" aria-label="Close">&times;</span></button>
	      			<h4 class="modal-title">プラン（メイン）を選択</h4>
	      		</div>
	      		<div class="modal-body">
	      			<div class="form-group">
	      				<label for="chooseEmpMaster">計画(主)コード</label>	      				
	      				<html:select property="cARMM_EMPNO1" styleClass="form-control" styleId="ma_xe">
							
							<html:optionsCollection name="autcarmmForm"
								property="listAUTEMPFL" label="eMPFL_EMPNO"
								value="eMPFL_EMPNO" />
								
						
	      				</html:select>
						<label for="chooseEmpMaster">計画(主)名</label>
						<html:select property="cARMM_EMPNO1" styleClass="form-control" styleId="ten_xe">
						
	      					<html:optionsCollection name="autcarmmForm"
								property="listAUTEMPFL" label="eMPFL_EMPNM"
								value="eMPFL_EMPNO" />
	      				</html:select>
	      				
	      			</div>
	      		</div>
	      		<div class="modal-footer">
					<input type="button" class="btn btn-danger" data-dismiss="modal" aria-label="Close" value="選択">
	      		</div>
	    	</div>
	  	</div>
	</div>
	


	 <div class="container-fluid">
	 	 <nav class="bodi navbar navbar-default">
	 			 <div class="menu form-inline">
					 	<div class="col-md-4">
									AUTA382
							</div>	
						<div class="col-md-4" style="text-align: center;">
							メーカー車種組合せマスター登録
							</div>
						<div class="col-md-4" style="text-align: right;">
							YYYY年MM月DD日
							</div>			
			 	</div>

				 <div class="errormessagee" style="color:red;padding: 10px">
				 	<<< エラーメッセージ >>>
				 </div>
			 
			 		
					 <table class="table-striped table-bordered">
					 <thead class="header">
					  <tr>
					    <th rowspan="3" width="4%"></th>
					    <th colspan="3" style="width: 50px; text-align: center;" for="cb01">メーカー<span style="color:red">(*)</span></th>
					    <th colspan="4" style="width: 50px; text-align: center;" for="cb02">車種<span style="color:red">(*)</span></th>
					    <th colspan="2" style="width: 50px; text-align: center;">ＪＲ件数</th>
					    <th colspan="1" style="width: 6%; text-align: center;">Ｊ１件数</th>
					    <th colspan="4" style="width: 50px; text-align: center;">台紙ラベル単位</th>
					    <th colspan="4" style="width: 50px; text-align: center;">発注可能期間</th>
					    <th colspan="3" style="width: 50px; text-align: center;">発注可能期間</th>
					    <th colspan="2" style="width: 10%; text-align: center;">処理対象フラッグ</th>
					  </tr>
					  <tr>
					    <th colspan="23" style="width: 50px; text-align: center;">担当者</th>
					  </tr>
					  
					  <tr>
					    <th colspan="5" style="width: 50px; text-align: center;">計画(主(<span style="color:red">(*)</span></th>
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
			 			<td colspan="24"  height="30px"> </td>
			 		</tr>
			 		
						
					<tbody class="tbodytable">
					
					<logic:iterate name="autcarmmForm" property="stt" id="st">	
					<bean:define id="idSTT" name="st" ></bean:define>	
						  
						  <tr id ="${ idSTT}">
						  
						  <tr >
						    <td rowspan="3" style="width: 50px; text-align: center;"> <bean:write name="st"/> </td>
						    <td colspan="4">
						    				    	
						    
								<html:select property="cARMM_MKCD" styleClass="form-control" styleId="cb01">
									<option value="">Please select..</option>
									<html:optionsCollection name="autcarmmForm"
										property="listAUTMFOPM" label="mFOPM_NAME"
										value="mFOPM_TRCD" />
								</html:select>
								
						    </td>
						    <td colspan="3">
						    	
						    	<html:select property="cARMM_SYCD" styleClass="form-control" styleId="cb02">
						    		
									<option value="">Please select..</option>
									<html:optionsCollection name="autcarmmForm"
										property="listAUTCARNM" label="cARNM_NAME"
										value="cARNM_SHSYCD" />
								</html:select>
						    	
						    </td>
						    <td colspan="2">
						    <html:text property="cARMM_JRCNT" styleId="Box1" styleClass="form-control"></html:text>	
						    	
						    </td>
						    <td colspan="2">
						    	 <html:text property="cARMM_J1CNT" styleId="Box2" styleClass="form-control"></html:text>	
						    </td>
						    <td colspan="3">
						    	 <html:text property="cARMM_LBLCT" styleId="Box3" styleClass="form-control"></html:text>	
						    </td>
						    <td colspan="4">
						    	 <html:text property="cARMM_HTKN" styleId="Box4" styleClass="form-control"></html:text>	
						    </td>
						    <td colspan="3">
						    	 <html:text property="cARMM_YOBI" styleId="Box5" styleClass="form-control"></html:text>	
						    </td>
						    <td colspan="2" style="border-bottom-style: hidden;">
						    
						    </td>
						  </tr>
						  
						  <tr>
						    <td colspan="1">
						    	 <html:text property="cARMM_EMPNO1" styleId="Box6${idSTT}" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="1"><input  id="checkId_Name${idSTT}" type="button" value="参照" class="btn btn-danger" data-toggle="modal" data-target="#choose-empMaster"></td>
						    
						   
						    
						    
						    <td colspan="3">
						    	<html:text property="eMPFL_EMPNM" styleId="Box7${idSTT}" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="1">
						    	<html:text property="cARMM_EMPNO2" styleId="cARMM_EMPNO2" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="1">
						    	<html:text property="cARMM_EMPNO3" styleId="cARMM_EMPNO3" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="3">
						    	<html:text property="cARMM_EMPNO4" styleId="cARMM_EMPNO4" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="3">
						    	<html:text property="cARMM_EMPNO5" styleId="cARMM_EMPNO5" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="3">
						    	<html:text property="cARMM_EMPNO6" styleId="cARMM_EMPNO6" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="1">
						    	<html:text property="cARMM_EMPNO7" styleId="cARMM_EMPNO7" styleClass="form-control"></html:text>
						    </td>
						   

						    <td colspan="2">
						    	<html:text property="cARMM_EMPNO8" styleId="cARMM_EMPNO8" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="1">
						    	<html:text property="cARMM_EMPNO9" styleId="cARMM_EMPNO9" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="2">
						    	<html:text property="cARMM_EMPNO10" styleId="cARMM_EMPNO10" styleClass="form-control"></html:text>
						    </td>
						    <td colspan="1"></td>
						  </tr>

						</tr>
					<tr>
						<td colspan="24" height="10px"></td>
					</tr>
				
					 <script>
						    function displayVals1() {
						    
						  	  var singleValues = $( "#ma_xe").val();
						  		$( "input#Box6${idSTT}" ).val( singleValues);
						  		console.log("aaaa");
						  		$( "#ten_xe" ).val( singleValues);
						  		var maxe =  $( "#ten_xe :selected" ).text();
						  		$("input#Box7${idSTT}").val(maxe);
						  		console.log(singleValues);
						  		
						  	}
						  	function displayVals2() {	 	
						  	  var multipleValues = $( "#ten_xe :selected" ).text();
						  	  var tenxe = $( "#ten_xe").val();
						  	  console.log(multipleValues);
						  	  $( "#ma_xe" ).val( tenxe);  
						  	  $("input#Box7${idSTT}").val(multipleValues);
						  	  $( "input#Box6${idSTT}" ).val( tenxe);
						  	 
						  	}
						  	
						  	function selectt(){ 
						  		
						  		$( "select#ma_xe" ).change( displayVals1 )
						  			displayVals1();		
						  		$( "select#ten_xe" ).change( displayVals2 )
						  		displayVals2();
						  	
						  	}
						    
						    $("#checkId_Name${idSTT}").click(function(){
						    	console.log("#checkId_Name${idSTT}")
								 selectt();
								 
							})
							
							
						    </script>
					
				
				
					</logic:iterate>


					</tbody>

					</table>

			
					<div class="butt" style="float:right; padding-top: 10px">
					<html:submit  styleClass="btn btn-primary" property="submit" value="submit"/>										
 					<input type="reset" class="btn btn-primary" id="reset"  value="クリアー(C)"/>			
					<html:link styleClass="btn btn-primary" action="/danh-sach">キャンセル(K)</html:link>
					


					</div>

			
	 	</nav>



	</div>
</html:form>

<script>
	

	
	

</script>


</body>
</html>
