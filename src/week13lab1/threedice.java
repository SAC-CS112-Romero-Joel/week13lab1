package week13lab1;

public class threedice {
	int Throw()
	{
		dice D1 = new dice();
		dice D2 = new dice();
		dice D3 = new dice();

		return (D1.Throw() + D2.Throw() + D3.Throw()) / 3;
	}
}
