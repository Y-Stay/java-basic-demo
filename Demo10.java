import java.util.Arrays;
class Demo10 
{
	public static void main(String[] args) 
	{
		SingleQuestion question1=new SingleQuestion(1,"��õ���Ƶ��ҵ�γ̣�",new String[]{"  A.��Ӯ��","  B.����"},"A");
		question1.printQuestion();
		System.out.println(question1.check(new String[]{"A"}));
		SingleQuestion question2=new SingleQuestion(2,"�����ĸ�ѡ���ǰ����Ӱ��",new String[]{"  A.��С�޲£�","  B.����������"},"A");
		question2.printQuestion();
		System.out.println(question2.check(new String[]{"A"}));
		Question question3=new SingleQuestion(3,"�����ĸ�ѡ���ǰ����Ӱ��",new String[]{"  A.��С�޲£�","  B.����������"},"A");
        question3.printQuestion();
		System.out.println(question3.check(new String[]{"A"}));
		Question question4=new MutilQuestion(4,"�����ĸ�ѡ���ǰ����Ӱ��",new String[]{"  A.��С�޲£�","  B.����������","  C.̩̹��˺�"},new String[]{"A","C"});
	
        question4.printQuestion();
		System.out.println(question4.check(new String[]{"A","C"}));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		SingleQuestion[] questions=new SingleQuestion[]{question1,question2};
		for (int i=0;i<questions.length ;i++ )
		{
			questions[i].printQuestion();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Question[] qs=new Question[]{question1,question2,question3,question4};
		for (Question q:qs )
		{
			q.printQuestion();
		}
	}
}
class Question
{
	int id;
	String title;
	String [] options;
	Question(int id,String title,String[] options)
	{
		this.id=id;
		this.title=title;
		this.options=options;
	}
	void printQuestion()
	{
		System.out.println(id+"."+title);
		for (int i=0;i<options.length ; i++)
		{
			System.out.println(options[i]);
		}
	}
	boolean check(String[] ans)
	{
		return true;
	}
}
class MutilQuestion extends Question
{
String[] answers;
	MutilQuestion(int id,String title,String[] options,String[] answers)
	{
		super(id,title,options);
		this.answers=answers;
	}
	boolean check(String[] ans)
	{
		Arrays.sort(ans);
		return Arrays.equals (ans,answers);
	}
}
class SingleQuestion extends Question
{
	String answer;
	SingleQuestion(int id,String title,String[] options,String answer)
	{
		super(id,title,options);
		this.answer=answer;
	}
	boolean check(String[] ans)
	{
		if(ans.length!=1)
			return false;
		return ans[0].equals(answer);
	}
}
