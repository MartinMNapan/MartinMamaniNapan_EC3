package pe.idat.edu.service;

import java.util.List;

import pe.idat.edu.dto.HospitalDTORequest;
import pe.idat.edu.dto.HospitalDTOResponse;

public interface HospitalService {
	void guardarHospital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospital();
	HospitalDTOResponse obtenerHospitalId(Integer id);

}
