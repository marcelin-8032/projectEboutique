package fr.spring.eBoutique.project.dao;


import fr.spring.eBoutique.project.model.Article;

import java.util.List;

public interface IArticleDAO {

    List<Article> getArticles(Integer idUtilisateur);

    Article addArticle(Article article);

    void removeArticle(Long id);

    void clear(Long idUtilisateur);


}
