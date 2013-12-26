<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY auth.haml --%>
<!DOCTYPE html>
<html>
  <head>
    <title>Рекрутеры | Логин</title>
    <meta content='text/html; charset=UTF-8' http-equiv='Content-Type' />
    <meta content='auth' name='layout' />
    <r:require module='css'></r:require>
    <g:javascript src='lib/bootstrap.js'></g:javascript>
  </head>
  <body>
    <div class='container'>
      <form action='${postUrl}' class='form-signin' method='POST' role='form'>
        <h2 class='firm-signin-heading'>Вход</h2>
        <input autofocus='' class='form-control' name='j_username' placeholder='Email' required='' />
        <input class='form-control' name='j_password' placeholder='&#1055;&#1072;&#1088;&#1086;&#1083;&#1100;' required='' type='password' />
        <label class='checkbox'>
          <input name='${rememberMeParameter}' type='checkbox'>Запомни меня</input>
          <button class='btn btn-lg btn-primary btn-block' name='submit' type='submit' value='Sign In'>Вход</button>
        </label>
      </form>
    </div>
  </body>
</html>