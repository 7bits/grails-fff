<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY main.haml --%>
<!DOCTYPE html>
<html>
  <head>
    <title>
      <g:layoutTitle default='&#1056;&#1077;&#1082;&#1088;&#1091;&#1090;&#1077;&#1088;&#1099; &#1088;&#1091;&#1083;&#1103;&#1090;'></g:layoutTitle>
    </title>
    <meta content='text/html; charset=UTF-8' http-equiv='Content-Type' />
    <script src='http://code.jquery.com/jquery-2.0.3.js'></script>
    <r:require module='css'></r:require>
    <g:javascript src='lib/bootstrap.js'></g:javascript>
    <g:javascript src='lib/bootstrap-confirmation.js'></g:javascript>
    <g:javascript src='confirmation.js'></g:javascript>
    <g:layoutHead />
    <r:layoutResources />
  </head>
  <body>
    <div class='navbar navbar-default' role='navigation'>
      <div class='container'>
        <div class='navbar-header'>
          <a class='navbar-brand' href='#'>Имя проекта</a>
        </div>
        <div class='navbar-collapse collapse'>
          <ul class='nav navbar-nav navbar-right'>
            <sec:ifAllGranted roles='ROLE_RECRUITER'>
              <g:render template='/layouts/recruiter_menu'></g:render>
            </sec:ifAllGranted>
            <sec:ifAllGranted roles='ROLE_EMPLOYER'>
              <g:render template='/layouts/employer_menu'></g:render>
            </sec:ifAllGranted>
          </ul>
        </div>
      </div>
    </div>
    <g:layoutBody />
  </body>
</html>