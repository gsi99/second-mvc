<html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
	<script type="text/javascript" src="/second-mvc/web-resources/core/jquery-2.1.0.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>	
	<title>Being Java Guys | Summary</title>

	<!-- Bootstrap core CSS -->
	<link href="/second-mvc/web-resources/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>   
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
		<script type="text/javascript">
		</script>        
          <h3 class="header" id="my-header"></h3>                             
          <div class="table-responsive">         
			<table class="table table-striped" id="my-table">
              <thead>
                <tr>
                  <th>Product Code</th>
                  <th>Item Count</th>
                  <th>Item Status</th>
                </tr>
              </thead>
			  <tbody>
			  </tbody>
			</table>
			<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
			<script type="text/javascript">
				var data = ${message};
				var accountName = data.accountName;
				var accountNumber = data.accountNumber;
 				var items = data.itemSummary;
 		 				$(document).ready(function(){
 		 					var header = document.getElementById ("my-header");
 		 					header.innerHTML = 'AccountName:'+accountName+' AccountNumber:'+accountNumber
					        $.each(items, function(i,item){
					        	$('#my-table > tbody:last').append('<tr>');
					        	$('#my-table > tbody:last').append('<td>'+item.productCode+'</td>');
					        	$('#my-table > tbody:last').append('<td>'+item.itemCount+'</td>');
					            $('#my-table > tbody:last').append('<td>'+item.itemStatus+'</td>');
					            $('#my-table > tbody:last').append('</tr>');
					        });
 				});
			</script>
          </div>
        </div>
      </div>
    </div>
    
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/second-mvc/web-resources/core/jquery-2.1.0.js"></script>
    <script src="/second-mvc/web-resources/core/jquery-2.1.0.min.map"></script>
    <script src="/second-mvc/web-resources/js/bootstrap.min.js"></script>   
    
</body>  
</html> 