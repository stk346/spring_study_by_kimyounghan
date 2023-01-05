package hello.jdbc.repository;

import hello.jdbc.domain.Member;

import java.sql.SQLException;

// SQLException을 던지기 위해서는 인터페이스에도 명시가 돼있어야 한다.
public interface MemberRepositoryEx {
    Member save(Member member) throws SQLException;

    Member findById(String memberId) throws SQLException;

    void update(String memberId, int money) throws SQLException;

    void delete(String memberId) throws SQLException;
}
