package com.fastcampus.adminproject.controller;

import com.fastcampus.adminproject.config.SecurityConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("View 컨트롤러 - 댓글 관리")
@Import(SecurityConfig.class)
@WebMvcTest(ArticleCommentManagementController.class)
class ArticleCommentManagementControllerTest {

    private final MockMvc mvc;

    public ArticleCommentManagementControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @Test
    void givenNothing_whenRequestingArticleCommentManagementView_thenReturnsArticleCommentManagementView() throws Exception {
        //Given

        //When & Then
        mvc.perform(get("/management/article-comments/"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(view().name("/management/article-comments/"));
    }
}