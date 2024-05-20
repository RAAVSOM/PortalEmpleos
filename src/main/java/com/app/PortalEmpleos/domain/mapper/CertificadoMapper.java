package com.app.PortalEmpleos.domain.mapper;

import com.app.PortalEmpleos.domain.dto.CertificadoDTO;
import com.app.PortalEmpleos.persistence.entity.Certificado;

public class CertificadoMapper {
    public static CertificadoDTO toDto(Certificado certificado){
        CertificadoDTO certificadoDTO = new CertificadoDTO();
        certificadoDTO.setProfesional(certificado.getProfesional());
        certificadoDTO.setCertificado(certificado.getCertificado());
        certificadoDTO.setId_certificado(certificado.getId_certificado());
        return certificadoDTO;
    }
    
    public static Certificado toEntity(CertificadoDTO certificadoDTO){
        Certificado certificado = new Certificado();
        certificado.setProfesional(certificadoDTO.getProfesional());
        certificado.setCertificado(certificadoDTO.getCertificado());
        certificado.setId_certificado(certificadoDTO.getId_certificado());
        return certificado;
    }
}
