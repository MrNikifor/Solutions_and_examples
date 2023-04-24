package string.string_builder;
/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/

// Решение не даработанно
public class StringBuilderJson {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder("select * from student where");
        String query = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] formatQuerty = query.replace('{','\0')
                .replace('}','\0')
                .replace('"','\0')
                .replace(' ','\0').split(",");

       for (String string : formatQuerty){
           String[] splitStr = string.split(":");
           if(!splitStr[0].equals("null")){
               res.append(splitStr[0] + " " + splitStr[1] + " AND ");
           }
       }
        System.out.println(res);
    }


}
