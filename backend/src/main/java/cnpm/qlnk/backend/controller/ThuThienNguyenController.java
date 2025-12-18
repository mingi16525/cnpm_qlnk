package cnpm.qlnk.backend.controller;

import cnpm.qlnk.backend.entity.ThuThienNguyen;
import cnpm.qlnk.backend.repository.ThuThienNguyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/thu-thien-nguyen")
public class ThuThienNguyenController {

    @Autowired
    private ThuThienNguyenRepository repo;

    @GetMapping
    public List<ThuThienNguyen> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public ThuThienNguyen create(@RequestBody ThuThienNguyen t) {
        return repo.save(t);
    }

    @PutMapping("/{id}")
    public ThuThienNguyen update(@PathVariable Integer id,
                                 @RequestBody ThuThienNguyen t) {
        t.setId(id);
        return repo.save(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repo.deleteById(id);
    }
}
