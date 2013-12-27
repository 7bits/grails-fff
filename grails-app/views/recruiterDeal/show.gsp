<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY show.haml --%>
<div class='container'>
  <h1>
    <g:message code='recruiter.dealShow.headline'></g:message>
  </h1>
  <div class='row'>
    <div class='col-md-8'>
      <h2></h2>
      <dl class='dl-horizontal'>
        <dt>
          <g:message code='recruiter.dealShow.vacancyName'></g:message>
        </dt>
        <dd>Программист</dd>
        <dt>
          <g:message code='recruiter.dealShow.vacancyDescription'></g:message>
        </dt>
        <dd>PHP guru</dd>
        <dt>
          <g:message code='recruiter.dealShow.vacancySalary'></g:message>
        </dt>
        <dd>10 - 20</dd>
        <dt>
          <g:message code='recruiter.dealShow.vacancyCreatedAt'></g:message>
        </dt>
        <dd>10.12.2013</dd>
        <dt>
          <g:message code='recruiter.dealShow.vacancyExpireAt'></g:message>
        </dt>
        <dd>09.09.2014</dd>
      </dl>
    </div>
    <div class='col-md-4'>
      <h2>
        <g:message code='recruiter.dealShow.employer'></g:message>
      </h2>
      <p>Иванов Василий Палыч</p>
    </div>
  </div>
  <h2>
    <g:message code='recruiter.dealShow.applicantList.title'></g:message>
  </h2>
  <table class='table table-striped'>
    <thead>
      <tr>
        <th>
          <g:message code='recruiter.dealShow.applicantList.firstName'></g:message>
        </th>
        <th>
          <g:message code='recruiter.dealShow.applicantList.lastName'></g:message>
        </th>
        <th>
          <g:message code='recruiter.dealShow.applicantList.status'></g:message>
        </th>
        <th>
          <g:message code='recruiter.dealShow.applicantList.createdAt'></g:message>
        </th>
        <th>
          <g:message code='recruiter.dealShow.applicantList.action'></g:message>
        </th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Иван</td>
        <td>Иванов</td>
        <td>In progress</td>
        <td>09.09.2014</td>
        <td>
          <a class='btn btn-link pull-right' href='#'>
            <g:message code='recruiter.dealShow.applicantList.edit'></g:message>
          </a>
        </td>
      </tr>
      <tr>
        <td>Константин</td>
        <td>Константинопольский</td>
        <td>In progress</td>
        <td>09.09.2014</td>
        <td></td>
      </tr>
      <tr>
        <td>Пётр</td>
        <td>Петров</td>
        <td>In progress</td>
        <td>09.09.2014</td>
        <td>
          <a class='btn btn-link pull-right' href='#'>
            <g:message code='recruiter.dealShow.applicantList.edit'></g:message>
          </a>
        </td>
      </tr>
    </tbody>
  </table>
  <g:link class='btn btn-success' mapping='recruiterNewApplicant'>
    <g:message code='recruiter.dealShow.applicantList.new'></g:message>
  </g:link>
</div>