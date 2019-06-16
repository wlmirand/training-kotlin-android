package william.miranda.playground.student._3HtmlBuilders

import javax.swing.*
import javax.swing.SwingConstants.*

fun main() {
    with(JFrame("Product popularity")) {
        setSize(600, 600)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        add(JScrollPane(JLabel(renderProductTable(), CENTER)))
        isVisible = true
    }
}

