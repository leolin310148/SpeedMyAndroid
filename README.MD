I'm just a LAZY guy tired of findViewById in android.
===================================

            SpeedView.with(this)
                    .tv(R.id.textView1).text("Hello SpeedView")
                    .and()
                    .tv(R.id.textView2).text(":)").show().text("Amazing!")
                    .and()
                    .btn(R.id.button).text("Click me!")
                    .click(v -> Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show())
                    .and()
                    .container(R.id.container).addView(textView)
                    .and()
                    .list(R.id.listview)
                    .adapter(arrayAdapter)
                    .itemClick((parent, view, position, id) -> Toast.makeText(this, "click position:" + position, Toast.LENGTH_SHORT).show())
                    .and()
                    .view(R.id.textViewWillBeDisappear).hide();