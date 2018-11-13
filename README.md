Чтобы скачать из Github проекта запускаем команду:
	git clone https://github.com/shuhratjan/HelloWorld.git
Заходим в папку:
	HelloWorld
Через Intellij IDEA импортируем проекта

После успешной импорта, откроем файл:
HelloWorld\src\main\java\kz\shuh\Service\MyDb.java
	
Делаем вот это. Изменим в функции connection:
	    String dbName="your_db_name";
            //port to connection mysql
            String port="3306";//default port to MySql

После этого, настроем tomcat И артифакт, и всё запустим проект.
Ждём когда запуститься сервер. После запуска сервера заходим в браузере по адресу:
	http://locahost:8080/
И видим результат.
