<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
           绑定成功，<span id="dd">5</span>秒后跳转到<a href="front/index.html">主页</a>
</div>
</body>
<script type="text/javascript">
    function run(){
        var s = document.getElementById("dd");
        if(s.innerHTML == 0){
            window.location.href='front/index.html';
            return false;
        }
        s.innerHTML = s.innerHTML * 1 - 1;
    }
    window.setInterval("run();", 1000);
</script>
</html>