MainTestArrayStorage {
    ArrayStorage  ARRAY_STORAGE  =  новый  ArrayStorage ();

    public  static  void  main ( String [] args ) {
        Резюме r1 =  новое  резюме ();
        r1 . uuid =  " uuid1 " ;
        Резюме r2 =  новое  резюме ();
        r2 . uuid =  " uuid2 " ;
        Резюме r3 =  новое  резюме ();
        r3 . uuid =  " uuid3 " ;

        ARRAY_STORAGE . сохранить (r1);
        ARRAY_STORAGE . сохранить (r2);
        ARRAY_STORAGE . сохранить (r3);

        Система . из . println ( « Получить r1: »  +  ARRAY_STORAGE . get (r1 . uuid));
        Система . из . println ( " Размер: "  +  ARRAY_STORAGE . size ());

        Система . из . println ( « Получить манекен: »  +  ARRAY_STORAGE . get ( « фиктивный » ));

        Printall ();
        ARRAY_STORAGE . delete (r1 . uuid);
        Printall ();
        ARRAY_STORAGE . Чисто();
        Printall ();

        Система . из . println ( " Размер: "  +  ARRAY_STORAGE . size ());
    }

    static  void  printAll () {
        Система . из . println ( " \ n Получить все " );
        for ( Resume r :  ARRAY_STORAGE . getAll ()) {
            Система . из . Println (г);
        }
    }
}
