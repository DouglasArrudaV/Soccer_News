package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover Mock De Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária Tem Desfalque Importante", "Lorem ipsum quisque augue sagittis blandit, id leo integer fames ut sit, nisi dolor proin vivamus. enim vel interdum curabitur mauris ut praesent proin, nibh torquent cubilia curabitur cursus aliquam sodales, eleifend metus varius venenatis urna etiam. volutpat lectus non mattis curae vivamus donec sodales, erat curabitur ut semper consequat. "));
        news.add(new News("Ferrinha Joga No Sábado", "Lorem ipsum quisque augue sagittis blandit, id leo integer fames ut sit, nisi dolor proin vivamus. enim vel interdum curabitur mauris ut praesent proin, nibh torquent cubilia curabitur cursus aliquam sodales, eleifend metus varius venenatis urna etiam. volutpat lectus non mattis curae vivamus donec sodales, erat curabitur ut semper consequat. "));
        news.add(new News("Copa Do Mundo Feminina Está Terminando", "Lorem ipsum quisque augue sagittis blandit, id leo integer fames ut sit, nisi dolor proin vivamus. enim vel interdum curabitur mauris ut praesent proin, nibh torquent cubilia curabitur cursus aliquam sodales, eleifend metus varius venenatis urna etiam. volutpat lectus non mattis curae vivamus donec sodales, erat curabitur ut semper consequat. "));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}