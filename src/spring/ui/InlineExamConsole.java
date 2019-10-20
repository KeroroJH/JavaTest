package spring.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.domain.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;

	@Override
	public void print() {
		System.out.println("exam sum : "+exam.total()+"\n exam avg :"+exam.avg());
	}

	@Override
	@Autowired
	@Qualifier("kro32")
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
