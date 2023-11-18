var Restart=false;
    fun main() {
        println("Давайте поиграем в 1-Камень 2-Ножницы 3-Бумага.Введите от 1 до 3")
        do{
            var Player = readln().toInt()
            var PC =(1..3).random()
            println(PC)
            Play(Player,PC)
        } while (Restart)
    }
    fun Play(a: Int,b:Int)
    {
        if(a==b)
        {
            println("Ничья")
            Restart=true

        }
        else if(a==1 && b ==3 || a==2 && b==1|| a==3 && b==2)
        {
            println("ПК выйграл")
            Restart=false
        }
        else{
            println("Вы выйграли")
            Restart=false
        }
    }