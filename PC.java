package LX;

public class PC {
private HardDisk HD;
private CPU cpu;
public PC(){
	
}
public PC(CPU cpu,HardDisk HD) {
	setCPU(cpu);
	setHardDisk(HD);
}

private void setCPU(CPU c) {
	cpu=c;
}
void setHardDisk(HardDisk h) {
	HD=h;
}
void show() {
	System.out.println("The PC attribute(404000 means wrong!):");
	System.out.println("CPU type is "+cpu.getProcessor()+".");
	System.out.println("CPU speed is "+cpu.getSpeed()+" MB/s.");
	System.out.println("CPU hertz is "+cpu.getHertz()+" GHZ.");
	System.out.println("HardDisk is "+HD.getAmount()+" G.");
	System.out.println("HardDisk readspeed is "+HD.getReadSpeed()+" MB/s.");
}
}
