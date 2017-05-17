<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta http-equiv="refresh" content="300">
    <title>zentaoBIG</title>
    <!-- Bootstrap Core CSS -->
    <link href="${ctx}/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${ctx}/css/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href="${ctx}/css/dist/css/skins/skin-blue.min.css">

    <!-- jQuery 2.2.3 -->
    <script src="${ctx}/plugins/jQuery/jquery-2.2.3.min.js"></script>
    <!-- Bootstrap 3.3.7 -->
    <script src="${ctx}/js/bootstrap.min.js"></script>
    <!-- AdminLTE App -->
    <script src="${ctx}/js/app.min.js"></script>

    <!-- Slimscroll -->
    <script src="${ctx}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <!-- FastClick -->
    <script src="${ctx}/plugins/fastclick/fastclick.js"></script>

</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">


    <div class="row">
        <div class="col-md-12">
            <div class="box">


                <!-- /.box-header -->
                <div class="box-body">
                    <table class="table table-bordered">
                        <tr>
                            <th class="col-md-3">未开始<div class="pull-right" >(${fn:length(wait)})</div> </th>
                            <th class="col-md-3">进行中<div class="pull-right" >(${fn:length(doing)})</div></th>
                            <th class="col-md-3">已完成<div class="pull-right" >(${fn:length(done)})</div></th>
                            <th class="col-md-3">项目概览<div class="pull-right"> (${fn:length(projects)})</div></th>
                        </tr>
                        <tr>
                            <td>
                                       <table class="table ">
                                           <c:forEach items="${wait}" var="task">
                                           <tr>

                                                   <td>
                                                       <div class="box box-success box-solid">
                                                           <div class="box-header with-border">
                                                               <h3 class="box-title">${task.name}</h3>
                                                               <h3 class="box-title pull-right ">${task.project.name}</h3>

                                                               <!-- /.box-tools -->
                                                           </div>
                                                           <!-- /.box-header -->
                                                           <div class="box-body">
                                                                 <div class="pull-left">${task.user.realname}</div>
                                                               <div class="pull-right">${task.estimate}h</div>
                                                           </div>
                                                           <!-- /.box-body -->
                                                       </div>
                                                   </td>
                                           </tr>
                                           </c:forEach>
                                       </table>

                            </td>
                            <td>
                                <table class="table ">
                                    <c:forEach items="${doing}" var="task">
                                        <tr>

                                            <td>
                                                <div class="box  box-primary box-solid">
                                                    <div class="box-header with-border">
                                                        <h3 class="box-title">${task.name}</h3>
                                                        <h3 class="box-title pull-right ">${task.project.name}</h3>
                                                        <!-- /.box-tools -->
                                                    </div>
                                                    <!-- /.box-header -->
                                                    <div class="box-body">
                                                        <div class="pull-left">${task.user.realname}</div>
                                                        <div class="pull-right">${task.consumed}h/${task.estimate}h</div><br>
                                                        <div class="progress">
                                                            <div class="progress-bar" style="width: ${task.consumed/task.estimate*100}%"></div>
                                                        </div>

                                                    </div>
                                                    <!-- /.box-body -->
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>

                </td>
                            <td>
                                <table class="table ">
                                    <c:forEach items="${done}" var="task">
                                        <tr>

                                            <td>
                                                <div class="box box-solid box-default">
                                                    <div class="box-header with-border">
                                                        <h3 class="box-title">${task.name}</h3>
                                                        <h3 class="box-title pull-right ">${task.project.name}</h3>
                                                        <!-- /.box-tools -->
                                                    </div>
                                                    <!-- /.box-header -->
                                                    <div class="box-body">
                                                        <div class="pull-left">${task.user.realname}</div>
                                                        <div class="pull-right">${task.consumed}h</div>
                                                    </div>
                                                    <!-- /.box-body -->
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </td>
                            <td>
                                <table class="table ">
                                    <c:forEach items="${projects}" var="project">
                                        <tr>
                                            <td>
                                                <div class="progress-group">
                                                    <span class="progress-text">${project.name}</span>
                                                    <span class="progress-number"><b>${project.doneSum+project.closedSum+project.cancelSum}/${project.waitSum+project.doingSum+project.doneSum+project.closedSum+project.cancelSum}(<fmt:formatNumber value="${(project.doneSum+project.closedSum+project.cancelSum)/(project.waitSum+project.doingSum+project.doneSum+project.closedSum+project.cancelSum)*100}" pattern="#0.00"/>%)</b></span>

                                                    <div class="progress sm">
                                                        <div class="progress-bar ${project.color}" style="width: ${(project.doneSum+project.closedSum+project.cancelSum)/(project.waitSum+project.doingSum+project.doneSum+project.closedSum+project.cancelSum)*100}%"></div>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <!-- Main Footer -->

    <footer class="main-footer col-md-12">

        <!-- Default to the left -->
        <strong>Copyright &copy; 2016 <a href="#">Company</a>.</strong> All rights reserved.
    </footer>
</div>


<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->


<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. Slimscroll is required when using the
     fixed layout. -->
</body>
</html>