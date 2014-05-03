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
          <h3 class="header">Account Name: ${message.accountName} Number:${message.accountNumber}</h3>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Product Code</th>
                  <th>Item Count</th>
                  <th>Item Status</th>
<!--                   <th>Sub Status</th> -->
                </tr>
              </thead>
              <tbody>
				<c:forEach items="${message.itemSummary}" var="itemSummary">
			        <tr>
			            <td>${itemSummary.productCode}</td>
			            <td>${itemSummary.itemCount}</td>
			            <td>${itemSummary.itemStatus}</td>
<%-- 			            <td>${itemSummary.subStatus}</td> --%>
			        </tr>
				</c:forEach>              
              </tbody>
            </table>
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