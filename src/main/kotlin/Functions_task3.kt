fun main() {
    println("Введите строку для шифрования: ")
    val inputString = readln()
    println("Введите код для шифрования: ")
    val enteredCode = readln()
    var code = ""

    while (code.length < inputString.length) {
        code += enteredCode
    }

    val alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"
    for (i in inputString.indices) {
        val begin = findIndex(inputString[i], alphabet)
        val offset = findIndex(code[i], alphabet)
        print(alphabet[(begin + offset) % 33])
    }
}
fun findIndex(ch : Char, alphabet : String) : Int
{
    for (i in alphabet.indices){
        if (ch == alphabet[i])
            return i
    }
    return -1;
}