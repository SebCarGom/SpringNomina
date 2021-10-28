package es.iesoterohernandez.daw.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.iesoterohernandez.daw.demo.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
