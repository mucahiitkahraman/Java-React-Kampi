package inheritance2;

public class LogManager {
	
	public void log(int LogType)
	{
		if(LogType == 1)
		{
			System.out.println("Veritabanına Loglandı");
		}
		else if (LogType == 2)
		{
			System.out.println("Dosyaya Loglandı");
		}
		else
		{
			System.out.println("Email gönderildi");
		}
	}
	
}

//1- Database
//2- File
//3- Email