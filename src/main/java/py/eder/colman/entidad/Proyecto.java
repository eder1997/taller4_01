package py.eder.colman.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Proyecto {
		@Id
		@GeneratedValue
		private int codigo;
		private String descripcion;
		@ManyToOne
		private Encargado encargado;
		public Proyecto() {
			// TODO Auto-generated constructor stub
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public Encargado getEncargado() {
			return encargado;
		}
		public void setEncargado(Encargado encargado) {
			this.encargado = encargado;
		}
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		}
	
}
