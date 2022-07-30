package co.edu.iudigital.service;

import java.util.List;

import co.edu.iudigital.dto.CasoDTO;


public interface ICasoService {
	
	//consulta casos
	List<CasoDTO> findAll();
	
	//crear un caso
	CasoDTO save(CasoDTO caso);
	
	//inactivar un caso
	Boolean visible(Boolean visible, Long id);
	
	//consultar caso por id
	CasoDTO findById(Long id);

}
