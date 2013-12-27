<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY create.haml --%>
<div class='container'>
  <h2>Создание кандидата</h2>
  <form action='' enctype='multipartform-data' method='post' name='applicantForm'>
    <div class='row'>
      <div class='col-md-6'>
        <div class='form-group'>
          <label for='firstName'></label>
          <input class='form-control' id='firstName' name='firstName' placeholder='&#1048;&#1084;&#1103;' type='text' />
        </div>
        <div class='form-group'>
          <label for='lastName'></label>
          <input class='form-control' id='lastName' name='lastName' placeholder='&#1060;&#1072;&#1084;&#1080;&#1083;&#1080;&#1103;' type='text' />
        </div>
        <div class='form-group'>
          <label for='description'></label>
          <textarea class='form-control' id='description' name='description' placeholder='&#1054;&#1087;&#1080;&#1089;&#1072;&#1085;&#1080;&#1077;'></textarea>
        </div>
        <div class='form-group'>
          <label for='resumeFile'>Прикрепить резюме</label>
          <input id='resumeFile' name='resumeFile' placeholder='&#1055;&#1088;&#1080;&#1082;&#1088;&#1077;&#1087;&#1080;&#1090;&#1100; &#1088;&#1077;&#1079;&#1102;&#1084;&#1077;' type='file' />
        </div>
        <div class='form-group'>
          <label for='testAnswerFile'>Ответы на тест</label>
          <input id='testAnswerFile' name='testAnswerFile' placeholder='&#1054;&#1090;&#1074;&#1077;&#1090;&#1099; &#1085;&#1072; &#1090;&#1077;&#1089;&#1090;' type='file' />
        </div>
        <div class='form-group'>
          <input id='dealId' name='dealId' type='hidden' value='1' />
          <input id='id' name='id' type='hidden' value='0' />
        </div>
        <input class='btn btn-success' name='submit' type='submit' value='&#1044;&#1086;&#1073;&#1072;&#1074;&#1080;&#1090;&#1100;' />
        <a class='btn btn-link' href='#'></a>
        <a href='#'>К описанию вакансии</a>
      </div>
    </div>
  </form>
</div>