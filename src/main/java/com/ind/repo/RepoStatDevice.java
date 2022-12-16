package com.ind.repo;

import com.ind.models.Devices;
import com.ind.models.StatDevices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoStatDevice extends JpaRepository<StatDevices, Long> {
    StatDevices findByDevice(Devices devices);
    void deleteByDevice(Devices devices);
    List<StatDevices> findAllByDeviceIn(List<Devices> devices);
}
