package ar.edu.unlp.info.oo1.ejercicio2.figuras.Desktop;

public abstract class Cuenta {
	private double saldo;

	public Cuenta() {
		this.setSaldo(0);
	}

	public void depositar(double monto) {
		this.setSaldo(this.getSaldo() + monto);

	}

	public void extraerSinControlar(double monto) {

	}

	protected abstract boolean puedeExtraer(double monto);

	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;

		}
		return false;
	}

	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

/*
 * a) ¿Por qué cree que este ejercicio se llama "Cuenta con ganchos"? 
 * ---por la jerarquia. parte de la implementacion la delegas a un metodo
 * entonces las clases solo redefinen para cambiar la logica q heredan
 * 
 * b) En las implementaciones de los métodos extraer() y transferirACuenta() que
 * se ven en el diagrama, ¿quién es this? ¿Puede decir de qué clase es this?
 * ---this van a ser las clases q implementan la clase abstracta. No puede decir
 * deq clase hasta ejecutar (binding)
 * 
 * c)¿Por qué decidimos que los métodos puedeExtraer() y extraerSinControlar
 * tengan visibilidad "protegido"? 
 * ---la idea es acceder con encapsulamiento dejandolo
 * abierto por si una clase lo qiere redefinir ni tampoco ser privado
 * 
 * d)¿Se puede transferir de una caja de ahorro a una cuenta corriente y
 * viceversa? ¿por qué? Pruébelo! 
 * ---Si puede (prueba pendiente)
 * 
 * e)¿Cómo se declara en Java un método abstracto? 
 * ---poniendo antes la palabra abstract (y sin cuerpo)
 * 
 * f)¿Es obligatorio implementarlos? 
 * ---en este caso si, porqe lo utiliza la misma clase abstracta. 
 * pero no siempre es necesario
 * 
 * g)¿Qué dice el compilador de Java si una subclase no implementa un método
 * abstracto que hereda? 
 * ---no va compilar, por proteccion , tiene q estar definido
 * sino no va saber q hacer
 * 
 */
