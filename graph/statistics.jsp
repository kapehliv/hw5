<%@page import="mylisten.MyListener" %>
<%@page import="mylisten.AttListener" %>


<html>
  <head>
    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Parameters', 'Attribute Number'],
          ['Number of visits',  <%=AttListener.getTxTNums("visitNum.txt") %>    ],
          ['Xml changes in times',  <%=AttListener.getTxTNums("xmlattr.txt") %>],
          ['Uploads in times',   <%=AttListener.getTxTNums("uploadatrr.txt") %>],
          ['Alive Sessions',   <%=MyListener.getAliveSessions() %>]
        ]);

        var options = {
          title: 'Site Statistics','backgroundColor':'#fafad2',
          vAxis: {title: 'Parameter',  titleTextStyle: {color: '#ff1493'}}
        };

        var chart = new google.visualization.BarChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    </script>
  </head>
  <body style="background-color:pink;"><h1>Photooning Charts</h1>
    <div id="chart_div" style="width: 1000px; height: 500px;"></div>
  </body>
</html>