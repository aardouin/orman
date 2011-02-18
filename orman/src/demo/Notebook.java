package demo;

import org.orman.mapper.Model;
import org.orman.mapper.annotation.Entity;
import org.orman.mapper.annotation.Id;
import org.orman.mapper.annotation.NotNull;
import org.orman.mapper.annotation.OneToOne;

@Entity
public class Notebook extends Model<Notebook>{
	@Id public Object id;
	@NotNull @OneToOne public User whose;
	
	public Notebook(User u){
		this.whose=u;
	}
}