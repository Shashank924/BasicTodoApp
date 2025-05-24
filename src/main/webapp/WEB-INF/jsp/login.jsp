<html>

    <head>
        <title>Login Page</title>
        <link href = "\webjars\bootstrap\5.3.0\css\bootstrap.min.css" rel = "stylesheet">
    </head>

    <body>
        <div class ="container">
            <h3> Please Enter your Credentials. </h3>
            <pre> ${error} </pre>
            <form method = "post">
                   <input type = "text" name = "username">
                   <input type = "password" name = "password">
                   <input type = "submit">
            </form>
        </div>
    </body>
    <script src = "\webjars\bootstrap\5.3.0\js\bootstrap.min.js"></script>
    <script src = "\webjars\jquery\3.6.0\jquery.min.js"></script>
</html>