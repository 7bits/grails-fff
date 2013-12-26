import com.recruiters.Role
import com.recruiters.User
import com.recruiters.UserRole

class BootStrap {

    def init = { servletContext ->
        def recruiterRole = new Role(authority: 'ROLE_RECRUITER').save(flush: true)
        def employerRole = new Role(authority: 'ROLE_EMPLOYER').save(flush: true)

        def recruiterUser = new User(username: 'recruiter', password: '123123')
        def employerUser = new User(username: 'employer', password: '123123')
        recruiterUser.save(flush: true)
        employerUser.save(flush: true)

        UserRole.create recruiterUser, recruiterRole, true
        UserRole.create employerUser, employerRole, true

        assert User.count() == 2
        assert Role.count() == 2
        assert UserRole.count() == 2
    }
    def destroy = {
    }
}
