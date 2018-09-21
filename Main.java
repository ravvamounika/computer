package comp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First computer details");
		Computer comp1=new Computer();
		//mother board
		Address ma1=new Address();
		ma1.city="Nagpur";
		ma1.pin=440010;
		ma1.state="maharashtra";
		ma1.street="buldi";
		Company mc1=new Company();
		mc1.id=100;
		mc1.name="monitor1";
		mc1.email="m1@gmail.com";
		mc1.addr=ma1;
		Bill mb1=new Bill();
		mb1.baseProdructPrice=1000;
		mb1.centralTax=10;
		mb1.finalPrice=20000;
		mb1.number=11;
		mb1.serviceTax=15;
		mb1.stateTax=20;
		mb1.transportTax=3;
		
		
		MotherBoard m1=new MotherBoard();
		m1.id=1;
		m1.cmpy=mc1;
		m1.qualityRating=10f;
		m1.warratyPeriod=3;
		m1.finalBill=mb1;
		comp1.mb=m1;
		
		
		
		
		//keyboard
		
		Address ka1=new Address();
		ka1.city="hyderabad";
		ka1.pin=040;
		ka1.state="telangana";
		ka1.street="kphb";
		Company kc1=new Company();
		kc1.id=1000;
		kc1.name="keyboard1";
		kc1.email="kb1@gmail.com";
		kc1.addr=ka1;
		Bill kb1=new Bill();
		kb1.baseProdructPrice=2000;
		kb1.centralTax=9;
		kb1.finalPrice=15000;
		kb1.number=21;
		kb1.serviceTax=17;
		kb1.stateTax=10;
		kb1.transportTax=5;
		
		
		KeyBoard k1=new KeyBoard();
		k1.id=1;
		k1.cmpy=kc1;
		k1.qualityRating=0.9f;
		k1.warratyPeriod=3;
		k1.finalBill=kb1;
		comp1.kb=k1;
		//comp1.display();
		

		//CPU
		Address ca1=new Address();
		ca1.city="hyd";
		ca1.pin=040;
		ca1.state="telangana";
		ca1.street="SRnagar";
		Company cc1=new Company();
		cc1.id=5000;
		cc1.name="cpu1";
		cc1.email="cpu1@gmail.com";
		cc1.addr=ca1;
		Bill cb1=new Bill();
		cb1.baseProdructPrice=500;
		cb1.centralTax=2;
		cb1.finalPrice=1000;
		cb1.number=50;
		cb1.serviceTax=5;
		cb1.stateTax=10;
		cb1.transportTax=15;
		
		
		CPU c1=new CPU();
		c1.id=1;
		c1.cmpy=kc1;
		c1.qualityRating=0.9f;
		c1.warratyPeriod=3;
		c1.finalBill=kb1;
		c1.speed="1MBPS";
		c1.type="I3";				
		comp1.cpu=c1;
		//comp1.display();
		
		
		//mouse
		Address moa1=new Address();
		moa1.city="vijayawada";
		moa1.pin=866;
		moa1.state="AP";
		moa1.street="beasant road";
		Company moc1=new Company();
		moc1.id=5000;
		moc1.name="mouse1";
		moc1.email="mouse1@gmail.com";
		moc1.addr=moa1;
		Bill mob1=new Bill();
		mob1.baseProdructPrice=500;
		mob1.centralTax=2;
		mob1.finalPrice=1000;
		mob1.number=50;
		mob1.serviceTax=5;
		mob1.stateTax=10;
		mob1.transportTax=15;
		
		
		Mouse mo1=new Mouse();
		mo1.id=1;
		mo1.cmpy=kc1;
		mo1.qualityRating=0.9f;
		mo1.warratyPeriod=3;
		mo1.finalBill=mob1;
		mo1.type="wireless";
		comp1.mouse=mo1;
		//comp1.display();
		
		//RAM
		Address ra1=new Address();
		ra1.city="vellore";
		ra1.pin=76543;
		ra1.state="Tamil nadu";
		ra1.street="udappam";
		Company rc1=new Company();
		rc1.id=500;
		rc1.name="ram1";
		rc1.email="ram1@gmail.com";
		rc1.addr=ca1;
		Bill rb1=new Bill();
		rb1.baseProdructPrice=200;
		rb1.centralTax=2;
		rb1.finalPrice=400;
		rb1.number=10;
		rb1.serviceTax=5;
		rb1.stateTax=10;
		rb1.transportTax=15;
		
		
		RAM r1=new RAM();
		r1.id=1;
		r1.cmpy=rc1;
		r1.qualityRating=0.5f;
		r1.warratyPeriod=10;
		r1.finalBill=rb1;
		r1.capacity=1;
		comp1.ram=r1;
		//comp1.display();
		
		//monitor
		Address mna1=new Address();
		mna1.city="tirupathi";
		mna1.pin=98760;
		mna1.state="AP";
		mna1.street="Swamy";
		Company mnc1=new Company();
		mnc1.id=11000;
		mnc1.name="monitor1";
		mnc1.email="mon1@gmail.com";
		mnc1.addr=mna1;
		Bill mnb1=new Bill();
		mnb1.baseProdructPrice=50000;
		mnb1.centralTax=20;
		mnb1.finalPrice=60000;
		mnb1.number=20;
		mnb1.serviceTax=15;
		mnb1.stateTax=20;
		mnb1.transportTax=5;
		
		
		Monitor mn1=new Monitor();
		mn1.id=1;
		mn1.cmpy=mnc1;
		mn1.qualityRating=0.7f;
		mn1.warratyPeriod=8;
		mn1.finalBill=mnb1;
		mn1.width=10;
		mn1.height=15;
		comp1.monitor=mn1;
		comp1.display();
		
		
		
		System.out.println("Second computer details");
		Computer comp2=new Computer();
		//mother board
		Address ma2=new Address();
		ma2.city="Nagpur";
		ma2.pin=440010;
		ma2.state="maharashtra";
		ma2.street="buldi";
		Company mc2=new Company();
		mc2.id=100;
		mc2.name="monitor1";
		mc2.email="m1@gmail.com";
		mc2.addr=ma2;
		Bill mb2=new Bill();
		mb2.baseProdructPrice=1000;
		mb2.centralTax=10;
		mb2.finalPrice=20000;
		mb2.number=11;
		mb2.serviceTax=15;
		mb2.stateTax=20;
		mb2.transportTax=3;
		
		
		MotherBoard m2=new MotherBoard();
		m2.id=1;
		m2.cmpy=mc2;
		m2.qualityRating=10f;
		m2.warratyPeriod=3;
		m2.finalBill=mb2;
		comp2.mb=m2;
		
		
		
		
		//keyboard
		
		Address ka2=new Address();
		ka2.city="hyderabad";
		ka2.pin=040;
		ka2.state="telangana";
		ka2.street="kphb";
		Company kc2=new Company();
		kc2.id=1000;
		kc2.name="keyboard1";
		kc2.email="kb1@gmail.com";
		kc2.addr=ka2;
		Bill kb2=new Bill();
		kb2.baseProdructPrice=2000;
		kb2.centralTax=9;
		kb2.finalPrice=15000;
		kb2.number=21;
		kb2.serviceTax=17;
		kb2.stateTax=10;
		kb2.transportTax=5;
		
		
		KeyBoard k2=new KeyBoard();
		k2.id=1;
		k2.cmpy=kc2;
		k2.qualityRating=0.9f;
		k2.warratyPeriod=3;
		k2.finalBill=kb2;
		comp2.kb=k2;
		//comp1.display();
		

		//CPU
		Address ca2=new Address();
		ca2.city="hyd";
		ca2.pin=040;
		ca2.state="telangana";
		ca2.street="SRnagar";
		Company cc2=new Company();
		cc2.id=5000;
		cc2.name="cpu1";
		cc2.email="cpu1@gmail.com";
		cc2.addr=ca2;
		Bill cb2=new Bill();
		cb2.baseProdructPrice=500;
		cb2.centralTax=2;
		cb2.finalPrice=1000;
		cb2.number=50;
		cb2.serviceTax=5;
		cb2.stateTax=10;
		cb2.transportTax=15;
		
		
		CPU c2=new CPU();
		c2.id=1;
		c2.cmpy=kc1;
		c2.qualityRating=0.9f;
		c2.warratyPeriod=3;
		c2.finalBill=kb2;
		c2.speed="1MBPS";
		c2.type="I3";				
		comp2.cpu=c2;
		//comp1.display();
		
		
		//mouse 2
		Address moa2=new Address();
		moa2.city="vijayawada";
		moa2.pin=866;
		moa2.state="AP";
		moa2.street="beasant road";
		Company moc2=new Company();
		moc2.id=5000;
		moc2.name="mouse1";
		moc2.email="mouse1@gmail.com";
		moc2.addr=moa2;
		Bill mob2=new Bill();
		mob2.baseProdructPrice=500;
		mob2.centralTax=2;
		mob2.finalPrice=1000;
		mob2.number=50;
		mob2.serviceTax=5;
		mob2.stateTax=10;
		mob2.transportTax=15;
		
		
		Mouse mo2=new Mouse();
		mo2.id=1;
		mo2.cmpy=kc2;
		mo2.qualityRating=0.9f;
		mo2.warratyPeriod=3;
		mo2.finalBill=mob2;
		mo2.type="wireless";
		comp2.mouse=mo2;
		//comp1.display();
		
		//RAM
		Address ra2=new Address();
		ra2.city="vellore";
		ra2.pin=76543;
		ra2.state="Tamil nadu";
		ra2.street="udappam";
		Company rc2=new Company();
		rc2.id=500;
		rc2.name="ram1";
		rc2.email="ram1@gmail.com";
		rc2.addr=ca2;
		Bill rb2=new Bill();
		rb2.baseProdructPrice=200;
		rb2.centralTax=2;
		rb2.finalPrice=400;
		rb2.number=10;
		rb2.serviceTax=5;
		rb2.stateTax=10;
		rb2.transportTax=15;
		
		
		RAM r2=new RAM();
		r2.id=1;
		r2.cmpy=rc1;
		r2.qualityRating=0.5f;
		r2.warratyPeriod=10;
		r2.finalBill=rb2;
		r2.capacity=1;
		comp2.ram=r2;
		//comp1.display();
		
		//monitor
		Address mna2=new Address();
		mna2.city="tirupathi";
		mna2.pin=98760;
		mna2.state="AP";
		mna2.street="Swamy";
		Company mnc2=new Company();
		mnc2.id=11000;
		mnc2.name="monitor1";
		mnc2.email="mon1@gmail.com";
		mnc2.addr=mna2;
		Bill mnb2=new Bill();
		mnb2.baseProdructPrice=50000;
		mnb2.centralTax=20;
		mnb2.finalPrice=60000;
		mnb2.number=20;
		mnb2.serviceTax=15;
		mnb2.stateTax=20;
		mnb2.transportTax=5;
		
		
		Monitor mn2=new Monitor();
		mn2.id=1;
		mn2.cmpy=mnc1;
		mn2.qualityRating=0.7f;
		mn2.warratyPeriod=8;
		mn2.finalBill=mnb2;
		mn2.width=10;
		mn2.height=15;
		comp2.monitor=mn2;
		comp2.display();
		
		
		System.out.println("third computer details");
		Computer comp3=new Computer();
		//mother board
		Address ma3=new Address();
		ma3.city="Nagpur";
		ma3.pin=440010;
		ma3.state="maharashtra";
		ma3.street="buldi";
		Company mc3=new Company();
		mc3.id=100;
		mc3.name="monitor1";
		mc3.email="m1@gmail.com";
		mc3.addr=ma3;
		Bill mb3=new Bill();
		mb3.baseProdructPrice=1000;
		mb3.centralTax=10;
		mb3.finalPrice=20000;
		mb3.number=11;
		mb3.serviceTax=15;
		mb3.stateTax=20;
		mb3.transportTax=3;
		
		
		MotherBoard m3=new MotherBoard();
		m3.id=1;
		m3.cmpy=mc3;
		m3.qualityRating=10f;
		m3.warratyPeriod=3;
		m3.finalBill=mb3;
		comp3.mb=m3;
		
		
		
		
		//keyboard
		
		Address ka3=new Address();
		ka3.city="hyderabad";
		ka3.pin=040;
		ka3.state="telangana";
		ka3.street="kphb";
		Company kc3=new Company();
		kc3.id=1000;
		kc3.name="keyboard1";
		kc3.email="kb1@gmail.com";
		kc3.addr=ka3;
		Bill kb3=new Bill();
		kb3.baseProdructPrice=2000;
		kb3.centralTax=9;
		kb3.finalPrice=15000;
		kb3.number=21;
		kb3.serviceTax=17;
		kb3.stateTax=10;
		kb3.transportTax=5;
		
		
		KeyBoard k3=new KeyBoard();
		k3.id=1;
		k3.cmpy=kc1;
		k3.qualityRating=0.9f;
		k3.warratyPeriod=3;
		k3.finalBill=kb3;
		comp3.kb=k3
				;
		//comp1.display();
		

		//CPU
		Address ca3=new Address();
		ca3.city="hyd";
		ca3.pin=040;
		ca3.state="telangana";
		ca3.street="SRnagar";
		Company cc3=new Company();
		cc3.id=5000;
		cc3.name="cpu1";
		cc3.email="cpu1@gmail.com";
		cc3.addr=ca3;
		Bill cb3=new Bill();
		cb3.baseProdructPrice=500;
		cb3.centralTax=2;
		cb3.finalPrice=1000;
		cb3.number=50;
		cb3.serviceTax=5;
		cb3.stateTax=10;
		cb3.transportTax=15;
		
		
		CPU c3=new CPU();
		c3.id=1;
		c3.cmpy=cc3;
		c3.qualityRating=0.9f;
		c3.warratyPeriod=3;
		c3.finalBill=cb3;
		c3.speed="1MBPS";
		c3.type="I3";				
		comp3.cpu=c3;
		//comp1.display();
		
		
		//mouse
		Address moa3=new Address();
		moa3.city="vijayawada";
		moa3.pin=866;
		moa3.state="AP";
		moa3.street="beasant road";
		Company moc3=new Company();
		moc3.id=5000;
		moc3.name="mouse1";
		moc3.email="mouse1@gmail.com";
		moc3.addr=moa3;
		Bill mob3=new Bill();
		mob3.baseProdructPrice=500;
		mob3.centralTax=2;
		mob3.finalPrice=1000;
		mob3.number=50;
		mob3.serviceTax=5;
		mob3.stateTax=10;
		mob3.transportTax=15;
		
		
		Mouse mo3=new Mouse();
		mo3.id=1;
		mo3.cmpy=moc3;
		mo3.qualityRating=0.9f;
		mo3.warratyPeriod=3;
		mo3.finalBill=mob3;
		mo3.type="wireless";
		comp3.mouse=mo3;
		//comp1.display();
		
		//RAM
		Address ra3=new Address();
		ra3.city="vellore";
		ra3.pin=76543;
		ra3.state="Tamil nadu";
		ra3.street="udappam";
		Company rc3=new Company();
		rc3.id=500;
		rc3.name="ram1";
		rc3.email="ram1@gmail.com";
		rc3.addr=ra3;
		Bill rb3=new Bill();
		rb3.baseProdructPrice=200;
		rb3.centralTax=2;
		rb3.finalPrice=400;
		rb3.number=10;
		rb3.serviceTax=5;
		rb3.stateTax=10;
		rb3.transportTax=15;
		
		
		RAM r3=new RAM();
		r3.id=1;
		r3.cmpy=rc3;
		r3.qualityRating=0.5f;
		r3.warratyPeriod=10;
		r3.finalBill=rb3;
		r3.capacity=1;
		comp3.ram=r3;
		//comp1.display();
		
		//monitor
		Address mna3=new Address();
		mna3.city="tirupathi";
		mna3.pin=98760;
		mna3.state="AP";
		mna3.street="Swamy";
		Company mnc3=new Company();
		mnc3.id=11000;
		mnc3.name="monitor1";
		mnc3.email="mon1@gmail.com";
		mnc3.addr=mna3;
		Bill mnb3=new Bill();
		mnb3.baseProdructPrice=50000;
		mnb3.centralTax=20;
		mnb3.finalPrice=60000;
		mnb3.number=20;
		mnb3.serviceTax=15;
		mnb3.stateTax=20;
		mnb3.transportTax=5;
		
		
		Monitor mn3=new Monitor();
		mn3.id=1;
		mn3.cmpy=mnc3;
		mn3.qualityRating=0.7f;
		mn3.warratyPeriod=8;
		mn3.finalBill=mnb3;
		mn3.width=10;
		mn3.height=15;
		comp3.monitor=mn3;
		comp3.display();
		
		
		
		
	}

}
