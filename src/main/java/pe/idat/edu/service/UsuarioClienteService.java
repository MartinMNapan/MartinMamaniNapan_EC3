package pe.idat.edu.service;

import java.util.List;

import pe.idat.edu.model.UsuarioCliente;

public interface UsuarioClienteService {
	
	void guardarUsuarioCliente(UsuarioCliente usuario);
	void actualizarUsuarioCliente(UsuarioCliente usuario);
	void eliminarUsuarioCliente(Integer id);
	List<UsuarioCliente> listarUsuario();
	UsuarioCliente obtenerUsuarioId(Integer id);

}
