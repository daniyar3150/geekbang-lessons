<head>
    <jsp:directive.include
            file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
    <title>用户注册</title>
</head>
<body>
<div class="container-lg">
    <!-- Content here -->
    <form action="/user/doRegister" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td>
                    <input name="name">
                </td>
            </tr>
            <tr>
                <td>密码：</td>
                <td>
                    <input name="password" type="password">
                </td>
            </tr>
            <tr>
                <td>email：</td>
                <td>
                    <input name="email">
                </td>
            </tr>
            <tr>
                <td>手机号：</td>
                <td>
                    <input name="phone">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">提交</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>