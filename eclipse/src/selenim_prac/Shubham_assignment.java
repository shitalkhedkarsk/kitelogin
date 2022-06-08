package selenim_prac;


import java.util.Arrays;


public class Shubham_assignment {

	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver","F:\\webdriver\\chromedriver version100\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		List<WebElement> items = driver.findElements(By.xpath("//div[@class='_37M3Pb']"));
//		//System.out.println(items.getText());
////		String text = items.get(0).getText();
////		System.out.println(text);
//		ArrayList<String> obj=new ArrayList<String>();
//		for(WebElement o:items)
//		{
//			String text = o.getText();
//			 
//			System.out.println(obj.add(text));
//		}
		
		int[] a= {10,80,5,47,63,2,90};
		int size =a.length;
		Arrays.sort(a);
		System.out.println("sorted array is "+Arrays.toString(a));
		int max = a[size-3];
		System.out.println("3rd largest value "+max);
	}

}
