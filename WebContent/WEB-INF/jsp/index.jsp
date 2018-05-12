<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
 
  <%@ include file="/commons/header.jsp" %>
 
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>云保护</title>
    
    <link type="text/css" rel="stylesheet" href="${ctx}/css/jsp/index.css">
    
</head>
<body>




<div id="myCarousel" class="carousel slide">
    <!-- 轮播（Carousel）指标 -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>   
    <!-- 轮播（Carousel）项目 -->
    <div class="carousel-inner">
        <div class="item active">
            <img src="${ctx}/img/index/slide1.png" alt="First slide">
        </div>
        <div class="item">
            <img src="${ctx}/img/index/slide2.png" alt="Second slide">
        </div>
        <div class="item">
            <img src="${ctx}/img/index/slide3.png" alt="Third slide">
        </div>
    </div>
    <!-- 轮播（Carousel）导航 -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div> 



<%@ include file="/commons/footer.jsp" %>
	
</body>
</html>