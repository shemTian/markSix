package com.tsq;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by tsq on 2018/8/13 23:41.
 * VERSION 1.0.0
 */
@Slf4j
public class TestJsoup {
    @Test
    public void readBaiduTop10() throws IOException {
        Document document = Jsoup.connect("https://top.baidu.com").get();
        Elements topList = document.body().select("#main").select("#hot-list").select("li");
        for (Element element : topList) {
            Element a = element.selectFirst("a");
            String text = a.text();
            log.info(text);
        }
    }
}
