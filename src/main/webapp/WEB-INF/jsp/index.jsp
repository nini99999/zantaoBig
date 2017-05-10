<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <title>zentaoBIG</title>
    <!-- Bootstrap Core CSS -->
    <link href="${ctx}/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span4">
            <div class="accordion" id="accordion-247786">
                <div class="accordion-group">
                    <div class="accordion-heading">
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion-247786" href="#accordion-element-375079">选项卡 #1</a>
                    </div>
                    <div id="accordion-element-375079" class="accordion-body collapse">
                        <div class="accordion-inner">
                            功能块...
                        </div>
                    </div>
                </div>
                <div class="accordion-group">
                    <div class="accordion-heading">
                        <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion-247786" href="#accordion-element-764881">选项卡 #2</a>
                    </div>
                    <div id="accordion-element-764881" class="accordion-body in collapse">
                        <div class="accordion-inner">
                            功能块...
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="span4">
        </div>
        <div class="span4">
        </div>
    </div>
</div>
</body>