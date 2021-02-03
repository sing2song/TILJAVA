package p196;

class Cpu{
	public Cpu(){
		System.out.println("Cpu입니다");
	}
}
class MainBorad{
	public MainBorad(){
		System.out.println("MainBorad입니다");
	}
}
class Computer{
	private Cpu cpuinComputer;
	private MainBorad mainboradinComputer;
	public Computer(Cpu cpu, MainBorad
			mainborad){
		cpuinComputer = cpu;
		mainboradinComputer = mainborad;
	}
}

public class ComputerTest {
	public static void main(String[] args){
		Cpu cpu = new Cpu();
		MainBorad mainborad = new MainBorad();
		Computer computer = new Computer(cpu,
				mainborad);
	}
}
