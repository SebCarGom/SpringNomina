package es.iesoterohernandez.daw.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import es.iesoterohernandez.daw.demo.modelo.Persona;

public interface IPersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarID(int id);
	public int save(Persona p);
	public void delete(int id);
	
}
