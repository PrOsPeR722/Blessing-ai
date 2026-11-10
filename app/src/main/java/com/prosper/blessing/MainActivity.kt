package com.prosper.blessing

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(30, 40, 30, 30)
        layout.setBackgroundColor(Color.rgb(15, 20, 35))

        val title = TextView(this)
        title.text = "BLESSING AI"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER
        layout.addView(title)

        val subtitle = TextView(this)
        subtitle.text = "Your personal AI assistant"
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER
        layout.addView(subtitle)

        val message = TextView(this)
        message.text = "Hello! I'm BLESSING. How can I help you?"
        message.textSize = 18f
        message.setTextColor(Color.WHITE)
        message.setPadding(0, 50, 0, 30)
        layout.addView(message)

        val input = EditText(this)
        input.hint = "Type your message..."
        input.setTextColor(Color.BLACK)
        input.setHintTextColor(Color.GRAY)
        input.setSingleLine(true)
        layout.addView(input)

        val send = Button(this)
        send.text = "SEND"
        layout.addView(send)

        send.setOnClickListener {
            val question = input.text.toString().trim()
            if (question.isNotEmpty()) {
                message.text = "You: $question\n\nBLESSING: AI connection coming soon!"
                input.text.clear()
            }
        }

        setContentView(layout)
    }
}
