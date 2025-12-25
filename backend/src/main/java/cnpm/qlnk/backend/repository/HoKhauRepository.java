package cnpm.qlnk.backend.repository;

import org.springframework.stereotype.Repository;
import cnpm.qlnk.backend.entity.HoKhau;
import cnpm.qlnk.backend.entity.NhanKhau;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface HoKhauRepository extends JpaRepository<HoKhau, Integer> {

    Optional<NhanKhau> findByChuHo_Id(Integer id);

    Optional<HoKhau> findByMaSoHo(String maSoHo);

}