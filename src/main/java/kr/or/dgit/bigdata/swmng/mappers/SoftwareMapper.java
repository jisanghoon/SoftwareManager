package kr.or.dgit.bigdata.swmng.mappers;

import java.util.List;

import kr.or.dgit.bigdata.swmng.dto.Software;

public interface SoftwareMapper<T> {
	void insertItem(T item);

	void deleteItem(int idx);

	void updateItem(T item);

	T selectByNo(int idx);

	List<T> selectAll();

	T selectMaxNo();

	List<T> selectCategory();
	
	List<T> selectTitle();
	
	List<T> selectTitleJoinSale(String item);
	

	//곽문한 추가//
	List<T> selectSoftwareBytitle(); // ok
	
	List<T> softwareViewAll();  // ok
	
	List<T> softwareViewBytitle(Software software);
	Software selectSWBytitle(String title);
	Software selectAllByTitle(String title);
	
}
