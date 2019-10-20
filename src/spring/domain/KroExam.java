package spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KroExam implements Exam{
	
	private int math;
	private int kor;
	private int eng;
	
	

	@Override
	public int total() {
		return math+kor+eng;
	}

	@Override
	public float avg() {
		return total() / 3.0f;
	}

}
