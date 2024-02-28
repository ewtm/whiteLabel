package com.ewtm.whitelabel.repositories;

import com.ewtm.whitelabel.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
