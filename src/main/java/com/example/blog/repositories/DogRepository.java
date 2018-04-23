//package com.example.blog.repositories;
//
//import javax.transaction.Transactional;
//
//public interface DogRepository extends CrudRepository<Dog, Long> {
//
//    @Transactional
//    public void deleteById(long id);
//
//    @Query("select age from Dog")
//    public List<Integer> getAges();
//
//}
