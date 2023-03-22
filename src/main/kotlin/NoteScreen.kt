import java.util.Scanner

class NoteScreen(private val note: Notes, private val parent: OpenNote) {
    fun show() {
        while (true) {
            println("Заметка:${note.noteName}\n" +
                    "Текст заметки:\n${note.text}\n" +
                    "Для выхода из заметки введите любое значение")
            Scanner(System.`in`).nextLine()
            parent.show()
        }
    }
}