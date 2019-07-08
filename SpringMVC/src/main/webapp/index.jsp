<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
</head>
<script>
    $(function () {
        $("#fors").submit(function () {
            var name=$(this).name;
            var age=$(this).age;
            var address=$(this).address;
            var date=$(this).date;
            $.ajax({
                // 编写json格式，设置属性和值
                url:"show1",
                contentType:"application/json;charset=UTF-8",
                data:'{"name":name,"age":age,"address":address,"date":date}',
                dataType:"json",
                type:"post",
                success:function(data){
                    // data服务器端响应的json的数据，进行解析
                    alert(data);
                    alert(data.name);
                    alert(data.password);
                    alert(data.age);
                }
            });

        });
    });
</script>
<body>
<%--<a href="show1">aaaaaaaa</a>--%>
<form action="show1" method="post" id="fors" >
    <input type="file" name="upload"/>
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><<br>
    地址：<input type="text" name="address"/><br>
    日期：<input type="text" name="date"/><br>
    <%--list:<input type="text" name="users[0].name"/><br>--%>
    <%--<input type="text" name="users[0].age"/><br>--%>
    <%--map:<input type="text" name="map['one'].name"/><br>--%>
    <%--<input type="text" name="map['one'].age"/><br>--%>
    <input type="submit" value="提交">
<%--</form>--%>
<%--<a href="show2">requestparam</a>--%>
<%--<a href="show4/900">pathVariable</a>--%>
<%--<a href="show6">pathVariable</a>--%>
<%--<a href="show8">show8</a>--%>
</body>
</html>
