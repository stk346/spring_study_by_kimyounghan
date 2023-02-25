package study.datajpa;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import study.datajpa.entity.Member;
import study.datajpa.entity.Team;
import study.datajpa.repository.MemberJpaRepository;
import study.datajpa.repository.MemberRepository;

import javax.persistence.EntityManager;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaApplication.class, args);
	}

}
