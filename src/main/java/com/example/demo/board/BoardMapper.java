package com.example.demo.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.example.demo.board.Board;

@Mapper
public interface BoardMapper {

	List<Board> findAll();

    List<Board> findByCategoryId(@Param("categoryID") Integer categoryID);

    Board findById(@Param("postID") Integer postID);

    void save(Board board);

	void visitCnt(@Param("postID") Integer postID);
    
}
