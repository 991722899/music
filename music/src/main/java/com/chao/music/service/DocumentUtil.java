package com.chao.music.service;

import java.io.IOException;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class DocumentUtil {
	public Connection getConnection(String url){
		return Jsoup.connect(url);
	}
	
	public Document getDocument(String url) throws IOException{
		return getConnection(url).get();
	}
	
	public Document getDocument(String url,Map<String,String> map) throws IOException{
		return getConnection(url).data(map).get();
	}
	
	public Document postDocument(String url) throws IOException{
		return getConnection(url).post();
	}
	
	public Document postDocument(String url,Map<String,String> map) throws IOException{
		return getConnection(url).data(map).post();
	}
}
