import  java.util.Arrays ;

открытый  класс  ArrayStorage {

    private  Resume [] storage =  new  Resume [ 10000 ];
    private  int sizeOfResume =  0 ;

    void  clear () {
        for ( int i =  0 ; i < sizeOfResume; i ++ ) {
            storage [size - 1 ] =  null ;
        }
        sizeOfResume =  0 ;
    }

    void  save ( Resume  r ) {
        for ( int i =  0 ; i < sizeOfResume; i ++ ) {
            if (storage [i] . uuid . equals (r . uuid)) {
                Система . из . println ( « Resume »  + r . uuid +  « Putted » );
               
            }
        }
        if (sizeOfResume < длина хранения . ) {
            storage [sizeOfResume] = r;
            sizeOfResume ++ ;
        } else  if (sizeOfResume == storage . length) {
            Система . из . println (  "Полный массив" );
        }
    }

     void  update ( Resume  r ) {
        get ([]) = r;
        Система . из . println ( "Resume"  + r . uuid +  "Изменено на"  + r . uuid);
    }

    Резюме  get ( String  uuid ) {
        for ( int i =  0 ; i < sizeOfResume; i ++ ) {
           if (storage [i] . uuid . equals (uuid)) {
                return storage [size - 1 ] =  null ;
            }
        }
        Система . из . println (  "Резюме"  + uuid +  "Нет" );
        return  null ;
    }

    void  delete ( String  uuid ) {
        {
            Система . из . println ( "Резюме"  + uuid +  "Нет" );
        }
    }


    Resume [] getAll () {
        return  Массивы . copyOfRange (storage, 0 , sizeOfResume);
    }

}
