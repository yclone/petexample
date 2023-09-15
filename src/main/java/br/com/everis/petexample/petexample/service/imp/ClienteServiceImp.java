package br.com.everis.petexample.petexample.service.imp;

import br.com.everis.petexample.petexample.model.dto.ClienteDTO;
import br.com.everis.petexample.petexample.model.entity.ClienteEntity;
import br.com.everis.petexample.petexample.repository.ClienteRepositoty;
import br.com.everis.petexample.petexample.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.*;

@Service
public class ClienteServiceImp implements ClienteService {

    private ClienteRepositoty clienteRepositoty;

    public ClienteServiceImp(ClienteRepositoty clienteRepositoty) {
        this.clienteRepositoty = clienteRepositoty;
    }

    @Override
    public ClienteEntity save(ClienteEntity any){
        try {
            if(!clienteRepositoty.existsByEmail(any.getEmail())){
                ClienteEntity clienteEntity = clienteRepositoty.save(any);
                return clienteEntity;
            }
        } catch (ResponseStatusException e){}
        throw new ResponseStatusException(BAD_REQUEST, "Cliente já cadastrasdo");
    }

    @Override
    public List<ClienteEntity> getAllUsers() {
        return clienteRepositoty.findAll();
    }

    @Override
    public Optional<ClienteEntity> getUserById(Long id) {
        return clienteRepositoty.findById(id);
    }

    @Override
    public ResponseEntity<ClienteEntity> updateUser(Long id, ClienteEntity clienteEntity) {
        return null;
    }
}
