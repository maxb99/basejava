import  java.io.BufferedReader ;
import  java.io.IOException ;
import  java.io.InputStreamReader ;


    MainArray {
    private  final  static  ArrayStorage  ARRAY_STORAGE  =    ArrayStorage ();

    public  static  void  main ( String [] args ) throws  IOException {
        BufferedReader reader =    BufferedReader (   InputStreamReader ( System . In ));
        Резюме ;
        while ( true ) {
            Система . из . print ( " Введите одну из команд - (список | save uuid | удалить uuid | get uuid | clear | exit): " );
            String [] params = читатель . readLine () . trim () . toLowerCase () . split ( "  " );
            if (params . length <  1  || params . length >  2 ) {
                Система . из . println ( « Неверная команда. » );
                продолжить ;
            }
            String uuid =  null ;
            if (params . length ==  2 ) {
                uuid = params [ 1 ] . стажер ();
            }
            switch (params [ 0 ]) {
                case  " list " :
                    Printall ();
                    перерыв ;
                case  " size " :
                    Система . из . println ( ARRAY_STORAGE . size ());
                    перерыв ;
                case  " save " :
                    r =  новое  резюме ();
                    r . uuid = uuid;
                    ARRAY_STORAGE . сохранить (г);
                    Printall ();
                    перерыв ;
                case  " delete " :
                    ARRAY_STORAGE . удалить (UUID);
                    Printall ();
                    перерыв ;
                case  " get " :
                    Система . из . println ( ARRAY_STORAGE . get (uuid));
                    перерыв ;
                case  " clear " :
                    ARRAY_STORAGE . Чисто();
                    Printall ();
                    перерыв ;
                case  " exit " :
                    возвращение ;
                по умолчанию :
                    Система . из . println ( « Неверная команда. » );
                    перерыв ;
            }
        }
    }

    static  void  printAll () {
        Resume [] all =  ARRAY_STORAGE . получить все();
        Система . из . println ( " ---------------------------- " );
        if (all . length ==  0 ) {
            Система . из . println ( « Пусто » );
        } else {
            для ( Resume r : all) {
                Система . из . Println (г);
            }
        }
        Система . из . println ( " ---------------------------- " );
    }
}
