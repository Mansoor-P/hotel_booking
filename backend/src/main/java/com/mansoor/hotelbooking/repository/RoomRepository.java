package com.mansoor.hotelbooking.repository;

import com.mansoor.hotelbooking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
