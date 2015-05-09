I'm just a LAZY guy tired of findViewById in android.
===================================

        // @formatter:off
        SpeedView.with(this)
                .tv(R.id.textView1).text("Hello SpeedView")
                .tv(R.id.textView2).text(":)").show().text("Amazing!")
                .btn(R.id.button).text("Click me!")
                    .click(v -> Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show())
                .container(R.id.container).addView(textView)
                .list(R.id.listview).adapter(arrayAdapter)
                    .itemClick((parent, view, position, id) -> Toast.makeText(this, "click position:" + position, Toast.LENGTH_SHORT).show())
                .view(R.id.textViewWillBeDisappear).hide();