package spring.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component("keroro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnoKroExam implements Exam{
	
	private int math;
	private int kor;
	private int eng;
	private int com;
	
	

	@Override
	public int total() {
		return math+kor+eng;
	}

	@Override
	public float avg() {
		return total() / 3.0f;
	}

}
