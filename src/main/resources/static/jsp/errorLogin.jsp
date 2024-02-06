<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login</title>
    <link rel="stylesheet" href="/css/login.css">
</head>
<body>
    <div class="login-container">
        <h1>Login</h1>
        <form action="/login" method="post">
            <div class="input-group">
                <label for="username">User:</label>
                <input id="username" name="username" type="text" placeholder="Enter your username" required>
            </div>
            <div class="input-group">
                <label for="password">Password:</label>
                <input id="password" name="password" type="password" placeholder="Enter your password" required>
            </div>
            <button type="submit">Submit</button>
        </form>
        <p class="info-text">Don't have an account? <a href="#">Sign up</a></p>
    </div>
</body>
</html>
