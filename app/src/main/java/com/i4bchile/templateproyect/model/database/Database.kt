package com.i4bchile.templateproyect.model.database



/* Data Access Object  for database. Incluir los métodos para  insertar y consultar los datos


@Dao
interface SuperDao{

    @Insert(onConflict= OnConflictStrategy.REPLACE)
    suspend fun loadAllSuper(heroList:List<SuperHero>)

    @Query("SELECT * FROM superhero")
    fun getAllSuper(): LiveData<List<SuperHero>>

    @Query("SELECT * FROM superhero WHERE id=:superId")
    fun getSuper(superId:Int): LiveData<SuperHero>

}

 */

/* DATABASE

@Database(entities=[SuperHero::class], version=1)
@TypeConverters(Converters::class)
abstract class SuperDatabase: RoomDatabase() {
    abstract fun superDao():SuperDao
}


 */

/* APPLICATION (no olvidar incluir en Manifest)


class [ApplicationName]: Application(){
    companion object{
        var superDatabase:SuperDatabase?=null

    }

    override fun onCreate(){
        super.onCreate()

        superDatabase= Room.databaseBuilder(this,SuperDatabase::class.java,"super_db").build()
    }
}
*/