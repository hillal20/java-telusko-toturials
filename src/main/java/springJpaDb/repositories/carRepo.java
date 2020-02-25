package springJpaDb.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import springJpaDb.model.car;

import java.util.List;

public interface carRepo extends CrudRepository<car, Integer> { // the primary keys id is type Integer

    /*
    * this interface inherits all the methods from the crude repo
    *
    * if we need more methods which not included in the crude we need to declare them
    * but we need to implement them in a class
    * */

    List<car> findCarsByCountry(String country);
    /* spring boot can read  the camel casing and understand the meaning
     * the secret is that spring ask to start the search method with findBy and end it by the property-name like name or id or country
     */

   List<car> findByIdGreaterThan(Integer id);


   /*
    * we could also search by complex queries but we need to use the @Query()
    * the queries are done by special language called JPQL
   * */
    @Query("from car where country=?1 order by name")
    List <car> findCarsByCountrySorted(String country);




}