package java_tutorials.interfaces.example2;

interface I3{
	public void X();
}

interface I4 extends I3{
	public void z();
}

class B implements I4{
	public void x() {}
	public void z() {}
}