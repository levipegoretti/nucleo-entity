package com.levis.usuario;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
public class Usuario implements Serializable {
    
        private static final long serialVersionUID = 1L;
	   
	@Id
	private Long id;
        
        private String descricao;
	

	public Usuario() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
   
}
