package com.tvnsoftware.newyorktimes.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by TamHH on 6/23/2017.
 */

public class Doc implements Serializable {
    @SerializedName("web_url")
    private String webUrl;
    @SerializedName("snippet")
    private String snippet;
    @SerializedName("lead_paragraph")
    private String leadParagraph;
    @SerializedName("source")
    private String source;
    @SerializedName("multimedia")
    private List<Multimedia> multimedia;
//    private Headline headline;

    @SerializedName("pub_date")
    private String pubDate;
    @SerializedName("document_type")
    private String documentType;
    @SerializedName("news_desk")
    private String newsDesk;
    @SerializedName("section_name")
    private String sectionName;
    @SerializedName("subsection_name")
    private String subsectionName;
//    private Byline byline;
    @SerializedName("type_of_material")
    private String typeOfMaterial;
    @SerializedName("_id")
    private String id;
    @SerializedName("word_count")
    private int wordCount;

    public Doc() {
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getLeadParagraph() {
        return leadParagraph;
    }

    public void setLeadParagraph(String leadParagraph) {
        this.leadParagraph = leadParagraph;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getNewsDesk() {
        return newsDesk;
    }

    public void setNewsDesk(String newsDesk) {
        this.newsDesk = newsDesk;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSubsectionName() {
        return subsectionName;
    }

    public void setSubsectionName(String subsectionName) {
        this.subsectionName = subsectionName;
    }



    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public List<Multimedia> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(List<Multimedia> multimedia) {
        this.multimedia = multimedia;
    }
}
