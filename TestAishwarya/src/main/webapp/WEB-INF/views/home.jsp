<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.InputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>  
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	
</head>
<script type="text/javascript">
/* var jqxhr = $.getJSON( "https://s3.ap-south-1.amazonaws.com/ss-local-files/products.json", function(resp) {
	  console.log( "success",resp );
	})
jqxhr.complete(function() {
  console.log( "second complete" );
}); */
$.ajax({
	url:"${pageContext.request.contextPath}/GetData",
	method : "post",
	dataType : "json",
	contentType : "application/json",
	async: false,
   success: function(response) {		       	    
	   console.log(response)
   	}
});
</script>
<body><%
String fileName = "/WEB-INF/views/Storedata.json";
InputStream ins = application.getResourceAsStream(fileName);
try
{
    if(ins == null)
    {
        response.setStatus(response.SC_NOT_FOUND);
    }
    else
    {
        BufferedReader br = new BufferedReader((new InputStreamReader(ins)));
        String data;
        while((data= br.readLine())!= null)
        {
            out.println(data+"<br>");
        }
    }   
}
catch(IOException e)
{
out.println(e.getMessage());
}
%>
<h5>Records Available</h5>
<div class="container">
	<div class="row">
        <table class="table table-striped table-bordered table-hover locationMasterTable table-responsive" id="OverView">
		<thead>
			<tr>
				<td>Sr No. </td>
				<td>Sub Category </td>
				<td>Title</td>
				<td>Price </td>
				<td>Popularity</td>
			</tr>
		</thead>
		</table>
	</div>
</div>
</body>
</html>
