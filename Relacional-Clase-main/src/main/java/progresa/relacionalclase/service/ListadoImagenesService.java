package progresa.relacionalclase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import progresa.relacionalclase.dao.ListadoImagenesRepository;
import progresa.relacionalclase.entity.ListadoImgs;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ListadoImagenesService {
    @Autowired
    private ListadoImagenesRepository listadoImagenesRepository;

    public List<ListadoImgs> list(){
        return listadoImagenesRepository.findAll();
    }
    public Optional<ListadoImgs> getById(long id){
        return listadoImagenesRepository.findById(id);
    }
    public Optional<ListadoImgs> getByUrl(String url){
        return listadoImagenesRepository.findByUrl(url);
    }
    public void save(ListadoImgs listadoImgs){
        listadoImagenesRepository.save(listadoImgs);
    }
    public void delete(Long id){
        listadoImagenesRepository.deleteById(id);
    }
    public  boolean existsById(long id){
        return listadoImagenesRepository.existsById(id);
    }
    public  boolean existsByUrl(String url){
        return listadoImagenesRepository.existsByUrl(url);
    }
}
