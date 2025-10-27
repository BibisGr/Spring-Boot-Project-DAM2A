package progresa.relacionalclase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import progresa.relacionalclase.entity.Restaurante;

import java.util.List;
import java.util.Optional;


@Service
@Transactional

public class RestauranteService {
    @Autowired
    ResturanteRepositorio resturanteRepositorio;

    public List<Restaurante> list(){
        return resturanteRepositorio.findAll();
    }
    public Optional<Restaurante> getOne(long id){
        return  resturanteRepositorio.findById(id);
    }

    public Optional<Restaurante> getByNombre(String nombre){
        return  resturanteRepositorio.findAllByNombre(nombre);
    }

    public void save (Restaurante restaurante){
        resturanteRepositorio.save(restaurante);
    }
    public void delete (long id){
        resturanteRepositorio.deleteById(id);
    }

    public boolean existsById (long id){
       return resturanteRepositorio.existsById(id);
    }

    public boolean existsByNombre (String nombre){
        return resturanteRepositorio.existsByNombre(nombre);
    }
}
