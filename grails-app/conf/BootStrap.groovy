import com.recruiters.Deal
import com.recruiters.Employer
import com.recruiters.Recruiter
import com.recruiters.Role
import com.recruiters.User
import com.recruiters.UserRole
import com.recruiters.Vacancy

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

        def recruiter = new Recruiter(user: recruiterUser)
        recruiter.save(flush: true)
        def employer = new Employer(user: employerUser)
        employer.save(flush: true)

        assert Recruiter.count() == 1
        assert Employer.count() == 1

        def today = new Date()
        def freeVacancy = new Vacancy(
                title: 'Тракторист',
                description: 'Человек кремень',
                employer: employer,
                salary: '40k',
                createdAt: today,
                expireAt: today.next()
        )
        freeVacancy.save(flush: true)
        def inProgressVacancy = new Vacancy(
                title: 'Бетономешальщик',
                description: 'Человек должен быть мягенький',
                employer: employer,
                salary: '30k',
                createdAt: today,
                expireAt: today.next()
        )

        inProgressVacancy.save(flush: true)
        def deal = new Deal(vacancy: inProgressVacancy, recruiter: recruiter)
        deal.save(flush: true)

        assert Vacancy.count() == 2
        assert Deal.count() == 1
    }

    def destroy = {
    }
}
