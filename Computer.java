package comp;

public class Computer {

	MotherBoard mb;
	KeyBoard kb;
	CPU cpu;
	Mouse mouse;
	RAM ram;
	Monitor monitor;
	
	
	public void display()
	{
		System.out.println("details of mother board");
		
		System.out.println("mother board id: "+mb.id);
		System.out.println("mother board company: "+mb.cmpy.name);
	//	System.out.println("monitor email: "+mb.cmpy.email);
	//	System.out.println("monitor address: "+mb.cmpy.addr.city);
		System.out.println("mother board quality rating: "+mb.qualityRating);
		System.out.println("mother board warranty period: "+mb.warratyPeriod);
		System.out.println("mother board final price: "+mb.finalBill.finalPrice);
		System.out.println();
		System.out.println("details of key board");

		
		System.out.println("key board id: "+kb.id);
		System.out.println("key board company: "+kb.cmpy.name);
	//	System.out.println("monitor email: "+mb.cmpy.email);
	//	System.out.println("monitor address: "+mb.cmpy.addr.city);
		System.out.println("key board quality rating: "+kb.qualityRating);
		System.out.println("key board warranty period: "+kb.warratyPeriod);
		System.out.println("key board final price: "+kb.finalBill.finalPrice);
		
		System.out.println();
	
		System.out.println("details of CPU");
		

		
		System.out.println("CPU id: "+cpu.id);
		System.out.println("CPU company: "+cpu.cmpy.name);
	//	System.out.println("monitor email: "+mb.cmpy.email);
	//	System.out.println("monitor address: "+mb.cmpy.addr.city);
		System.out.println("CPU quality rating: "+cpu.qualityRating);
		System.out.println("CPU warranty period: "+cpu.warratyPeriod);
		System.out.println("CPU final price: "+cpu.finalBill.finalPrice);
		System.out.println("CPU speed : "+cpu.speed);
		System.out.println("CPU type: "+cpu.type);
		System.out.println();
		
		System.out.println("details of Mouse");
		

		System.out.println("Mouse id: "+mouse.id);
		System.out.println("Mouse company: "+mouse.cmpy.name);
	//	System.out.println("monitor email: "+mb.cmpy.email);
	//	System.out.println("monitor address: "+mb.cmpy.addr.city);
		System.out.println("Mouse quality rating: "+mouse.qualityRating);
		System.out.println("Mouse warranty period: "+mouse.warratyPeriod);
		System.out.println("Mouse final price: "+mouse.finalBill.finalPrice);
		System.out.println(" Mouse type : "+mouse.type);
		System.out.println();
		System.out.println("details of RAM");
		

		System.out.println("RAM id: "+ram.id);
		System.out.println("RAM company: "+ram.cmpy.name);
	//	System.out.println("monitor email: "+mb.cmpy.email);
	//	System.out.println("monitor address: "+mb.cmpy.addr.city);
		System.out.println("RAM quality rating: "+ram.qualityRating);
		System.out.println("RAM warranty period: "+ram.warratyPeriod);
		System.out.println("RAM final price: "+ram.finalBill.finalPrice);
		System.out.println(" RAM capacity in GB : "+ram.capacity);
		System.out.println();
		System.out.println("details of monitor");

		System.out.println(" monitor id: "+monitor.id);
		System.out.println(" monitor company: "+monitor.cmpy.name);
	//	System.out.println("monitor email: "+mb.cmpy.email);
	//	System.out.println("monitor address: "+mb.cmpy.addr.city);
		System.out.println(" monitor quality rating: "+monitor.qualityRating);
		System.out.println(" monitor warranty period: "+monitor.warratyPeriod);
		System.out.println(" monitor final price: "+monitor.finalBill.finalPrice);
		System.out.println(" monitor width : "+monitor.width+"monitor heigght is :"+monitor.height);
		
	}
}
