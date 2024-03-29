package com.smartscore.board.caching;

public interface BookRepository {

	Book getByIsbn(String isbn);

}
