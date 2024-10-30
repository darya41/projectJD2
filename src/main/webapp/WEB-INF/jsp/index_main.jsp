<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Главная страница</title>
    <link rel="stylesheet" href="./css/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
</head>
<body>
    <header>
        <h1>Новости и Вход</h1>
    </header>
    <main>
        <section class="login-form">
            <h2>Вход</h2>
            <form action="/login" method="post">
                <label for="username">Имя пользователя:</label>
                <input type="text" id="username" name="username" required>
                <label for="password">Пароль:</label>
                <input type="password" id="password" name="password" required>
                <button type="submit">Войти</button>
            </form>
            <p>Нет аккаунта? <a href="/register">Зарегистрироваться</a></p>
        </section>
        <section class="news">
            <h2>Новости</h2>
            <div class="news-grid">
                <c:forEach var="item" items="${mainNews}">
                    <article>
                        <h3><c:out value="${item.title}" /></h3>
                        <p><c:out value="${item.brief}" /></p>
                         
                        <button class="more-btn">Подробнее</button>
                    </article>
                </c:forEach>
            </div>
            <button class="load-more-btn">Ещё</button>
        </section>
    </main>
    <footer>
        <p>© 2024 Главная страница</p>
    </footer>
</body>
</html>
