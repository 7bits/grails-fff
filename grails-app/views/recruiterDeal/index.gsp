<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY index.haml --%>
<div class='container'>
  <h1>
    <g:message code='recruiter.menu.deals'></g:message>
  </h1>
  <table class='table table-striped'>
    <thead>
      <tr>
        <th>
          <g:message code='recruiter.dealList.vacancyName'></g:message>
        </th>
        <th>
          <g:message code='recruiter.dealList.vacancyDescription'></g:message>
        </th>
        <th>
          <g:message code='recruiter.dealList.dealStatus'></g:message>
        </th>
        <th>
          <g:message code='recruiter.dealList.vacancyCreatedAt'></g:message>
        </th>
        <th></th>
      </tr>
    </thead>
    <tbody>
      <g:each in='${deals}'>
        <tr>
          <td>${it.vacancy.title}</td>
          <td>${it.vacancy.description}</td>
          <td>In progress</td>
          <td>${it.vacancy.createdAt}</td>
          <td>
            <g:link class='btn btn-link' mapping='showRecruiterDeal' params='[id: "${it.id}"]'>
              <g:message code='recruiter.dealList.more'></g:message>
            </g:link>
          </td>
        </tr>
      </g:each>
    </tbody>
  </table>
</div>