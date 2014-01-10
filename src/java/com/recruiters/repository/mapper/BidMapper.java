package com.recruiters.repository.mapper;

import com.recruiters.model.Bid;
import com.recruiters.model.BidStatus;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Mapper for Bid POJO
 */
public interface BidMapper {

    @Select("SELECT bids.id, bids.message, bids.status, " +
            "vacancies.id as vacancy_id,  vacancies.employer_id, vacancies.title, " +
            "vacancies.description, vacancies.salary, vacancies.creation_date, " +
            "recruiters.id as recruiter_id, " +
            "users.firstname, users.lastname " +
            "FROM bids " +
            "INNER JOIN vacancies ON vacancies.id=bids.vacancy_id " +
            "INNER JOIN recruiters  ON recruiters.id=bids.recruiter_id " +
            "INNER JOIN users ON recruiters.user_id=users.id " +
            "WHERE bids.recruiter_id=#{recruiterId}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "message", property = "message"),
            @Result(column = "status", property = "status"),
            @Result(column = "vacancy_id", property = "vacancy.id"),
            @Result(column = "employer_id", property = "vacancy.employer.id"),
            @Result(column = "title", property = "vacancy.title"),
            @Result(column = "description", property = "vacancy.description"),
            @Result(column = "salary", property = "vacancy.salary"),
            @Result(column = "creation_date", property = "vacancy.creationDate"),
            @Result(column = "recruiter_id", property = "recruiter.id"),
            @Result(column = "firstname", property = "recruiter.user.firstName"),
            @Result(column = "lastname", property = "recruiter.user.lastName")
    })
    List<Bid> findRecruiterBids(final Long recruiterId);

    @Select("SELECT bids.id, bids.message, bids.status, " +
            "vacancies.id as vacancy_id,  vacancies.employer_id, vacancies.title, " +
            "vacancies.description, vacancies.salary, vacancies.creation_date, " +
            "recruiters.id as recruiter_id, " +
            "users.firstname, users.lastname " +
            "FROM bids " +
            "INNER JOIN vacancies ON vacancies.id=bids.vacancy_id " +
            "INNER JOIN recruiters  ON recruiters.id=bids.recruiter_id " +
            "INNER JOIN users ON recruiters.user_id=users.id " +
            "WHERE vacancies.employer_id=#{employerId}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "message", property = "message"),
            @Result(column = "status", property = "status"),
            @Result(column = "vacancy_id", property = "vacancy.id"),
            @Result(column = "employer_id", property = "vacancy.employer.id"),
            @Result(column = "title", property = "vacancy.title"),
            @Result(column = "description", property = "vacancy.description"),
            @Result(column = "salary", property = "vacancy.salary"),
            @Result(column = "creation_date", property = "vacancy.creationDate"),
            @Result(column = "recruiter_id", property = "recruiter.id"),
            @Result(column = "firstname", property = "recruiter.user.firstName"),
            @Result(column = "lastname", property = "recruiter.user.lastName")
    })
    List<Bid> findBidsForEmployerVacancies(final Long employerId);

    @Select("SELECT bids.id, bids.message, bids.status, " +
            "vacancies.id as vacancy_id,  vacancies.employer_id, vacancies.title, " +
            "vacancies.description, vacancies.salary, vacancies.creation_date, " +
            "recruiters.id as recruiter_id, " +
            "users.firstname, users.lastname " +
            "FROM bids " +
            "INNER JOIN vacancies ON vacancies.id=bids.vacancy_id " +
            "INNER JOIN recruiters  ON recruiters.id=bids.recruiter_id " +
            "INNER JOIN users ON recruiters.user_id=users.id " +
            "WHERE bids.id=#{bidId}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "message", property = "message"),
            @Result(column = "status", property = "status"),
            @Result(column = "vacancy_id", property = "vacancy.id"),
            @Result(column = "employer_id", property = "vacancy.employer.id"),
            @Result(column = "title", property = "vacancy.title"),
            @Result(column = "description", property = "vacancy.description"),
            @Result(column = "salary", property = "vacancy.salary"),
            @Result(column = "creation_date", property = "vacancy.creationDate"),
            @Result(column = "recruiter_id", property = "recruiter.id"),
            @Result(column = "firstname", property = "recruiter.user.firstName"),
            @Result(column = "lastname", property = "recruiter.user.lastName")
    })
    com.recruiters.model.Bid findById(final Long bidId);

    @Select("SELECT bids.id, bids.message, bids.status, " +
            "vacancies.id as vacancy_id,  vacancies.employer_id, vacancies.title, " +
            "vacancies.description, vacancies.salary, vacancies.creation_date, " +
            "recruiters.id as recruiter_id, " +
            "users.firstname, users.lastname " +
            "FROM bids " +
            "INNER JOIN vacancies ON vacancies.id=bids.vacancy_id " +
            "INNER JOIN recruiters  ON recruiters.id=bids.recruiter_id " +
            "INNER JOIN users ON recruiters.user_id=users.id " +
            "WHERE bids.vacancy_id=#{vacancyId}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "message", property = "message"),
            @Result(column = "status", property = "status"),
            @Result(column = "vacancy_id", property = "vacancy.id"),
            @Result(column = "employer_id", property = "vacancy.employer.id"),
            @Result(column = "title", property = "vacancy.title"),
            @Result(column = "description", property = "vacancy.description"),
            @Result(column = "salary", property = "vacancy.salary"),
            @Result(column = "creation_date", property = "vacancy.creationDate"),
            @Result(column = "recruiter_id", property = "recruiter.id"),
            @Result(column = "firstname", property = "recruiter.user.firstName"),
            @Result(column = "lastname", property = "recruiter.user.lastName")
    })
    List<Bid> findBidsForVacancy(final Long vacancyId);

    @Insert("INSERT INTO bids (vacancy_id, recruiter_id, message) " +
            "VALUES (#{vacancyId}, #{recruiterId}, #{message})")
    void createBid(@Param("recruiterId") final Long recruiterId,
                   @Param("vacancyId") final Long vacancyId,
                   @Param("message") final String message);

    @Update("UPDATE bids SET status = #{status} WHERE id = #{bidId} ")
    void updateBidStatus(final Long bidId, final BidStatus status);
}