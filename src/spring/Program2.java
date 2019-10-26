package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.domain.Exam;
import spring.ui.ExamConsole;

public class Program2 {

	public static void main(String[] args) {
/*		Exam exam = new KroExam();
		ExamConsole console = new DecoExamConsole();
		console.setExam(exam);
		
		console.print();*/

		ApplicationContext ap = new ClassPathXmlApplicationContext("spring/setting2.xml");
		ExamConsole console = ap.getBean(ExamConsole.class);
		
		console.print();
	
	}

}
