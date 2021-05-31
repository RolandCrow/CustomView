package com.example.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.util.AttributeSet;

import androidx.annotation.Nullable;




public class DurationTextView extends androidx.appcompat.widget.AppCompatTextView { // чтобы создать кастом вью, его нужно унаследовать в коде от простого вью

    private String template;

    public DurationTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.TemplateTextView); // подключаем кастомный шаблон
        template = attributes.getString(R.styleable.TemplateTextView_template);

        if(template == null || !template.contains("%s")) { // если темплейт равен ничему или содержит s то значение берется из s
            template = "%s";

        }
        attributes.recycle(); // высвобождаем ресурсы
    }

    public void setDuration(float duration) {
        int durationInMinutes  = Math.round(duration / 60);
        int hours = durationInMinutes / 60;
        int minutes = durationInMinutes & 60; // остаток от деления на 60

        String hoursText = "";
        String minuteText = "";

        if(hours > 0) {
            hoursText = hours + (hours == 1 ? " hour " : " hours"); // если час один то это час, если много то часов
        }

        if(minutes > 0) {
            minuteText = minutes + (minutes == 1 ? " minute" : " minutes"); // тоже самое
        }

        if(hours == 0 && minutes == 0) {
            minuteText = "less than 1 minute";
        }

        String durationText = String.format(template, hoursText + minuteText);
        setText(Html.fromHtml(durationText), BufferType.SPANNABLE);

    }


}
