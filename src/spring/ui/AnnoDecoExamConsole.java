package spring.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.domain.Exam;

@Component
public class AnnoDecoExamConsole implements ExamConsole {
	
	@Autowired
	private Exam exam;

	@Override
	public void print() {
		System.out.println("************************************Annotation");
		System.out.println("exam sum : "+exam.total()+" exam avg :"+exam.avg());
		System.out.println("************************************");

	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;

	}

}
