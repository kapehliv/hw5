<html>
  <head>
    <title>WelCoMe</title>
    <meta content="">
    <style></style>
  </head>
  
<%
if(session.getAttribute("logon.isDone")!=null && session.getAttribute("logon.isDone")!="")
{ %>

  <h1>Photooning</h1>
  <h2>Welcome.. To view the photos of the album click the button below </h2>
  <link rel='stylesheet' href='web/afterLoginstyle.css' type='text/css'>

				<form action="statistics.jsp">
				<input type="submit" value="Bar Chart">
				</form>	

				<form action="DisplayImages" method="post">
				<input type="submit" value="View Photo Album">
				</form>	

<h2>UploAd And Share yOur PhoTos ..</h2>
		<form action="UploadImagesToMySite" method="post" enctype="multipart/form-data">
<input type="file" name="file" size="50" />
<input type="submit" value="Upload File" />
</form>


<h3>Here You can see the categories comming up in this photoalbum.. Have fun..</h3>
<ul class="gallery">
			<li>
				<img src='images/pink.jpg' alt='image' />
				<p>Cars</p>		
			</li>
				<li>
				<img src='images/jessica.jpg' alt='image' />
				<p>Fashion</p>
			</li>
			<li>
				<img src='images/science.jpg' alt='image' />
				<p>Science</p>
			</li>
			<li>
				<img src='images/1.jpg' alt='image' />
				<p>Food</p>
			</li>
			<li>
				<img src='images/landscape.jpg' alt='image' />
				<p>Landscapes</p>
			</li>
			<li>
				<img src='images/abstract.jpg' alt='image' />
				<p>Abstract</p>
			</li>
			<li>
			<img src='images/6.jpg' alt='image' />
				<p>Personal</p>
			</li>
			<li>
			<img src='images/Mona.jpg' alt='image' />
				<p>Art</p>
			</li>
		</ul>


<%} %>
    
</html>




