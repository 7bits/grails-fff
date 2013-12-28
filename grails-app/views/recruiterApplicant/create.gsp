<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY create.haml --%>
<div class='container'>
  <h2>
    <g:message code='recruiter.applicantNew.headline'></g:message>
  </h2>
  <form action='' enctype='multipartform-data' method='post' name='applicantForm'>
    <div class='row'>
      <div class='col-md-6'>
        <div class='form-group'>
          <label for='firstName'></label>
          <input class='form-control' id='firstName' name='firstName' placeholder="${message(code:'recruiter.applicantNew.firstName')}" type='text' />
        </div>
        <div class='form-group'>
          <label for='lastName'></label>
          <input class='form-control' id='lastName' name='lastName' placeholder="${message(code:'recruiter.applicantNew.lastName')}" type='text' />
        </div>
        <div class='form-group'>
          <label for='description'></label>
          <textarea class='form-control' id='description' name='description' placeholder="${message(code:'recruiter.applicantNew.description')}"></textarea>
        </div>
        <div class='form-group'>
          <label for='resumeFile'>Прикрепить резюме</label>
          <input id='resumeFile' name='resumeFile' placeholder="${message(code:'recruiter.applicantNew.resume')}" type='file' />
        </div>
        <div class='form-group'>
          <label for='testAnswerFile'>Ответы на тест</label>
          <input id='testAnswerFile' name='testAnswerFile' placeholder="${message(code:'recruiter.applicantNew.answers')}" type='file' />
        </div>
        <div class='form-group'>
          <input id='dealId' name='dealId' type='hidden' value='1' />
          <input id='id' name='id' type='hidden' value='0' />
        </div>
        <input class='btn btn-success' name='submit' type='submit' value="${message(code:'recruiter.applicantNew.add')}" />
        <a class='btn btn-link' href='#'></a>
      </div>
    </div>
  </form>
</div>